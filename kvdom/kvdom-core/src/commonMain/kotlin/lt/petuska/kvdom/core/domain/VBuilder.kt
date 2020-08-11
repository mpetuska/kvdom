package lt.petuska.kvdom.core.domain

import lt.petuska.kvdom.core.*
import lt.petuska.kvdom.core.module.*
import lt.petuska.kvdom.dom.*
import lt.petuska.kvdom.dom.html.*

inline fun <T : Element> VBuilder(
  tag: String,
  attrs: MutableMap<String, String> = mutableMapOf(),
  data: MutableMap<String, ModuleData> = mutableMapOf(),
  hooks: VBuilder.VElementHooksBuilder<T> = VBuilder.VElementHooksBuilder(),
  key: String? = null,
  ns: String? = null,
  children: MutableList<VBuilder<*>> = mutableListOf(),
  textContent: String? = null,
  block: VBuilder<T>.() -> Unit,
) = VBuilder(tag, attrs, data, hooks, key, ns, children, textContent).apply(block)

open class VBuilder<T : Element> constructor(
  val tag: String,
  val attrs: MutableMap<String, String> = mutableMapOf(),
  val data: MutableMap<String, ModuleData> = mutableMapOf(),
  val hooks: VElementHooksBuilder<T> = VElementHooksBuilder(),
  var key: String? = null,
  var ns: String? = null,
  val children: MutableList<VBuilder<*>> = mutableListOf(),
  var textContent: String? = null,
) {
  @Suppress("UNCHECKED_CAST")
  fun <T : ModuleData> getModuleData(moduleId: String, default: T? = null): T? =
    data[moduleId] as? T ?: default?.also {
      data[moduleId] = it
    }

  operator fun String?.unaryPlus() {
    textContent = this
  }

  fun build(): VElement<T> = VElement(
    tag,
    attrs,
    data,
    hooks.build(),
    key,
    ns,
    children.map(VBuilder<*>::build).toMutableList(),
    textContent,
    null
  )

  data class VElementHooksBuilder<T : Element>(
    override var init: (VElement<T>.() -> Unit)? = null,
    override var create: (VElement<T>.(ref: T) -> Unit)? = null,
    override var insert: (VElement<T>.(ref: T) -> Unit)? = null,
    override var prePatch: (VElement<T>.(oldVNode: VElement<T>) -> Unit)? = null,
    override var update: (VElement<T>.(oldVNode: VElement<T>) -> Unit)? = null,
    override var postPatch: (VElement<T>.(oldVNode: VElement<T>) -> Unit)? = null,
    override var destroy: (VElement<T>.() -> Unit)? = null,
    override var remove: (VElement<T>.(removeCallback: () -> Unit) -> Unit)? = null,
  ) : VElementHooks<T> {
    fun build() = object : VElementHooks<T> {
      override val init: (VElement<T>.() -> Unit)? = this@VElementHooksBuilder.init
      override val create: (VElement<T>.(ref: T) -> Unit)? = this@VElementHooksBuilder.create
      override val insert: (VElement<T>.(ref: T) -> Unit)? = this@VElementHooksBuilder.insert
      override val prePatch: (VElement<T>.(oldVNode: VElement<T>) -> Unit)? = this@VElementHooksBuilder.prePatch
      override val update: (VElement<T>.(oldVNode: VElement<T>) -> Unit)? = this@VElementHooksBuilder.update
      override val postPatch: (VElement<T>.(oldVNode: VElement<T>) -> Unit)? = this@VElementHooksBuilder.postPatch
      override val destroy: (VElement<T>.() -> Unit)? = this@VElementHooksBuilder.destroy
      override val remove: (VElement<T>.(removeCallback: () -> Unit) -> Unit)? = this@VElementHooksBuilder.remove
    }
  }
}

@KvdomDSL
inline fun vBuilder(attrs: Map<String, String> = mapOf(), block: VBuilder<HTMLDivElement>.() -> Unit = {}) =
  element("div", attrs, block = block).let(VBuilder<HTMLDivElement>::build)

@KvdomDSL
inline fun <T : Element> element(
  tag: String,
  attrs: Map<String, String> = mapOf(),
  block: VBuilder<T>.() -> Unit = {},
) = VBuilder(tag, attrs.toMutableMap(), block = block)

@KvdomDSL
inline fun <T : Element> VBuilder<*>.element(
  tag: String,
  attrs: Map<String, String> = mapOf(),
  block: VBuilder<T>.() -> Unit = {},
) = VBuilder(tag, attrs.toMutableMap(), block = block).also {
  children.add(it)
}
