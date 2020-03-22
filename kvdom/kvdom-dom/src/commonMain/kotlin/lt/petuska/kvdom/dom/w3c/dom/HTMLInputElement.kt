package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.files.FileList

/**
 * Exposes the JavaScript [HTMLInputElement](https://developer.mozilla.org/en/docs/Web/API/HTMLInputElement) to Kotlin
 */
expect abstract class HTMLInputElement() : HTMLElement {
  open var accept: String
  open var alt: String
  open var autocomplete: String
  open var autofocus: Boolean
  open var defaultChecked: Boolean
  open var checked: Boolean
  open var dirName: String
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open val files: FileList?
  open var formAction: String
  open var formEnctype: String
  open var formMethod: String
  open var formNoValidate: Boolean
  open var formTarget: String
  open var height: Int
  open var indeterminate: Boolean
  open var inputMode: String
  open val list: HTMLElement?
  open var max: String
  open var maxLength: Int
  open var min: String
  open var minLength: Int
  open var multiple: Boolean
  open var name: String
  open var pattern: String
  open var placeholder: String
  open var readOnly: Boolean
  open var required: Boolean
  open var size: Int
  open var src: String
  open var step: String
  open var type: String
  open var defaultValue: String
  open var value: String
  open var valueAsDate: Any
  open var valueAsNumber: Double
  open var width: Int
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  open val labels: NodeList
  open var selectionStart: Int?
  open var selectionEnd: Int?
  open var selectionDirection: String?
  open var align: String
  open var useMap: String
  fun stepUp(n: Int)
  fun stepDown(n: Int)
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  fun setCustomValidity(error: String)
  fun select()
  fun setRangeText(replacement: String)
  fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode)
  fun setSelectionRange(start: Int, end: Int, direction: String)
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}