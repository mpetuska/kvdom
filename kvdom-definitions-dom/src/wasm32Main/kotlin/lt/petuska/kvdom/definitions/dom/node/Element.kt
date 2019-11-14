package lt.petuska.kvdom.definitions.dom.node

import kotlinx.wasm.jsinterop.*

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Element
 */
actual open class Element(arena: Arena, index: Object) : Node(arena, index) {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute
     */
    actual fun setAttribute(name: String, value: String) {
        js_Element_setAttribute(
            arena, index,
            stringPointer(name), stringLengthBytes(name),
            stringPointer(value), stringLengthBytes(value)
        )
    }

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute
     */
    actual fun removeAttribute(attrName: String) {
        js_Element_removeAttribute(
            arena, index,
            stringPointer(attrName), stringLengthBytes(attrName)
        )
    }
}

@SymbolName("kvdom_Element_setAttribute")
private external fun js_Element_setAttribute(
    arena: Arena,
    index: Object,
    attrPtr: Pointer,
    attrLen: Int,
    keyPtr: Pointer,
    keyLen: Int
)

@SymbolName("kvdom_Element_removeAttribute")
private external fun js_Element_removeAttribute(
    arena: Arena,
    index: Object,
    attrPtr: Pointer,
    attrLen: Int
)