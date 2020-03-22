package lt.petuska.kvdom.dom.node

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.JsArray
import kotlinx.wasm.jsinterop.Object
import lt.petuska.kvdom.dom.event.EventTarget
import lt.petuska.kvdom.dom.util.getIntProperty
import lt.petuska.kvdom.dom.util.getObjProperty


actual open class Node(arena: Arena, index: Object) : EventTarget(arena, index), ChildNode {
  override fun remove() = exRemove()
  override fun replaceWith(vararg nodes: Node) = exReplaceWith(*nodes)
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Node/appendChild
   */
  actual fun appendChild(node: Node) {
    dElement_appendChild(
      arena, index,
      node.arena, node.index
    )
  }
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Node/childNodes
   */
  actual val childNodes: Array<Node>
    get() = run {
      getObjProperty("childNodes").run {
        JsArray(this).let {
          Array(it.size) { i ->
            val node = Node(it[i].arena, it[i].index)
            when (NodeType.valueOf(node.nodeType)) {
              NodeType.ELEMENT_NODE -> Element(
                node.arena,
                node.index
              )
              NodeType.TEXT_NODE -> Text(node.arena, node.index)
              else -> node
            }
          }
        }
      }
    }
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Node/nodeType
   */
  actual val nodeType: Int
    get() = run {
      getIntProperty("nodeType")
    }
}

@SymbolName("kvdom_Node_appendChild")
private external fun dElement_appendChild(
  arena: Arena,
  index: Object,
  childArena: Arena,
  childIndex: Object
)