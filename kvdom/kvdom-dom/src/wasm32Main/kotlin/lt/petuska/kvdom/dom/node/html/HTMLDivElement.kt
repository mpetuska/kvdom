package lt.petuska.kvdom.dom.node.html

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/HTMLDivElement
 */
actual open class HTMLDivElement(arena: Arena, index: Object) : HTMLElement(arena, index)