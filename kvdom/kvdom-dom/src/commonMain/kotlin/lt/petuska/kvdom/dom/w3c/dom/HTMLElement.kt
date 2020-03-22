package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.css.ElementCSSInlineStyle

/**
 * Exposes the JavaScript [HTMLElement](https://developer.mozilla.org/en/docs/Web/API/HTMLElement) to Kotlin
 */
expect abstract class HTMLElement() : Element,
  GlobalEventHandlers,
  DocumentAndElementEventHandlers,
  ElementContentEditable, ElementCSSInlineStyle {
  open var title: String
  open var lang: String
  open var translate: Boolean
  open var dir: String
  open val dataset: DOMStringMap
  open var hidden: Boolean
  open var tabIndex: Int
  open var accessKey: String
  open val accessKeyLabel: String
  open var draggable: Boolean
  open val dropzone: DOMTokenList
  open var contextMenu: HTMLMenuElement?
  open var spellcheck: Boolean
  open var innerText: String
  open val offsetParent: Element?
  open val offsetTop: Int
  open val offsetLeft: Int
  open val offsetWidth: Int
  open val offsetHeight: Int
  fun click()
  fun focus()
  fun blur()
  fun forceSpellCheck()
  
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