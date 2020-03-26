package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLTableElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableElement) to Kotlin
 */
actual abstract external class HTMLTableElement : HTMLElement {
  actual open var caption: HTMLTableCaptionElement?
  actual open var tHead: HTMLTableSectionElement?
  actual open var tFoot: HTMLTableSectionElement?
  actual open val tBodies: HTMLCollection
  actual open val rows: HTMLCollection
  actual open var align: String
  actual open var border: String
  actual open var frame: String
  actual open var rules: String
  actual open var summary: String
  actual open var width: String
  actual open var bgColor: String
  actual open var cellPadding: String
  actual open var cellSpacing: String
  actual fun createCaption(): HTMLTableCaptionElement
  actual fun deleteCaption()
  actual fun createTHead(): HTMLTableSectionElement
  actual fun deleteTHead()
  actual fun createTFoot(): HTMLTableSectionElement
  actual fun deleteTFoot()
  actual fun createTBody(): HTMLTableSectionElement
  actual fun insertRow(index: Int): HTMLTableRowElement
  actual fun deleteRow(index: Int)
  
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