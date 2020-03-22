package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLTextAreaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTextAreaElement) to Kotlin
 */
expect abstract class HTMLTextAreaElement() : HTMLElement {
  open var autocomplete: String
  open var autofocus: Boolean
  open var cols: Int
  open var dirName: String
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open var inputMode: String
  open var maxLength: Int
  open var minLength: Int
  open var name: String
  open var placeholder: String
  open var readOnly: Boolean
  open var required: Boolean
  open var rows: Int
  open var wrap: String
  open val type: String
  open var defaultValue: String
  open var value: String
  open val textLength: Int
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  open val labels: NodeList
  open var selectionStart: Int?
  open var selectionEnd: Int?
  open var selectionDirection: String?
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