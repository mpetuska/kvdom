package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource

/**
 * Exposes the JavaScript [HTMLVideoElement](https://developer.mozilla.org/en/docs/Web/API/HTMLVideoElement) to Kotlin
 */
@NoWASM
expect abstract class HTMLVideoElement : HTMLMediaElement, CanvasImageSource, TexImageSource {
  open var width: Int
  open var height: Int
  open val videoWidth: Int
  open val videoHeight: Int
  open var poster: String
  open var playsInline: Boolean
  
  companion object {
    val NETWORK_EMPTY: Short
    val NETWORK_IDLE: Short
    val NETWORK_LOADING: Short
    val NETWORK_NO_SOURCE: Short
    val HAVE_NOTHING: Short
    val HAVE_METADATA: Short
    val HAVE_CURRENT_DATA: Short
    val HAVE_FUTURE_DATA: Short
    val HAVE_ENOUGH_DATA: Short
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