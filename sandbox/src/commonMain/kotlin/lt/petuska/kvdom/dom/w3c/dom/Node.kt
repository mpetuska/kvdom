package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [Node](https://developer.mozilla.org/en/docs/Web/API/Node) to Kotlin
 */
@NoWASM
expect abstract class Node() : EventTarget {
  open val nodeType: Short
  open val nodeName: String
  open val baseURI: String
  open val isConnected: Boolean
  open val ownerDocument: Document?
  open val parentNode: Node?
  open val parentElement: Element?
  open val childNodes: NodeList
  open val firstChild: Node?
  open val lastChild: Node?
  open val previousSibling: Node?
  open val nextSibling: Node?
  open var nodeValue: String?
  open var textContent: String?
  fun getRootNode(options: GetRootNodeOptions = GetRootNodeOptions()): Node
  fun hasChildNodes(): Boolean
  fun normalize()
  fun cloneNode(deep: Boolean = false): Node
  fun isEqualNode(otherNode: Node?): Boolean
  fun isSameNode(otherNode: Node?): Boolean
  fun compareDocumentPosition(other: Node): Short
  fun contains(other: Node?): Boolean
  fun lookupPrefix(namespace: String?): String?
  fun lookupNamespaceURI(prefix: String?): String?
  fun isDefaultNamespace(namespace: String?): Boolean
  fun insertBefore(node: Node, child: Node?): Node
  fun appendChild(node: Node): Node
  fun replaceChild(node: Node, child: Node): Node
  fun removeChild(child: Node): Node
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

expect interface GetRootNodeOptions {
  var composed: Boolean? /* = false */
}

fun GetRootNodeOptions(composed: Boolean? = false): GetRootNodeOptions = object : GetRootNodeOptions {
  override var composed: Boolean? = composed
}