package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [Node](https://developer.mozilla.org/en/docs/Web/API/Node) to Kotlin
 */
actual abstract external class Node : EventTarget {
  actual open val nodeType: Short
  actual open val nodeName: String
  actual open val baseURI: String
  actual open val isConnected: Boolean
  actual open val ownerDocument: Document?
  actual open val parentNode: Node?
  actual open val parentElement: Element?
  actual open val childNodes: NodeList
  actual open val firstChild: Node?
  actual open val lastChild: Node?
  actual open val previousSibling: Node?
  actual open val nextSibling: Node?
  actual open var nodeValue: String?
  actual open var textContent: String?
  
  actual fun getRootNode(options: GetRootNodeOptions): Node
  actual fun hasChildNodes(): Boolean
  actual fun normalize()
  actual fun cloneNode(deep: Boolean): Node
  actual fun isEqualNode(otherNode: Node?): Boolean
  actual fun isSameNode(otherNode: Node?): Boolean
  actual fun compareDocumentPosition(other: Node): Short
  actual fun contains(other: Node?): Boolean
  actual fun lookupPrefix(namespace: String?): String?
  actual fun lookupNamespaceURI(prefix: String?): String?
  actual fun isDefaultNamespace(namespace: String?): Boolean
  actual fun insertBefore(node: Node, child: Node?): Node
  actual fun appendChild(node: Node): Node
  actual fun replaceChild(node: Node, child: Node): Node
  actual fun removeChild(child: Node): Node
  
  actual companion object {
    actual val ELEMENT_NODE: Short
    actual val ATTRIBUTE_NODE: Short
    actual val TEXT_NODE: Short
    actual val CDATA_SECTION_NODE: Short
    actual val ENTITY_REFERENCE_NODE: Short
    actual val ENTITY_NODE: Short
    actual val PROCESSING_INSTRUCTION_NODE: Short
    actual val COMMENT_NODE: Short
    actual val DOCUMENT_NODE: Short
    actual val DOCUMENT_TYPE_NODE: Short
    actual val DOCUMENT_FRAGMENT_NODE: Short
    actual val NOTATION_NODE: Short
    actual val DOCUMENT_POSITION_DISCONNECTED: Short
    actual val DOCUMENT_POSITION_PRECEDING: Short
    actual val DOCUMENT_POSITION_FOLLOWING: Short
    actual val DOCUMENT_POSITION_CONTAINS: Short
    actual val DOCUMENT_POSITION_CONTAINED_BY: Short
    actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

actual external interface GetRootNodeOptions {
  actual var composed: Boolean?
}