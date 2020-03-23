package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [HTMLAreaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLAreaElement) to Kotlin
 */
@NoWASM
actual abstract class HTMLAreaElement : HTMLElement(), HTMLHyperlinkElementUtils {
  actual open var alt: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var coords: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var shape: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var target: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var download: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var ping: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var rel: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val relList: DOMTokenList
    get() = TODO("Not yet implemented")
  actual open var referrerPolicy: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var noHref: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  
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