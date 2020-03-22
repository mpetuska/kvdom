package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DocumentFragment](https://developer.mozilla.org/en/docs/Web/API/DocumentFragment) to Kotlin
 */
expect open class DocumentFragment() : Node,
  NonElementParentNode,
  ParentNode {
  override val children: HTMLCollection
  override val firstElementChild: Element?
  override val lastElementChild: Element?
  override val childElementCount: Int
  override fun getElementById(elementId: String): Element?
  override fun prepend(vararg nodes: Any)
  override fun append(vararg nodes: Any)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
  
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