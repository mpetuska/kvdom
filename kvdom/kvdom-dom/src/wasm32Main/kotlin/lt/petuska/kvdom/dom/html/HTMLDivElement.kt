package lt.petuska.kvdom.dom.html

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object

actual abstract class HTMLDivElement(arena: Arena, index: Object) : HTMLElement(arena, index)
