package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NonDocumentTypeChildNode](https://developer.mozilla.org/en/docs/Web/API/NonDocumentTypeChildNode) to Kotlin
 */
actual external interface NonDocumentTypeChildNode {
  //    get() = definedExternally
  actual val previousElementSibling: Element?
  actual val nextElementSibling: Element?
}