package lt.petuska.kvdom.core.domain

import lt.petuska.kvdom.core.module.*
import org.w3c.dom.*
import kotlin.browser.*

data class VElement<T : Element> internal constructor(
  val tag: String,
  val attrs: Map<String, String>,
  val data: Map<String, ModuleData>,
  val hooks: VElementHooks<T>,
  val key: String?,
  val ns: String?,
  val children: MutableList<VNode<*>>,
  override var ref: T?,
) : VNode<T>() {
  
  override fun copy(): VElement<T> =
    VElement(tag, HashMap(attrs), data.mapValues { it.value.copy() }, hooks, key, ns, ArrayList(children), ref)
  
  override fun toHtml(): String = buildString {
    attrs.entries
      .joinToString(" ", "<$tag ", " >") { "${it.key}=\"${it.value}\"" }
      .let { append(it) }
    children.forEach {
      append(it.toHtml())
    }
    append("</$tag>")
  }
  
  @Suppress("UNCHECKED_CAST")
  override fun render(): T = (if (ns == null) {
    document.createElement(tag)
  } else {
    document.createElementNS(tag, ns)
  } as T).also {
    attrs.forEach { a ->
      val (key, value) = a
      if (value == "false") {
        it.removeAttribute(key)
      } else {
        it.setAttribute(key, value)
      }
    }
  }
  
  @Suppress("UNCHECKED_CAST")
  fun <T : ModuleData> getModuleData(moduleId: String): T? = data[moduleId] as? T
}
