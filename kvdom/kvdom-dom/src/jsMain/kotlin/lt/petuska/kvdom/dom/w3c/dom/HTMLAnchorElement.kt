package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLAnchorElement](https://developer.mozilla.org/en/docs/Web/API/HTMLAnchorElement) to Kotlin
 */
actual abstract external class HTMLAnchorElement : HTMLElement,
  HTMLHyperlinkElementUtils {
  actual open var target: String
  actual open var download: String
  actual open var ping: String
  actual open var rel: String
  actual open val relList: DOMTokenList
  actual open var hreflang: String
  actual open var type: String
  actual open var text: String
  actual open var referrerPolicy: String
  actual open var coords: String
  actual open var charset: String
  actual open var name: String
  actual open var rev: String
  actual open var shape: String
  
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