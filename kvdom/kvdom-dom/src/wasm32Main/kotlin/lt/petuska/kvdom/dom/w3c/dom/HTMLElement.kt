package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.css.ElementCSSInlineStyle

/**
 * Exposes the JavaScript [HTMLElement](https://developer.mozilla.org/en/docs/Web/API/HTMLElement) to Kotlin
 */
actual abstract class HTMLElement actual constructor() : Element(),
  GlobalEventHandlers,
  DocumentAndElementEventHandlers,
  ElementContentEditable, ElementCSSInlineStyle {
  actual open var title: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var lang: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var translate: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var dir: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val dataset: DOMStringMap
    get() = TODO("Not yet implemented")
  actual open var hidden: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var tabIndex: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var accessKey: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val accessKeyLabel: String
    get() = TODO("Not yet implemented")
  actual open var draggable: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val dropzone: DOMTokenList
    get() = TODO("Not yet implemented")
  actual open var contextMenu: HTMLMenuElement?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var spellcheck: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var innerText: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val offsetParent: Element?
    get() = TODO("Not yet implemented")
  actual open val offsetTop: Int
    get() = TODO("Not yet implemented")
  actual open val offsetLeft: Int
    get() = TODO("Not yet implemented")
  actual open val offsetWidth: Int
    get() = TODO("Not yet implemented")
  actual open val offsetHeight: Int
    get() = TODO("Not yet implemented")
  
  actual fun click() {
  }
  
  actual fun focus() {
  }
  
  actual fun blur() {
  }
  
  actual fun forceSpellCheck() {
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