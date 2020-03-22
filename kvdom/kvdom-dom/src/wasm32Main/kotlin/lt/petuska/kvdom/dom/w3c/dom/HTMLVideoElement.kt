package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource

/**
 * Exposes the JavaScript [HTMLVideoElement](https://developer.mozilla.org/en/docs/Web/API/HTMLVideoElement) to Kotlin
 */
actual abstract class HTMLVideoElement actual constructor() : HTMLMediaElement(),
  CanvasImageSource, TexImageSource {
  actual open var width: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var height: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val videoWidth: Int
    get() = TODO("Not yet implemented")
  actual open val videoHeight: Int
    get() = TODO("Not yet implemented")
  actual open var poster: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var playsInline: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual companion object {
    actual val NETWORK_EMPTY: Short
      get() = TODO("Not yet implemented")
    actual val NETWORK_IDLE: Short
      get() = TODO("Not yet implemented")
    actual val NETWORK_LOADING: Short
      get() = TODO("Not yet implemented")
    actual val NETWORK_NO_SOURCE: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_NOTHING: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_METADATA: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_CURRENT_DATA: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_FUTURE_DATA: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_ENOUGH_DATA: Short
      get() = TODO("Not yet implemented")
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