package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource

/**
 * Exposes the JavaScript [HTMLImageElement](https://developer.mozilla.org/en/docs/Web/API/HTMLImageElement) to Kotlin
 */
expect abstract class HTMLImageElement() : HTMLElement,
  HTMLOrSVGImageElement, TexImageSource {
  open var alt: String
  open var src: String
  open var srcset: String
  open var sizes: String
  open var crossOrigin: String?
  open var useMap: String
  open var isMap: Boolean
  open var width: Int
  open var height: Int
  open val naturalWidth: Int
  open val naturalHeight: Int
  open val complete: Boolean
  open val currentSrc: String
  open var referrerPolicy: String
  open var name: String
  open var lowsrc: String
  open var align: String
  open var hspace: Int
  open var vspace: Int
  open var longDesc: String
  open var border: String
  open val x: Int
  open val y: Int
  
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