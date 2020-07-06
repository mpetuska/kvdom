package lt.petuska.kvdom.core.domain

import lt.petuska.kvdom.core.module.*
import org.w3c.dom.*

typealias VBuilder = TypedVBuilder<*>

inline fun <T : Element> TypedVBuilder(
  tag: String,
  attrs: MutableMap<String, String> = mutableMapOf(),
  data: MutableMap<String, ModuleData> = mutableMapOf(),
  hooks: TypedVBuilder.VElementHooksBuilder<T> = TypedVBuilder.VElementHooksBuilder(),
  key: String? = null,
  ns: String? = null,
  children: MutableList<VElement<*>> = mutableListOf(),
  textContent: String? = null,
  block: TypedVBuilder<T>.() -> Unit,
) = TypedVBuilder(tag, attrs, data, hooks, key, ns, children, textContent).apply(block)

open class TypedVBuilder<T : Element> constructor(
  val tag: String,
  val attrs: MutableMap<String, String> = mutableMapOf(),
  val data: MutableMap<String, ModuleData> = mutableMapOf(),
  val hooks: VElementHooksBuilder<T> = VElementHooksBuilder(),
  var key: String? = null,
  var ns: String? = null,
  val children: MutableList<VElement<*>> = mutableListOf(),
  var textContent: String? = null,
) {
  
  operator fun String?.unaryPlus() {
    textContent = this
  }
  
  fun build(): VElement<T> = VElement(tag, attrs, data, hooks.build(), key, ns, children, textContent, null)
  
  operator fun invoke(parent: TypedVBuilder<*>? = null): VElement<T> = build().also {
    parent?.children?.add(it)
  }
  
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
