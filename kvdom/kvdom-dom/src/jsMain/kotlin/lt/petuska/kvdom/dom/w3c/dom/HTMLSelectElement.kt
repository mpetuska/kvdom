package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

/**
 * Exposes the JavaScript [HTMLSelectElement](https://developer.mozilla.org/en/docs/Web/API/HTMLSelectElement) to Kotlin
 */
actual abstract external class HTMLSelectElement : HTMLElement, ItemArrayLike<Element> {
  actual open var autocomplete: String
  actual open var autofocus: Boolean
  actual open var disabled: Boolean
  actual open val form: HTMLFormElement?
  actual open var multiple: Boolean
  actual open var name: String
  actual open var required: Boolean
  actual open var size: Int
  actual open val type: String
  actual open val options: HTMLOptionsCollection
  actual override var length: Int
  actual open val selectedOptions: HTMLCollection
  actual open var selectedIndex: Int
  actual open var value: String
  actual open val willValidate: Boolean
  actual open val validity: ValidityState
  actual open val validationMessage: String
  actual open val labels: NodeList
  actual fun namedItem(name: String): HTMLOptionElement?
  actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Dynamic)
  actual fun remove(index: Int)
  actual fun checkValidity(): Boolean
  actual fun reportValidity(): Boolean
  actual fun setCustomValidity(error: String)
  actual override fun item(index: Int): Element?
  
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

@Suppress("UnsafeCastFromDynamic")
actual operator fun HTMLSelectElement.get(index: Int): Element? = asDynamic()[index]
actual operator fun HTMLSelectElement.set(
  index: Int,
  option: HTMLOptionElement?
) {
  asDynamic()[index] = option
}