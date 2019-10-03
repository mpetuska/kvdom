package lt.petuska.kvdom.jsexternal

import kotlinx.wasm.jsinterop.*


open class JsDocument(arena: Arena, index: Object) : JsValue(arena, index), Document {
    override fun getElementById(elementID: String): DNode? {
        return allocateArena().let { newArena ->
            document_getElementById(
                arena, index,
                stringPointer(elementID),
                stringLengthBytes(elementID),
                newArena
            ).let {
                DNode(newArena, it)
            }
        }
    }

    override fun createElement(tag: String): DNode {
        return allocateArena().let { newArena ->
            document_createElement(
                arena, index,
                stringPointer(tag),
                stringLengthBytes(tag),
                newArena
            ).let {
                DNode(newArena, it)
            }
        }
    }

    override fun createTextNode(text: String): DNode {
        return allocateArena().let { newArena ->
            document_createTextNode(
                arena, index,
                stringPointer(text),
                stringLengthBytes(text),
                newArena
            ).let {
                DNode(newArena, it)
            }
        }
    }
}

actual val document = allocateArena().run {
    JsDocument(this, jsGetDocument(this)) as Document
}

@SymbolName("kvdom_Global_getDocument")
external fun jsGetDocument(resultArena: Arena): Object

@SymbolName("kvdom_Document_getElementById")
external fun document_getElementById(
    arena: Arena,
    index: Object,
    idPtr: Pointer,
    idLen: Int,
    resultArena: Arena
): Object

@SymbolName("kvdom_Document_createElement")
external fun document_createElement(
    arena: Arena,
    index: Object,
    tagPtr: Pointer,
    tagLen: Int,
    resultArena: Arena
): Object

@SymbolName("kvdom_Document_createTextNode")
external fun document_createTextNode(
    arena: Arena,
    index: Object,
    textPtr: Pointer,
    textLen: Int,
    resultArena: Arena
): Object