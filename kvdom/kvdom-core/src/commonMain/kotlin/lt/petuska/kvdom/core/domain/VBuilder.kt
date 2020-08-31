package lt.petuska.kvdom.core.domain

import lt.petuska.kvdom.core.KvdomDSL
import lt.petuska.kvdom.core.module.ModuleData
import lt.petuska.kvdom.dom.Element
import lt.petuska.kvdom.dom.html.HTMLDivElement

public inline fun <T : Element> VBuilder(
  tag: String,
  attrs: MutableMap<String, String> = mutableMapOf(),
  data: MutableMap<String, ModuleData> = mutableMapOf(),
  hooks: VBuilder.VElementHooksBuilder<T> = VBuilder.VElementHooksBuilder(),
  key: String? = null,
  ns: String? = null,
  children: MutableList<VBuilder<*>> = mutableListOf(),
  textContent: String? = null,
  block: VBuilder<T>.() -> Unit,
): VBuilder<T> = VBuilder(tag, attrs, data, hooks, key, ns, children, textContent).apply(block)

public open class VBuilder<T : Element> constructor(
  public val tag: String,
  public val attrs: MutableMap<String, String> = mutableMapOf(),
  public val data: MutableMap<String, ModuleData> = mutableMapOf(),
  public val hooks: VElementHooksBuilder<T> = VElementHooksBuilder(),
  public var key: String? = null,
  public var ns: String? = null,
  public val children: MutableList<VBuilder<*>> = mutableListOf(),
  public var textContent: String? = null,
) {
  @Suppress("UNCHECKED_CAST")
  public fun <T : ModuleData> getModuleData(moduleId: String, default: T? = null): T? =
    data[moduleId] as? T ?: default?.also {
      data[moduleId] = it
    }

  public operator fun String?.unaryPlus() {
    textContent = this
  }

  public fun build(): VElement<T> = VElement(
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

  public data class VElementHooksBuilder<T : Element>(
    override var init: (VElement<T>.() -> Unit)? = null,
    override var create: (VElement<T>.(ref: T) -> Unit)? = null,
    override var insert: (VElement<T>.(ref: T) -> Unit)? = null,
    override var prePatch: (VElement<T>.(oldVNode: VElement<T>) -> Unit)? = null,
    override var update: (VElement<T>.(oldVNode: VElement<T>) -> Unit)? = null,
    override var postPatch: (VElement<T>.(oldVNode: VElement<T>) -> Unit)? = null,
    override var destroy: (VElement<T>.() -> Unit)? = null,
    override var remove: (VElement<T>.(removeCallback: () -> Unit) -> Unit)? = null,
  ) : VElementHooks<T> {
    public fun build(): VElementHooks<T> = object : VElementHooks<T> {
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
public inline fun vBuilder(attrs: Map<String, String> = mapOf(), block: VBuilder<HTMLDivElement>.() -> Unit = {}): VElement<HTMLDivElement> =
  element("div", attrs, block = block).let(VBuilder<HTMLDivElement>::build)

@KvdomDSL
public inline fun <T : Element> element(
  tag: String,
  attrs: Map<String, String> = mapOf(),
  block: VBuilder<T>.() -> Unit = {},
): VBuilder<T> = VBuilder(tag, attrs.toMutableMap(), block = block)

@KvdomDSL
public inline fun <T : Element> VBuilder<*>.element(
  tag: String,
  attrs: Map<String, String> = mapOf(),
  block: VBuilder<T>.() -> Unit = {},
): VBuilder<T> = VBuilder(tag, attrs.toMutableMap(), block = block).also {
  children.add(it)
}
