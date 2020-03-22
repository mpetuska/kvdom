package lt.petuska.kvdom.dom

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import kotlinx.wasm.jsinterop.allocateArena
import lt.petuska.kvdom.dom.node.Document
import lt.petuska.kvdom.dom.node.Window

actual val document: Document = allocateArena().run {
    Document(this, jsGetDocument(this))
}
actual val window: Window = allocateArena().run {
    Window(this, jsGetWindow(this))
}

@SymbolName("kvdom_Global_getDocument")
private external fun jsGetDocument(resultArena: Arena): Object

@SymbolName("kvdom_Global_getWindow")
private external fun jsGetWindow(resultArena: Arena): Object