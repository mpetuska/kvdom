package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NodeFilter](https://developer.mozilla.org/en/docs/Web/API/NodeFilter) to Kotlin
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual interface NodeFilter {
  actual fun acceptNode(node: Node): Short
  
  actual companion object {
    actual val FILTER_ACCEPT: Short
      get() = TODO("Not yet implemented")
    actual val FILTER_REJECT: Short
      get() = TODO("Not yet implemented")
    actual val FILTER_SKIP: Short
      get() = TODO("Not yet implemented")
    actual val SHOW_ALL: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_ELEMENT: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_ATTRIBUTE: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_TEXT: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_CDATA_SECTION: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_ENTITY_REFERENCE: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_ENTITY: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_PROCESSING_INSTRUCTION: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_COMMENT: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_DOCUMENT: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_DOCUMENT_TYPE: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_DOCUMENT_FRAGMENT: Int
      get() = TODO("Not yet implemented")
    actual val SHOW_NOTATION: Int
      get() = TODO("Not yet implemented")
  }
  
}