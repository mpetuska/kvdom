package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource
import lt.petuska.kvdom.dom.w3c.files.Blob

/**
 * Exposes the JavaScript [HTMLCanvasElement](https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement) to Kotlin
 */
actual abstract external class HTMLCanvasElement : HTMLElement, CanvasImageSource, TexImageSource {
  actual open var width: Int
  actual open var height: Int
  actual fun getContext(contextId: String, vararg arguments: Any?): RenderingContext?
  actual fun toDataURL(type: String, quality: Any?): String
  actual fun toBlob(_callback: (Blob?) -> Unit, type: String, quality: Any?)
  
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