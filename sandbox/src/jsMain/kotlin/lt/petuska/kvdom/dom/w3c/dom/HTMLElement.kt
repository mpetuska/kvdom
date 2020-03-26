package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.css.ElementCSSInlineStyle

/**
 * Exposes the JavaScript [HTMLElement](https://developer.mozilla.org/en/docs/Web/API/HTMLElement) to Kotlin
 */
actual abstract external class HTMLElement : Element, GlobalEventHandlers, DocumentAndElementEventHandlers,
  ElementContentEditable, ElementCSSInlineStyle {
  actual open var title: String
  actual open var lang: String
  actual open var translate: Boolean
  actual open var dir: String
  actual open val dataset: DOMStringMap
  actual open var hidden: Boolean
  actual open var tabIndex: Int
  actual open var accessKey: String
  actual open val accessKeyLabel: String
  actual open var draggable: Boolean
  actual open val dropzone: DOMTokenList
  actual open var contextMenu: HTMLMenuElement?
  actual open var spellcheck: Boolean
  actual open var innerText: String
  actual open val offsetParent: Element?
  actual open val offsetTop: Int
  actual open val offsetLeft: Int
  actual open val offsetWidth: Int
  actual open val offsetHeight: Int
  
  actual fun click()
  actual fun focus()
  actual fun blur()
  actual fun forceSpellCheck()
  
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