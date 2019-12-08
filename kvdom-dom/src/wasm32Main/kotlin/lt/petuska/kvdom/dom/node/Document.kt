package lt.petuska.kvdom.dom.node

import kotlinx.wasm.jsinterop.*

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Document
 */
actual class Document(arena: Arena, index: Object) : Node(arena, index) {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementById
     */
    actual fun getElementById(id: String): Element? {
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
                    Element(newArena, it)
                }
            }
        }
    }

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement
     */
    actual fun createElement(tagName: String): Element {
        return allocateArena().let { newArena ->
            js_Document_createElement(
                arena, index,
                stringPointer(tagName),
                stringLengthBytes(tagName),
                newArena
            ).let {
                Element(newArena, it)
            }
        }
    }

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/createTextNode
     */
    actual fun createTextNode(data: String): Text {
        return allocateArena().let { newArena ->
            js_Document_createTextNode(
                arena, index,
                stringPointer(data),
                stringLengthBytes(data),
                newArena
            ).let {
                Text(newArena, it)
            }
        }
    }

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/defaultView
     */
    actual val defaultView: Window?
        get() = js_Document_defaultView(arena, index).let {
            if (it < 0) {
                null
            } else {
                Window(arena, js_Document_defaultView(arena, index))
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

@SymbolName("kvdom_Document_defaultView")
private external fun js_Document_defaultView(
    arena: Arena,
    index: Object
): Object