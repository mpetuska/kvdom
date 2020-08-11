package lt.petuska.kvdom.dom

import kotlinx.wasm.jsinterop.*

actual abstract class Element(arena: Arena, index: Object) : Node(arena, index) {
  actual fun removeAttribute(qualifiedName: String) {
    js_removeAttribute(
      arena, index,
      stringPointer(qualifiedName), stringLengthBytes(qualifiedName),
    )
  }

  actual fun setAttribute(qualifiedName: String, value: String) {
    js_setAttribute(
      arena, index,
      stringPointer(qualifiedName), stringLengthBytes(qualifiedName),
      stringPointer(value), stringLengthBytes(value),
    )
  }
}

@SymbolName("kvdom_Element_setAttribute")
private external fun js_setAttribute(
  arena: Arena,
  index: Object,
  keyPtr: Pointer,
  keyLen: Int,
  valuePtr: Pointer,
  valueLen: Int,
)

@SymbolName("kvdom_Element_removeAttribute")
private external fun js_removeAttribute(
  arena: Arena,
  index: Object,
  keyPtr: Pointer,
  keyLen: Int,
)
