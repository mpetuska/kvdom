package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLIFrameElement](https://developer.mozilla.org/en/docs/Web/API/HTMLIFrameElement) to Kotlin
 */
actual abstract external class HTMLIFrameElement : HTMLElement {
  actual open var src: String
  actual open var srcdoc: String
  actual open var name: String
  actual open val sandbox: DOMTokenList
  actual open var allowFullscreen: Boolean
  actual open var allowUserMedia: Boolean
  actual open var width: String
  actual open var height: String
  actual open var referrerPolicy: String
  actual open val contentDocument: Document?
  actual open val contentWindow: Window?
  actual open var align: String
  actual open var scrolling: String
  actual open var frameBorder: String
  actual open var longDesc: String
  actual open var marginHeight: String
  actual open var marginWidth: String
  actual fun getSVGDocument(): Document?
  
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