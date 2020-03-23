package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [HTMLButtonElement](https://developer.mozilla.org/en/docs/Web/API/HTMLButtonElement) to Kotlin
 */
@NoWASM
expect abstract class HTMLButtonElement : HTMLElement {
  open var autofocus: Boolean
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open var formAction: String
  open var formEnctype: String
  open var formMethod: String
  open var formNoValidate: Boolean
  open var formTarget: String
  open var name: String
  open var type: String
  open var value: String
  open var menu: HTMLMenuElement?
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  open val labels: NodeList
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  fun setCustomValidity(error: String)
  
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