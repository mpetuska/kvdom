package lt.petuska.kvdom.dom.html

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import lt.petuska.kvdom.dom.Element

public actual abstract class HTMLElement(arena: Arena, index: Object) : Element(arena, index)
