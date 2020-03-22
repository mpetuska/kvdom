package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLFormElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFormElement) to Kotlin
 */
actual abstract class HTMLFormElement actual constructor() : HTMLElement() {
  actual open var acceptCharset: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var action: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var autocomplete: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var enctype: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var encoding: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var method: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var name: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var noValidate: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var target: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val elements: HTMLFormControlsCollection
    get() = TODO("Not yet implemented")
  actual open val length: Int
    get() = TODO("Not yet implemented")
  
  actual fun submit() {
  }
  
  actual fun reset() {
  }
  
  actual fun checkValidity(): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun reportValidity(): Boolean {
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

actual inline operator fun HTMLFormElement.get(index: Int): Element? {
  TODO("Not yet implemented")
}

actual inline operator fun HTMLFormElement.get(name: String): UnionElementOrRadioNodeList? {
  TODO("Not yet implemented")
}