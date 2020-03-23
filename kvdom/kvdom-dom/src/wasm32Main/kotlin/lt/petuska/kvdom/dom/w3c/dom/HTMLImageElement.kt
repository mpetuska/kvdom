package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource

/**
 * Exposes the JavaScript [HTMLImageElement](https://developer.mozilla.org/en/docs/Web/API/HTMLImageElement) to Kotlin
 */
@NoWASM
actual abstract class HTMLImageElement : HTMLElement(), HTMLOrSVGImageElement, TexImageSource {
  actual open var alt: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var src: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var srcset: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var sizes: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var crossOrigin: String?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var useMap: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var isMap: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var width: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var height: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val naturalWidth: Int
    get() = TODO("Not yet implemented")
  actual open val naturalHeight: Int
    get() = TODO("Not yet implemented")
  actual open val complete: Boolean
    get() = TODO("Not yet implemented")
  actual open val currentSrc: String
    get() = TODO("Not yet implemented")
  actual open var referrerPolicy: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var name: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var lowsrc: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var align: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var hspace: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var vspace: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var longDesc: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var border: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val x: Int
    get() = TODO("Not yet implemented")
  actual open val y: Int
    get() = TODO("Not yet implemented")
  
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