package lt.petuska.kvdom.core

import lt.petuska.kvdom.core.domain.*
import lt.petuska.kvdom.core.module.*
import lt.petuska.kvdom.dom.*
import lt.petuska.kvdom.dom.html.*

typealias Patch<T> = T?.(newVElement: T?) -> T?

private fun Array<out Module<*>>.pre() = forEach { it.pre() }
private fun Array<out Module<*>>.create(vElement: VElement<*>, ref: Element) =
  forEach {
    if (vElement.getModuleData<ModuleData>(it.id) == null) {
      it.defaultModuleData()?.let { md ->
        vElement._data[it.id] = md
      }
    }
    it.create(vElement, ref)
  }

private fun Array<out Module<*>>.update(oldVElement: VElement<*>, nevVElement: VElement<*>) =
  forEach {
    if (nevVElement.getModuleData<ModuleData>(it.id) == null) {
      it.defaultModuleData()?.let { md ->
        nevVElement._data[it.id] = md
      }
    }
    it.update(nevVElement, oldVElement, nevVElement.getModuleData(it.id))
  }

private fun Array<out Module<*>>.destroy(vElement: VElement<*>) =
  forEach { it.destroy(vElement, vElement.getModuleData(it.id)) }

private fun Array<out Module<*>>.post() = forEach { it.post() }

fun kvdom(container: Element, vararg modules: Module<*>) = kvdom<HTMLDivElement>(container, *modules)

fun <T : Element> kvdom(container: Element, vararg modules: Module<*>): Patch<VElement<T>> {
  val mods = run {
    val tmp = mutableListOf(*modules)
    tmp.reverse()
    fun Module<*>.resolveDependencies(moduleList: MutableList<Module<*>>) {
      dependencies.forEach { dep ->
        if (moduleList.none { m -> m.id == dep.id }) {
          moduleList.add(dep)
          dep.resolveDependencies(moduleList)
        }
      }
    }
    modules.forEach {
      it.resolveDependencies(tmp)
    }
    tmp.reverse()
    tmp.distinctBy { it.id }.toTypedArray()
  }

  fun <T : Element> VElement<T>.createElement(insertedVElementQueue: MutableList<Pair<VElement<*>, *>>): T {
    this.hooks.init?.invoke(this)
    val children = this.children
    val dElm = this.render()
    this.ref = dElm
    children.forEach {
      dElm.appendChild(it.createElement(insertedVElementQueue))
    }
    mods.create(this, dElm as Element)
    this.hooks.let {
      it.create?.invoke(this, dElm)
      if (it.insert != null) {
        insertedVElementQueue.add(this to dElm)
      }
    }

    return dElm
  }

  fun <T : Element> VElement<T>.invokeDestroyHook() {
    hooks.destroy?.invoke(this)
    mods.destroy(this)
    children.forEach {
      it.invokeDestroyHook()
    }
  }

  fun <T : Element> VElement<T>.remove(cbChain: MutableList<() -> Unit>) {
    invokeDestroyHook()
    mods.forEach { module: Module<*> ->
      val next = cbChain.size - 1
      cbChain.add {
        @Suppress("UNCHECKED_CAST")
        module.remove.invoke(this as VElement<out Element>, cbChain[next], this.getModuleData(module.id))
      }
    }
    hooks.remove?.let {
      val next = cbChain.size - 1
      cbChain.add {
        it(this, cbChain[next])
      }
    }
  }

  fun <T : Element> VElement<T>.remove() {
    val chain = mutableListOf<() -> Unit>({
      val ref = ref
      ref?.parentNode?.removeChild(ref)
    })
    remove(chain)

    chain.last()()
  }

  fun <T : Element> VElement<T>.patchAttrs(newVElement: VElement<T>) {
    val elm = newVElement.ref!!
    fun Element.setAttr(key: String, value: String) {
      when {
        value.equals("true", true) -> setAttribute(key, "")
        value.equals("false", true) -> removeAttribute(key)
        else -> setAttribute(key, value)
      }
    }

    val oldAttrs = HashMap(attrs)
    newVElement.attrs.forEach { (attr, value) ->
      if (oldAttrs[attr] != value) {
        elm.setAttr(attr, value)
      }
      oldAttrs.remove(attr)
    }
    oldAttrs.forEach { (attr) ->
      elm.removeAttribute(attr)
    }
  }

  fun <T : Element> VElement<T>.patch(
    newVElement: VElement<T>,
    insertedVElementQueue: MutableList<Pair<VElement<*>, *>>,
  ) {
    val hooks = newVElement.hooks
    hooks.prePatch?.invoke(newVElement, this)
    newVElement.ref = ref!!
    val elm = newVElement.ref as T
    if (tag != newVElement.tag) {
      elm.parentNode!!.appendChild(newVElement.createElement(insertedVElementQueue))
      remove()
    } else {
      val oldCh = children
      val newCh = newVElement.children
      mods.update(this, newVElement)
      patchAttrs(newVElement)
      when {
        oldCh.isNotEmpty() && newCh.isNotEmpty() -> {
          oldCh.zip(newCh).forEach { (old, new) ->
            @Suppress("UNCHECKED_CAST")
            (old as VElement<Element>).patch(new as VElement<Element>, insertedVElementQueue)
          }
          if (oldCh.size > newCh.size) {
            oldCh.subList(newCh.size, oldCh.size).forEach { it.remove() }
          } else if (newCh.size > oldCh.size) {
            newCh.subList(oldCh.size, newCh.size).forEach {
              elm.appendChild(it.createElement(insertedVElementQueue))
            }
          }
        }
        newCh.isNotEmpty() -> {
          newCh.forEach {
            elm.appendChild(it.createElement(insertedVElementQueue))
          }
        }
        oldCh.isNotEmpty() -> {
          oldCh.forEach { it.remove() }
        }
      }
      if (textContent != newVElement.textContent) {
        elm.textContent = newVElement.textContent
      }
    }

    hooks.postPatch?.invoke(newVElement, this)
  }

  return { newVElement ->
    val insertedVElementQueue = mutableListOf<Pair<VElement<Element>, Element>>()
    mods.pre()

    when {
      newVElement == null -> {
        // Unmount
        this?.remove()
      }
      this == null -> {
        // Mount
        container.clear()
        @Suppress("UNCHECKED_CAST")
        val dNode = newVElement.createElement(insertedVElementQueue as MutableList<Pair<VElement<*>, *>>)
        container.appendChild(dNode)
      }
      else -> {
        @Suppress("UNCHECKED_CAST")
        patch(newVElement, insertedVElementQueue as MutableList<Pair<VElement<*>, *>>)
      }
    }

    insertedVElementQueue.forEach { it.first.hooks.insert?.invoke(it.first, it.second) }
    mods.post()
    newVElement
  }
}
