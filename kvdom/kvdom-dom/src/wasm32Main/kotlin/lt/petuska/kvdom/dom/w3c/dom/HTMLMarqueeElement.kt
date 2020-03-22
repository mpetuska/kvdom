package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [HTMLMarqueeElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMarqueeElement) to Kotlin
 */
actual abstract class HTMLMarqueeElement actual constructor() : HTMLElement() {
  actual open var behavior: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var bgColor: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var direction: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var height: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var hspace: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var loop: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var scrollAmount: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var scrollDelay: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var trueSpeed: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var vspace: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var width: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onbounce: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onfinish: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onstart: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun start() {
  }
  
  actual fun stop() {
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