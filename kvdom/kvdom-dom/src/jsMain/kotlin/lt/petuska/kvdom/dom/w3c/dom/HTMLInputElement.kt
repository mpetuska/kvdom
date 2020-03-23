package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.files.FileList

/**
 * Exposes the JavaScript [HTMLInputElement](https://developer.mozilla.org/en/docs/Web/API/HTMLInputElement) to Kotlin
 */
actual abstract external class HTMLInputElement : HTMLElement {
  actual open var accept: String
  actual open var alt: String
  actual open var autocomplete: String
  actual open var autofocus: Boolean
  actual open var defaultChecked: Boolean
  actual open var checked: Boolean
  actual open var dirName: String
  actual open var disabled: Boolean
  actual open val form: HTMLFormElement?
  actual open val files: FileList?
  actual open var formAction: String
  actual open var formEnctype: String
  actual open var formMethod: String
  actual open var formNoValidate: Boolean
  actual open var formTarget: String
  actual open var height: Int
  actual open var indeterminate: Boolean
  actual open var inputMode: String
  actual open val list: HTMLElement?
  actual open var max: String
  actual open var maxLength: Int
  actual open var min: String
  actual open var minLength: Int
  actual open var multiple: Boolean
  actual open var name: String
  actual open var pattern: String
  actual open var placeholder: String
  actual open var readOnly: Boolean
  actual open var required: Boolean
  actual open var size: Int
  actual open var src: String
  actual open var step: String
  actual open var type: String
  actual open var defaultValue: String
  actual open var value: String
  actual open var valueAsDate: Dynamic
  actual open var valueAsNumber: Double
  actual open var width: Int
  actual open val willValidate: Boolean
  actual open val validity: ValidityState
  actual open val validationMessage: String
  actual open val labels: NodeList
  actual open var selectionStart: Int?
  actual open var selectionEnd: Int?
  actual open var selectionDirection: String?
  actual open var align: String
  actual open var useMap: String
  actual fun stepUp(n: Int)
  actual fun stepDown(n: Int)
  actual fun checkValidity(): Boolean
  actual fun reportValidity(): Boolean
  actual fun setCustomValidity(error: String)
  actual fun select()
  actual fun setRangeText(replacement: String)
  actual fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode)
  actual fun setSelectionRange(start: Int, end: Int, direction: String)
  
  actual companion object {
    actual val ELEMENT_NODE: Short
    actual val ATTRIBUTE_NODE: Short
    actual val TEXT_NODE: Short
    actual val CDATA_SECTION_NODE: Short
    actual val ENTITY_REFERENCE_NODE: Short
    actual val ENTITY_NODE: Short
    actual val PROCESSING_INSTRUCTION_NODE: Short
    actual val COMMENT_NODE: Short
    actual val DOCUMENT_NODE: Short
    actual val DOCUMENT_TYPE_NODE: Short
    actual val DOCUMENT_FRAGMENT_NODE: Short
    actual val NOTATION_NODE: Short
    actual val DOCUMENT_POSITION_DISCONNECTED: Short
    actual val DOCUMENT_POSITION_PRECEDING: Short
    actual val DOCUMENT_POSITION_FOLLOWING: Short
    actual val DOCUMENT_POSITION_CONTAINS: Short
    actual val DOCUMENT_POSITION_CONTAINED_BY: Short
    actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}