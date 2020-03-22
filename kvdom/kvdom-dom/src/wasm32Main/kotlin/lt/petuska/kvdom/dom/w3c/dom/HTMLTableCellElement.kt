package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLTableCellElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableCellElement) to Kotlin
 */
actual abstract class HTMLTableCellElement actual constructor() : HTMLElement() {
  actual open var colSpan: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var rowSpan: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var headers: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val cellIndex: Int
    get() = TODO("Not yet implemented")
  actual open var scope: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var abbr: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var align: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var axis: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var height: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var width: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var ch: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var chOff: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var noWrap: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var vAlign: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var bgColor: String
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