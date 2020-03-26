package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [NonDocumentTypeChildNode](https://developer.mozilla.org/en/docs/Web/API/NonDocumentTypeChildNode) to Kotlin
 */
@NoWASM
actual interface NonDocumentTypeChildNode {
  //    get() = definedExternally
  actual val previousElementSibling: Element?
  actual val nextElementSibling: Element?
}