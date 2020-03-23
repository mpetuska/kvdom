package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [HTMLTableElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableElement) to Kotlin
 */
@NoWASM
actual abstract class HTMLTableElement : HTMLElement() {
  actual open var caption: HTMLTableCaptionElement?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var tHead: HTMLTableSectionElement?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var tFoot: HTMLTableSectionElement?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val tBodies: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open val rows: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open var align: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var border: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var frame: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var rules: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var summary: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var width: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var bgColor: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var cellPadding: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var cellSpacing: String
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun createCaption(): HTMLTableCaptionElement {
    TODO("Not yet implemented")
  }
  
  actual fun deleteCaption() {
  }
  
  actual fun createTHead(): HTMLTableSectionElement {
    TODO("Not yet implemented")
  }
  
  actual fun deleteTHead() {
  }
  
  actual fun createTFoot(): HTMLTableSectionElement {
    TODO("Not yet implemented")
  }
  
  actual fun deleteTFoot() {
  }
  
  actual fun createTBody(): HTMLTableSectionElement {
    TODO("Not yet implemented")
  }
  
  actual fun insertRow(index: Int): HTMLTableRowElement {
    TODO("Not yet implemented")
  }
  
  actual fun deleteRow(index: Int) {
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