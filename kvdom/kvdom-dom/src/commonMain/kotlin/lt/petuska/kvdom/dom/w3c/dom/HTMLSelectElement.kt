package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [HTMLSelectElement](https://developer.mozilla.org/en/docs/Web/API/HTMLSelectElement) to Kotlin
 */
@NoWASM
expect abstract class HTMLSelectElement : HTMLElement, ItemArrayLike<Element> {
  open var autocomplete: String
  open var autofocus: Boolean
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open var multiple: Boolean
  open var name: String
  open var required: Boolean
  open var size: Int
  open val type: String
  open val options: HTMLOptionsCollection
  override var length: Int
  open val selectedOptions: HTMLCollection
  open var selectedIndex: Int
  open var value: String
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  open val labels: NodeList
  fun namedItem(name: String): HTMLOptionElement?
  fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Dynamic = null)
  fun remove(index: Int)
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  fun setCustomValidity(error: String)
  override fun item(index: Int): Element?
  
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

@NoWASM
expect operator fun HTMLSelectElement.get(index: Int): Element?

@NoWASM
expect operator fun HTMLSelectElement.set(index: Int, option: HTMLOptionElement?)
