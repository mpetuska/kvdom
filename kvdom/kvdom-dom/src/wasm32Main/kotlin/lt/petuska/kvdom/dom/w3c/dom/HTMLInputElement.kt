package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.files.FileList

/**
 * Exposes the JavaScript [HTMLInputElement](https://developer.mozilla.org/en/docs/Web/API/HTMLInputElement) to Kotlin
 */
actual abstract class HTMLInputElement actual constructor() : HTMLElement() {
  actual open var accept: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var alt: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var autocomplete: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var autofocus: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var defaultChecked: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var checked: Boolean
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
  actual open val files: FileList?
    get() = TODO("Not yet implemented")
  actual open var formAction: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var formEnctype: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var formMethod: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var formNoValidate: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var formTarget: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var height: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var indeterminate: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var inputMode: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val list: HTMLElement?
    get() = TODO("Not yet implemented")
  actual open var max: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var maxLength: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var min: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var minLength: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var multiple: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var name: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var pattern: String
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
  actual open var size: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var src: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var step: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var type: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var defaultValue: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var value: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var valueAsDate: Any
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var valueAsNumber: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var width: Int
    get() = TODO("Not yet implemented")
    set(value) {}
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
  actual open var align: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var useMap: String
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun stepUp(n: Int) {
  }
  
  actual fun stepDown(n: Int) {
  }
  
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