package lt.petuska.kvdom.dom

import kotlinx.wasm.jsinterop.*

actual val document: Document = allocateArena().let {
  object : Document(it, js_getDocument(it)) {}
}
actual val window: Window = allocateArena().let {
  object : Window(it, js_getWindow(it)) {}
}

@SymbolName("kvdom_Global_getDocument")
private external fun js_getDocument(
  resultArena: Arena,
): Object

@SymbolName("kvdom_Global_getWindow")
private external fun js_getWindow(
  resultArena: Arena,
): Object
