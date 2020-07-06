package lt.petuska.kvdom.core

import lt.petuska.kvdom.core.domain.*
import org.w3c.dom.*


@DslMarker
annotation class KvdomDSL

@KvdomDSL
inline fun vBuilder(attrs: Map<String, String> = mapOf(), block: TypedVBuilder<HTMLDivElement>.() -> Unit = {}) =
  element("div", attrs, block = block)

@KvdomDSL
inline fun <T : Element> element(
  tag: String,
  attrs: Map<String, String> = mapOf(),
  block: TypedVBuilder<T>.() -> Unit = {},
) = TypedVBuilder(tag, attrs.toMutableMap(), block = block)()

@KvdomDSL
inline fun <T : Element> TypedVBuilder<*>.element(
  tag: String,
  attrs: Map<String, String> = mapOf(),
  block: TypedVBuilder<T>.() -> Unit = {},
) = TypedVBuilder(tag, attrs.toMutableMap(), block = block)(this)
