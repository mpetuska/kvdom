package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLSelectElement](https://developer.mozilla.org/en/docs/Web/API/HTMLSelectElement) to Kotlin
 */
actual abstract class HTMLSelectElement actual constructor() : HTMLElement(),
  ItemArrayLike<Element> {
  actual open var autocomplete: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var autofocus: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var disabled: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val form: HTMLFormElement?
    get() = TODO("Not yet implemented")
  actual open var multiple: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var name: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var required: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var size: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val type: String
    get() = TODO("Not yet implemented")
  actual open val options: HTMLOptionsCollection
    get() = TODO("Not yet implemented")
  actual override var length: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val selectedOptions: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open var selectedIndex: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var value: String
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
  
  actual fun namedItem(name: String): HTMLOptionElement? {
    TODO("Not yet implemented")
  }
  
  actual fun add(
    element: UnionHTMLOptGroupElementOrHTMLOptionElement,
    before: Any
  ) {
  }
  
  actual fun remove(index: Int) {
  }
  
  actual fun checkValidity(): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun reportValidity(): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun setCustomValidity(error: String) {
  }
  
  actual override fun item(index: Int): Element? {
    TODO("Not yet implemented")
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

actual inline operator fun HTMLSelectElement.get(index: Int): Element? {
  TODO("Not yet implemented")
}

actual inline operator fun HTMLSelectElement.set(
  index: Int,
  option: HTMLOptionElement?
) {
}