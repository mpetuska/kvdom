package lt.petuska.kvdom.core

import lt.petuska.kvdom.core.domain.*
import org.w3c.dom.*

@DslMarker
annotation class KVDOMDsl

@KVDOMDsl
fun <T : Element> element(
  tag: String,
  attrs: Map<String, String> = mapOf(),
  block: TypedVBuilder<T>.() -> Unit = {},
) = TypedVBuilder(tag, attrs.toMutableMap(), block = block)()

@KVDOMDsl
fun <T : Element> TypedVBuilder<*>.element(
  tag: String,
  attrs: Map<String, String> = mapOf(),
  block: TypedVBuilder<T>.() -> Unit = {},
) = TypedVBuilder(tag, attrs.toMutableMap(), block = block)(this)
