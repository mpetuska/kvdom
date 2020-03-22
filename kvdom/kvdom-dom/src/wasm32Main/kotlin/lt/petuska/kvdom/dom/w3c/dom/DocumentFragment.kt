package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DocumentFragment](https://developer.mozilla.org/en/docs/Web/API/DocumentFragment) to Kotlin
 */
actual open class DocumentFragment actual constructor() : Node(),
  NonElementParentNode,
  ParentNode {
  actual override val children: HTMLCollection
    get() = TODO("Not yet implemented")
  actual override val firstElementChild: Element?
    get() = TODO("Not yet implemented")
  actual override val lastElementChild: Element?
    get() = TODO("Not yet implemented")
  actual override val childElementCount: Int
    get() = TODO("Not yet implemented")
  
  actual override fun getElementById(elementId: String): Element? {
    TODO("Not yet implemented")
  }
  
  actual override fun prepend(vararg nodes: Any) {
  }
  
  actual override fun append(vararg nodes: Any) {
  }
  
  actual override fun querySelector(selectors: String): Element? {
    TODO("Not yet implemented")
  }
  
  actual override fun querySelectorAll(selectors: String): NodeList {
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