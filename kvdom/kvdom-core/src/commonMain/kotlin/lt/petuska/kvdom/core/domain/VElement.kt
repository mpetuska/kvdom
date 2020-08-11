package lt.petuska.kvdom.core.domain

import lt.petuska.kvdom.core.module.*
import lt.petuska.kvdom.dom.*

typealias GenericVElement = VElement<*>

data class VElement<T : Element> internal constructor(
  val tag: String,
  val attrs: Map<String, String>,
  internal val _data: MutableMap<String, ModuleData>,
  val hooks: VElementHooks<T>,
  val key: String?,
  val ns: String?,
  val children: MutableList<VElement<*>>,
  val textContent: String?,
  var ref: T?,
) {
  val data: Map<String, ModuleData>
    get() = _data

  fun copy(): VElement<T> =
    VElement(
      tag,
      HashMap(attrs),
      _data.mapValues { it.value.copy() }.toMutableMap(),
      hooks,
      key,
      ns,
      ArrayList(children),
      textContent,
      ref
    )

  fun toHtml(): String = buildString {
    attrs.entries
      .joinToString(" ", "<$tag", ">") { " ${it.key}=\"${it.value}\"" }
      .let { append(it) }
    children.forEach {
      append(it.toHtml())
    }
    textContent?.let { append(it) }
    append("</$tag>")
  }

  @Suppress("UNCHECKED_CAST")
  fun render(): T = (
    if (ns == null) {
      document.createElement(tag)
    } else {
      document.createElementNS(tag, ns)
    } as T
    ).also {
    attrs.forEach { a ->
      val (key, value) = a
      if (value == "false") {
        it.removeAttribute(key)
      } else {
        it.setAttribute(key, value)
      }
    }
    if (textContent != null) {
      it.textContent = textContent
    }
  }

  @Suppress("UNCHECKED_CAST")
  fun <T : ModuleData> getModuleData(moduleId: String, default: T? = null): T? =
    _data[moduleId] as? T ?: default?.also {
      _data[moduleId] = it
    }
}
