package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLFormElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFormElement) to Kotlin
 */
actual abstract external class HTMLFormElement : HTMLElement {
  actual open var acceptCharset: String
  actual open var action: String
  actual open var autocomplete: String
  actual open var enctype: String
  actual open var encoding: String
  actual open var method: String
  actual open var name: String
  actual open var noValidate: Boolean
  actual open var target: String
  actual open val elements: HTMLFormControlsCollection
  actual open val length: Int
  actual fun submit()
  actual fun reset()
  actual fun checkValidity(): Boolean
  actual fun reportValidity(): Boolean
  
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
actual operator fun HTMLFormElement.get(index: Int): Element? = asDynamic()[index]

@Suppress("UnsafeCastFromDynamic")
actual operator fun HTMLFormElement.get(name: String): UnionElementOrRadioNodeList? = asDynamic()[name]