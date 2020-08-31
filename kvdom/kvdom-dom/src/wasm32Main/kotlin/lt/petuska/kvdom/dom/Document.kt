package lt.petuska.kvdom.dom

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import kotlinx.wasm.jsinterop.Pointer
import kotlinx.wasm.jsinterop.allocateArena
import kotlinx.wasm.jsinterop.stringLengthBytes
import kotlinx.wasm.jsinterop.stringPointer

public actual open class Document(arena: Arena, index: Object) : Node(arena, index) {
  public actual fun getElementById(elementId: String): Element? {
    val resArena = allocateArena()
    val resPtr = js_getElementById(
      arena, index,
      stringPointer(elementId), stringLengthBytes(elementId),
      resArena
    )
    return if (resPtr < 0) null else object : Element(resArena, resPtr) {}
  }
}

public actual fun Document.createElement(qualifiedName: String): Element {
  val resArena = allocateArena()
  val resPtr = js_createElement(
    arena, index,
    stringPointer(qualifiedName), stringLengthBytes(qualifiedName),
    resArena
  )
  return object : Element(resArena, resPtr) {}
}

public actual fun Document.createElementNS(qualifiedName: String, namespace: String): Element {
  val resArena = allocateArena()
  val resPtr = js_createElementNS(
    arena, index,
    stringPointer(qualifiedName), stringLengthBytes(qualifiedName),
    stringPointer(namespace), stringLengthBytes(namespace),
    resArena
  )
  return object : Element(resArena, resPtr) {}
}

@SymbolName("kvdom_Document_getElementById")
private external fun js_getElementById(
  arena: Arena,
  index: Object,
  idPtr: Pointer,
  idLen: Int,
  resultArena: Arena,
): Object

@SymbolName("kvdom_Document_createElement")
private external fun js_createElement(
  arena: Arena,
  index: Object,
  tagPtr: Pointer,
  tagLen: Int,
  resultArena: Arena,
): Object

@SymbolName("kvdom_Document_createElementNS")
private external fun js_createElementNS(
  arena: Arena,
  index: Object,
  tagPtr: Pointer,
  tagLen: Int,
  nsPtr: Pointer,
  nsLen: Int,
  resultArena: Arena,
): Object

@SymbolName("kvdom_Document_createTextNode")
private external fun js_createTextNode(
  arena: Arena,
  index: Object,
  textPtr: Pointer,
  textLen: Int,
  resultArena: Arena,
): Object

@SymbolName("kvdom_Document_defaultView")
private external fun js_defaultView(
  arena: Arena,
  index: Object,
): Object
