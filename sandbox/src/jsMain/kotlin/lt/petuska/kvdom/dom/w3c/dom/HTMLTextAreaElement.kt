package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLTextAreaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTextAreaElement) to Kotlin
 */
actual abstract external class HTMLTextAreaElement : HTMLElement {
  actual open var autocomplete: String
  actual open var autofocus: Boolean
  actual open var cols: Int
  actual open var dirName: String
  actual open var disabled: Boolean
  actual open val form: HTMLFormElement?
  actual open var inputMode: String
  actual open var maxLength: Int
  actual open var minLength: Int
  actual open var name: String
  actual open var placeholder: String
  actual open var readOnly: Boolean
  actual open var required: Boolean
  actual open var rows: Int
  actual open var wrap: String
  actual open val type: String
  actual open var defaultValue: String
  actual open var value: String
  actual open val textLength: Int
  actual open val willValidate: Boolean
  actual open val validity: ValidityState
  actual open val validationMessage: String
  actual open val labels: NodeList
  actual open var selectionStart: Int?
  actual open var selectionEnd: Int?
  actual open var selectionDirection: String?
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