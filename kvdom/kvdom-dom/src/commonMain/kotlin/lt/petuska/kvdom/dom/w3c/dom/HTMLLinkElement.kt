package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.css.LinkStyle
import lt.petuska.kvdom.dom.w3c.fetch.RequestDestination

/**
 * Exposes the JavaScript [HTMLLinkElement](https://developer.mozilla.org/en/docs/Web/API/HTMLLinkElement) to Kotlin
 */
expect abstract class HTMLLinkElement() : HTMLElement, LinkStyle {
  open var href: String
  open var crossOrigin: String?
  open var rel: String
  open var `as`: RequestDestination
  open val relList: DOMTokenList
  open var media: String
  open var nonce: String
  open var hreflang: String
  open var type: String
  open val sizes: DOMTokenList
  open var referrerPolicy: String
  open var charset: String
  open var rev: String
  open var target: String
  open var scope: String
  open var workerType: WorkerType
  
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