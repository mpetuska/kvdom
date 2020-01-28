package lt.petuska.kvdom.dom.node.html

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import lt.petuska.kvdom.dom.util.getStringProperty
import lt.petuska.kvdom.dom.util.setStringProperty

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement
 */
actual open class HTMLInputElement(arena: Arena, index: Object) : HTMLElement(arena, index) {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement#value
     */
    actual var value: String?
        get() = getStringProperty("value")
        set(value) = setStringProperty("value", value)
}