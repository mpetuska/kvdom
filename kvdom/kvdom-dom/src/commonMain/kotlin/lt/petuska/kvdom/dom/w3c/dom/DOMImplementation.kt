package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMImplementation](https://developer.mozilla.org/en/docs/Web/API/DOMImplementation) to Kotlin
 */
expect abstract class DOMImplementation() {
  fun createDocumentType(qualifiedName: String, publicId: String, systemId: String): DocumentType
  fun createDocument(namespace: String?, qualifiedName: String, doctype: DocumentType?): XMLDocument
  fun createHTMLDocument(title: String): Document
  fun hasFeature(): Boolean
}