package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLObjectElement](https://developer.mozilla.org/en/docs/Web/API/HTMLObjectElement) to Kotlin
 */
actual abstract external class HTMLObjectElement : HTMLElement {
  actual open var data: String
  actual open var type: String
  actual open var typeMustMatch: Boolean
  actual open var name: String
  actual open var useMap: String
  actual open val form: HTMLFormElement?
  actual open var width: String
  actual open var height: String
  actual open val contentDocument: Document?
  actual open val contentWindow: Window?
  actual open val willValidate: Boolean
  actual open val validity: ValidityState
  actual open val validationMessage: String
  actual open var align: String
  actual open var archive: String
  actual open var code: String
  actual open var declare: Boolean
  actual open var hspace: Int
  actual open var standby: String
  actual open var vspace: Int
  actual open var codeBase: String
  actual open var codeType: String
  actual open var border: String
  actual fun getSVGDocument(): Document?
  actual fun checkValidity(): Boolean
  actual fun reportValidity(): Boolean
  actual fun setCustomValidity(error: String)
  
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