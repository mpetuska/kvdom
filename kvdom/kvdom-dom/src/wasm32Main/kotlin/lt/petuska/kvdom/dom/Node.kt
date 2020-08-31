package lt.petuska.kvdom.dom

import kotlinx.wasm.jsinterop.*
import lt.petuska.kvdom.dom.util.*

public actual abstract class Node(arena: Arena, index: Object) : EventTarget(arena, index) {
  public actual open var textContent: String?
    get() = getStringProperty("textContent")
    set(value) {
      setStringProperty("textContent", value)
    }

  public actual fun removeChild(child: Node): Node {
    js_removeChild(arena, index, child.arena, child.index)
    return child
  }

  public actual fun appendChild(node: Node): Node {
    js_appendChild(arena, index, node.arena, node.index)
    return node
  }

  public actual val parentNode: Node?
    get() = getObjProperty("parentNode")?.let {
      object : Node(it.arena, it.index) {}
    }

  public actual val firstChild: Node?
    get() = getObjProperty("firstChild")?.let {
      object : Node(it.arena, it.index) {}
    }

  public actual fun hasChildNodes(): Boolean = js_hasChildNodes(arena, index) == 1
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
