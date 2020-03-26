package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [HTMLTableRowElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableRowElement) to Kotlin
 */
@NoWASM
actual abstract class HTMLTableRowElement : HTMLElement() {
  actual open val rowIndex: Int
    get() = TODO("Not yet implemented")
  actual open val sectionRowIndex: Int
    get() = TODO("Not yet implemented")
  actual open val cells: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open var align: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var ch: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var chOff: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var vAlign: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var bgColor: String
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun insertCell(index: Int): HTMLElement {
    TODO("Not yet implemented")
  }
  
  actual fun deleteCell(index: Int) {
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