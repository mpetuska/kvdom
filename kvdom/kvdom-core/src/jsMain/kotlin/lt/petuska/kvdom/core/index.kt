package lt.petuska.kvdom.core

import lt.petuska.kvdom.core.domain.*
import lt.petuska.kvdom.core.module.*
import org.w3c.dom.*
import kotlin.dom.*
import kotlin.math.*


typealias Patch<T> = T?.(newVElement: T?) -> T?

private fun Array<out Module<*>>.assertDistinct() = groupBy { it.id }
  .filterValues { it.size > 1 }
  .takeIf { it.isNotEmpty() }
  ?.let {
    val error = buildString {
      appendLine("Duplicate Module IDs found")
      it.forEach { (id, modules) ->
        appendLine("ID: $id; Modules: ${modules.joinToString { it::class.simpleName ?: "UNKNOWN" }}")
      }
    }
    console.error(error)
    throw IllegalArgumentException(error)
  }

private fun Array<out Module<*>>.pre() = forEach { it.pre() }
private fun Array<out Module<*>>.create(vElement: VElement<*>, ref: Element) =
  forEach { it.create(vElement, ref, vElement.getModuleData(it.id)) }

private fun Array<out Module<*>>.destroy(vElement: VElement<*>) =
  forEach { it.destroy(vElement, vElement.getModuleData(it.id)) }

private fun Array<out Module<*>>.post() = forEach { it.post() }


fun <T : Element> kvdom(container: Element, vararg modules: Module<*>): Patch<VElement<T>> {
  modules.assertDistinct()
  val str = modules.joinToString { it.id }
  val test = modules.groupBy { it.id }
    .filterValues { it.size > 1 }.size
  
  fun <T : Node> VNode<T>.createNode(insertedVElementQueue: MutableList<Pair<VElement<*>, *>>): T {
    val dNode = when (this) {
      is VText -> this.render().also {
        this.ref = it
      }
      is VElement -> {
        this.hooks.init?.invoke(this)
        val children = this.children
        val dElm = this.render()
        this.ref = dElm
        children.forEach {
          dElm.appendChild(it.createNode(insertedVElementQueue))
        }
        modules.create(this, dElm as Element)
        this.hooks.let {
          it.create?.invoke(this, dElm)
          if (it.insert != null) {
            insertedVElementQueue.add(this to dElm)
          }
        }
        dElm
      }
      else -> throw IllegalArgumentException("VNode ${this::class.simpleName} not supported")
    }
    
    @Suppress("UNCHECKED_CAST")
    return dNode as T
  }
  
  fun <T : Element> VElement<T>.invokeDestroyHook() {
    hooks.destroy?.invoke(this)
    modules.destroy(this)
    children.forEach {
      if (it is VElement<*>) it.invokeDestroyHook()
    }
  }
  
  fun <T : Element> VElement<T>.remove(cbChain: MutableList<() -> Unit>) {
    invokeDestroyHook()
    modules.forEach { module: Module<*> ->
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
  
  fun <T : Node> VNode<T>.remove() {
    val chain = mutableListOf<() -> Unit>({
      val ref = ref
      ref?.parentNode?.removeChild(ref)
    })
    if (this is VElement<*>) remove(chain)
    
    chain.last()()
  }
  
  fun VElement<*>.removeVNodes(start: Int, end: Int, vararg nodes: VNode<*>) {
    require(start <= end)
    for (i in start until min(end, nodes.size)) {
      nodes[i].remove()
    }
  }
  
  fun <T : Element> VElement<T>.patch(
    newVElement: VElement<T>,
    insertedVElementQueue: MutableList<Pair<VElement<*>, *>>,
  ) {
    //TODO
  }
  
  return { newVElement ->
    val insertedVElementQueue = mutableListOf<Pair<VElement<Element>, Element>>()
    modules.pre()
    
    when {
      newVElement == null -> {
        // Unmount
        this?.remove()
      }
      this == null -> {
        // Mount
        container.clear()
        @Suppress("UNCHECKED_CAST")
        val dNode = newVElement.createNode(insertedVElementQueue as MutableList<Pair<VElement<*>, *>>)
        container.appendChild(dNode)
      }
      else -> {
        @Suppress("UNCHECKED_CAST")
        patch(newVElement, insertedVElementQueue as MutableList<Pair<VElement<*>, *>>)
      }
    }
    
    insertedVElementQueue.forEach { it.first.hooks.insert?.invoke(it.first, it.second) }
    modules.post()
    newVElement
  }
}
