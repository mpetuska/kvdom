package lt.petuska.kvdom.definitions.dom.node

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Text
 */
actual class Text(arena: Arena, index: Object) : Node(arena, index)