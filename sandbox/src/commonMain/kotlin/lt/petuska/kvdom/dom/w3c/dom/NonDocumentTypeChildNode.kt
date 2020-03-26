package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [NonDocumentTypeChildNode](https://developer.mozilla.org/en/docs/Web/API/NonDocumentTypeChildNode) to Kotlin
 */
@NoWASM
expect interface NonDocumentTypeChildNode {
  val previousElementSibling: Element?
  val nextElementSibling: Element?
}