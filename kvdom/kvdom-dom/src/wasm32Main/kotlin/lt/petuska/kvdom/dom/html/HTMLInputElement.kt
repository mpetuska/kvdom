package lt.petuska.kvdom.dom.html

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object

actual abstract class HTMLInputElement(arena: Arena, index: Object) : HTMLElement(arena, index)
