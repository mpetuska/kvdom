package lt.petuska.kvdom.dom.w3c.dom

actual abstract class HTMLFrameElement actual constructor() : HTMLElement() {
  actual open var name: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var scrolling: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var src: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var frameBorder: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var longDesc: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var noResize: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val contentDocument: Document?
    get() = TODO("Not yet implemented")
  actual open val contentWindow: Window?
    get() = TODO("Not yet implemented")
  actual open var marginHeight: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var marginWidth: String
    get() = TODO("Not yet implemented")
    set(value) {}
  
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