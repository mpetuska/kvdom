package lt.petuska.kvdom.dom.node

import lt.petuska.kvdom.dom.event.EventTarget


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Node
 */
expect open class Node : EventTarget, ChildNode {
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Node/appendChild
   */
  fun appendChild(node: Node)
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Node/childNodes
   */
  val childNodes: Array<Node>
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Node/nodeType
   */
  val nodeType: Int
}

enum class NodeType(val value: Int) {
  ELEMENT_NODE(1),
  TEXT_NODE(3),
  CDATA_SECTION_NODE(4),
  PROCESSING_INSTRUCTION_NODE(7),
  COMMENT_NODE(8),
  DOCUMENT_NODE(9),
  DOCUMENT_TYPE_NODE(10),
  DOCUMENT_FRAGMENT_NODE(11);
  
  companion object {
    fun valueOf(value: Int) = values().find { it.value == value }
  }
}