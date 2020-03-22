package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NodeFilter](https://developer.mozilla.org/en/docs/Web/API/NodeFilter) to Kotlin
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface NodeFilter {
  fun acceptNode(node: Node): Short
  
  companion object {
    val FILTER_ACCEPT: Short
    val FILTER_REJECT: Short
    val FILTER_SKIP: Short
    val SHOW_ALL: Int
    val SHOW_ELEMENT: Int
    val SHOW_ATTRIBUTE: Int
    val SHOW_TEXT: Int
    val SHOW_CDATA_SECTION: Int
    val SHOW_ENTITY_REFERENCE: Int
    val SHOW_ENTITY: Int
    val SHOW_PROCESSING_INSTRUCTION: Int
    val SHOW_COMMENT: Int
    val SHOW_DOCUMENT: Int
    val SHOW_DOCUMENT_TYPE: Int
    val SHOW_DOCUMENT_FRAGMENT: Int
    val SHOW_NOTATION: Int
  }
}