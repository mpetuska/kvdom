package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NonDocumentTypeChildNode](https://developer.mozilla.org/en/docs/Web/API/NonDocumentTypeChildNode) to Kotlin
 */
expect interface NonDocumentTypeChildNode {
  val previousElementSibling: Element?
  val nextElementSibling: Element?
}