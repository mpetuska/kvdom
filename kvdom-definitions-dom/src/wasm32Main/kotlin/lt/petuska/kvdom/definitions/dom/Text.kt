package lt.petuska.kvdom.definitions.dom

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Text
 */
actual interface Text : Node, ChildNode

actual class TextImpl(arena: Arena, index: Object) : NodeImpl(arena, index), Text