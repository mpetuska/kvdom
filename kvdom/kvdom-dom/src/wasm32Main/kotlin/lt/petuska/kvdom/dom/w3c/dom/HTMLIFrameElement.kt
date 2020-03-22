package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLIFrameElement](https://developer.mozilla.org/en/docs/Web/API/HTMLIFrameElement) to Kotlin
 */
actual abstract class HTMLIFrameElement actual constructor() : HTMLElement() {
  actual open var src: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var srcdoc: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var name: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val sandbox: DOMTokenList
    get() = TODO("Not yet implemented")
  actual open var allowFullscreen: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var allowUserMedia: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var width: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var height: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var referrerPolicy: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val contentDocument: Document?
    get() = TODO("Not yet implemented")
  actual open val contentWindow: Window?
    get() = TODO("Not yet implemented")
  actual open var align: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var scrolling: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var frameBorder: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var longDesc: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var marginHeight: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var marginWidth: String
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun getSVGDocument(): Document? {
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