package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NonDocumentTypeChildNode](https://developer.mozilla.org/en/docs/Web/API/NonDocumentTypeChildNode) to Kotlin
 */
actual interface NonDocumentTypeChildNode {
  actual val previousElementSibling: Element?
  actual val nextElementSibling: Element?
}