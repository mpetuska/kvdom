package lt.petuska.kvdom.definitions.dom

import kotlinx.wasm.jsinterop.*

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Document
 */
actual interface Document : Node {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementById
     */
    actual fun getElementById(id: String): Element?

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement
     */
    actual fun createElement(tagName: String): Element

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/createTextNode
     */
    actual fun createTextNode(data: String): Text
}

actual class DocumentImpl(arena: Arena, index: Object) : NodeImpl(arena, index), Document {
    override fun getElementById(id: String): Element? {
        return allocateArena().let { newArena ->
            js_Document_getElementById(
                arena, index,
                stringPointer(id),
                stringLengthBytes(id),
                newArena
            ).let {
                if (it < 0) {
                    null.also {
                        freeArena(newArena)
                    }
                } else {
                    ElementImpl(newArena, it)
                }
            }
        }
    }

    override fun createElement(tagName: String): Element {
        return allocateArena().let { newArena ->
            js_Document_createElement(
                arena, index,
                stringPointer(tagName),
                stringLengthBytes(tagName),
                newArena
            ).let {
                ElementImpl(newArena, it)
            }
        }
    }

    override fun createTextNode(data: String): Text {
        return allocateArena().let { newArena ->
            js_Document_createTextNode(
                arena, index,
                stringPointer(data),
                stringLengthBytes(data),
                newArena
            ).let {
                TextImpl(newArena, it)
            }
        }
    }

}

@SymbolName("kvdom_Document_getElementById")
private external fun js_Document_getElementById(
    arena: Arena,
    index: Object,
    idPtr: Pointer,
    idLen: Int,
    resultArena: Arena
): Object

@SymbolName("kvdom_Document_createElement")
private external fun js_Document_createElement(
    arena: Arena,
    index: Object,
    tagPtr: Pointer,
    tagLen: Int,
    resultArena: Arena
): Object

@SymbolName("kvdom_Document_createTextNode")
private external fun js_Document_createTextNode(
    arena: Arena,
    index: Object,
    textPtr: Pointer,
    textLen: Int,
    resultArena: Arena
): Object