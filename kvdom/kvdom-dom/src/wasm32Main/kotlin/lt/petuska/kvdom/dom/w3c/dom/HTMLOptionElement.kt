package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLOptionElement](https://developer.mozilla.org/en/docs/Web/API/HTMLOptionElement) to Kotlin
 */
actual abstract class HTMLOptionElement actual constructor() : HTMLElement(),
  UnionHTMLOptGroupElementOrHTMLOptionElement {
  actual open var disabled: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val form: HTMLFormElement?
    get() = TODO("Not yet implemented")
  actual open var label: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var defaultSelected: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var selected: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var value: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var text: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val index: Int
    get() = TODO("Not yet implemented")
  
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