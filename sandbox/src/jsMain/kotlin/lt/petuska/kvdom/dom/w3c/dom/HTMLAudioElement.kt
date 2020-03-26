package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLAudioElement](https://developer.mozilla.org/en/docs/Web/API/HTMLAudioElement) to Kotlin
 */
actual abstract external class HTMLAudioElement : HTMLMediaElement {
  actual companion object {
    actual val NETWORK_EMPTY: Short
    actual val NETWORK_IDLE: Short
    actual val NETWORK_LOADING: Short
    actual val NETWORK_NO_SOURCE: Short
    actual val HAVE_NOTHING: Short
    actual val HAVE_METADATA: Short
    actual val HAVE_CURRENT_DATA: Short
    actual val HAVE_FUTURE_DATA: Short
    actual val HAVE_ENOUGH_DATA: Short
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