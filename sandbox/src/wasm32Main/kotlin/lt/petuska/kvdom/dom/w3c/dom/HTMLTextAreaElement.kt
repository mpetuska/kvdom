package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [HTMLTextAreaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTextAreaElement) to Kotlin
 */
@NoWASM
actual abstract class HTMLTextAreaElement : HTMLElement() {
  actual open var autocomplete: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var autofocus: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var cols: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var dirName: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var disabled: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val form: HTMLFormElement?
    get() = TODO("Not yet implemented")
  actual open var inputMode: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var maxLength: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var minLength: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var name: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var placeholder: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var readOnly: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var required: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var rows: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var wrap: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val type: String
    get() = TODO("Not yet implemented")
  actual open var defaultValue: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var value: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val textLength: Int
    get() = TODO("Not yet implemented")
  actual open val willValidate: Boolean
    get() = TODO("Not yet implemented")
  actual open val validity: ValidityState
    get() = TODO("Not yet implemented")
  actual open val validationMessage: String
    get() = TODO("Not yet implemented")
  actual open val labels: NodeList
    get() = TODO("Not yet implemented")
  actual open var selectionStart: Int?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var selectionEnd: Int?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var selectionDirection: String?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun checkValidity(): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun reportValidity(): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun setCustomValidity(error: String) {
  }
  
  actual fun select() {
  }
  
  actual fun setRangeText(replacement: String) {
  }
  
  actual fun setRangeText(
    replacement: String,
    start: Int,
    end: Int,
    selectionMode: SelectionMode
  ) {
  }
  
  actual fun setSelectionRange(start: Int, end: Int, direction: String) {
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