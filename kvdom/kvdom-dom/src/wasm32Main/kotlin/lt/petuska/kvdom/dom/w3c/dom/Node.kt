package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [Node](https://developer.mozilla.org/en/docs/Web/API/Node) to Kotlin
 */
@NoWASM
actual abstract class Node : EventTarget() {
  actual open val nodeType: Short
    get() = TODO("Not yet implemented")
  actual open val nodeName: String
    get() = TODO("Not yet implemented")
  actual open val baseURI: String
    get() = TODO("Not yet implemented")
  actual open val isConnected: Boolean
    get() = TODO("Not yet implemented")
  actual open val ownerDocument: Document?
    get() = TODO("Not yet implemented")
  actual open val parentNode: Node?
    get() = TODO("Not yet implemented")
  actual open val parentElement: Element?
    get() = TODO("Not yet implemented")
  actual open val childNodes: NodeList
    get() = TODO("Not yet implemented")
  actual open val firstChild: Node?
    get() = TODO("Not yet implemented")
  actual open val lastChild: Node?
    get() = TODO("Not yet implemented")
  actual open val previousSibling: Node?
    get() = TODO("Not yet implemented")
  actual open val nextSibling: Node?
    get() = TODO("Not yet implemented")
  actual open var nodeValue: String?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var textContent: String?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun getRootNode(options: GetRootNodeOptions): Node {
    TODO("Not yet implemented")
  }
  
  actual fun hasChildNodes(): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun normalize() {
  }
  
  actual fun cloneNode(deep: Boolean): Node {
    TODO("Not yet implemented")
  }
  
  actual fun isEqualNode(otherNode: Node?): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun isSameNode(otherNode: Node?): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun compareDocumentPosition(other: Node): Short {
    TODO("Not yet implemented")
  }
  
  actual fun contains(other: Node?): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun lookupPrefix(namespace: String?): String? {
    TODO("Not yet implemented")
  }
  
  actual fun lookupNamespaceURI(prefix: String?): String? {
    TODO("Not yet implemented")
  }
  
  actual fun isDefaultNamespace(namespace: String?): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun insertBefore(
    node: Node,
    child: Node?
  ): Node {
    TODO("Not yet implemented")
  }
  
  actual fun appendChild(node: Node): Node {
    TODO("Not yet implemented")
  }
  
  actual fun replaceChild(
    node: Node,
    child: Node
  ): Node {
    TODO("Not yet implemented")
  }
  
  actual fun removeChild(child: Node): Node {
    TODO("Not yet implemented")
  }
  
  actual companion object {
    actual val ELEMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val ATTRIBUTE_NODE: Short
      get() = TODO("Not yet implemented")
    actual val TEXT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val CDATA_SECTION_NODE: Short
      get() = TODO("Not yet implemented")
    actual val ENTITY_REFERENCE_NODE: Short
      get() = TODO("Not yet implemented")
    actual val ENTITY_NODE: Short
      get() = TODO("Not yet implemented")
    actual val PROCESSING_INSTRUCTION_NODE: Short
      get() = TODO("Not yet implemented")
    actual val COMMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_TYPE_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_FRAGMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val NOTATION_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_DISCONNECTED: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_PRECEDING: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_FOLLOWING: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_CONTAINS: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_CONTAINED_BY: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
      get() = TODO("Not yet implemented")
  }
  
}

actual interface GetRootNodeOptions {
  actual var composed: Boolean?
}