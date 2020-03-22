package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMImplementation](https://developer.mozilla.org/en/docs/Web/API/DOMImplementation) to Kotlin
 */
actual abstract class DOMImplementation actual constructor() {
  actual fun createDocumentType(
    qualifiedName: String,
    publicId: String,
    systemId: String
  ): DocumentType {
    TODO("Not yet implemented")
  }
  
  actual fun createDocument(
    namespace: String?,
    qualifiedName: String,
    doctype: DocumentType?
  ): XMLDocument {
    TODO("Not yet implemented")
  }
  
  actual fun createHTMLDocument(title: String): Document {
    TODO("Not yet implemented")
  }
  
  actual fun hasFeature(): Boolean {
    TODO("Not yet implemented")
  }
}