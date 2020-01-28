package lt.petuska.kvdom.dom.node.html

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import lt.petuska.kvdom.dom.node.Element

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement
 */
actual open class HTMLElement(arena: Arena, index: Object) : Element(arena, index)