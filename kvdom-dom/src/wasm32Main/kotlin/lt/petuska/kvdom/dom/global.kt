package lt.petuska.kvdom.dom

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import kotlinx.wasm.jsinterop.allocateArena
import lt.petuska.kvdom.dom.node.Document

actual val document: Document = allocateArena().run {
    Document(this, jsGetDocument(this))
}

@SymbolName("kvdom_Global_getDocument")
private external fun jsGetDocument(resultArena: Arena): Object