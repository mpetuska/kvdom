package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLTableElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableElement) to Kotlin
 */
expect abstract class HTMLTableElement() : HTMLElement {
  open var caption: HTMLTableCaptionElement?
  open var tHead: HTMLTableSectionElement?
  open var tFoot: HTMLTableSectionElement?
  open val tBodies: HTMLCollection
  open val rows: HTMLCollection
  open var align: String
  open var border: String
  open var frame: String
  open var rules: String
  open var summary: String
  open var width: String
  open var bgColor: String
  open var cellPadding: String
  open var cellSpacing: String
  fun createCaption(): HTMLTableCaptionElement
  fun deleteCaption()
  fun createTHead(): HTMLTableSectionElement
  fun deleteTHead()
  fun createTFoot(): HTMLTableSectionElement
  fun deleteTFoot()
  fun createTBody(): HTMLTableSectionElement
  fun insertRow(index: Int): HTMLTableRowElement
  fun deleteRow(index: Int)
  
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