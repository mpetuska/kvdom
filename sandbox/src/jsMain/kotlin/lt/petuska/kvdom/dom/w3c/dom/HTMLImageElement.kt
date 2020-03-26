package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource

/**
 * Exposes the JavaScript [HTMLImageElement](https://developer.mozilla.org/en/docs/Web/API/HTMLImageElement) to Kotlin
 */
actual abstract external class HTMLImageElement : HTMLElement, HTMLOrSVGImageElement, TexImageSource {
  actual open var alt: String
  actual open var src: String
  actual open var srcset: String
  actual open var sizes: String
  actual open var crossOrigin: String?
  actual open var useMap: String
  actual open var isMap: Boolean
  actual open var width: Int
  actual open var height: Int
  actual open val naturalWidth: Int
  actual open val naturalHeight: Int
  actual open val complete: Boolean
  actual open val currentSrc: String
  actual open var referrerPolicy: String
  actual open var name: String
  actual open var lowsrc: String
  actual open var align: String
  actual open var hspace: Int
  actual open var vspace: Int
  actual open var longDesc: String
  actual open var border: String
  actual open val x: Int
  actual open val y: Int
  
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