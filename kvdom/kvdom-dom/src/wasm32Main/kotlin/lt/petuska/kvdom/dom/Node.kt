package lt.petuska.kvdom.dom

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import lt.petuska.kvdom.dom.util.getObjProperty
import lt.petuska.kvdom.dom.util.getStringProperty
import lt.petuska.kvdom.dom.util.setStringProperty

actual abstract class Node(arena: Arena, index: Object) : EventTarget(arena, index) {
  actual open var textContent: String?
    get() = getStringProperty("textContent")
    set(value) {
      setStringProperty("textContent", value)
    }
  
  actual fun removeChild(child: Node): Node {
    js_removeChild(arena, index, child.arena, child.index)
    return child
  }
  
  actual fun appendChild(node: Node): Node {
    js_appendChild(arena, index, node.arena, node.index)
    return node
  }
  
  actual val parentNode: Node?
    get() = getObjProperty("parentNode")?.let {
      object : Node(it.arena, it.index) {}
    }
  
  actual val firstChild: Node?
    get() = getObjProperty("firstChild")?.let {
      object : Node(it.arena, it.index) {}
    }
  
  actual fun hasChildNodes(): Boolean = js_hasChildNodes(arena, index) == 1
}

@SymbolName("kvdom_Node_hasChildNodes")
private external fun js_hasChildNodes(
  arena: Arena,
  index: Object,
): Int

@SymbolName("kvdom_Node_appendChild")
private external fun js_appendChild(
  arena: Arena,
  index: Object,
  childArena: Arena,
  childIndex: Object,
)

@SymbolName("kvdom_Node_removeChild")
private external fun js_removeChild(
  arena: Arena,
  index: Object,
  childArena: Arena,
  childIndex: Object,
)
