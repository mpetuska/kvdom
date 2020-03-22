package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ChildNode](https://developer.mozilla.org/en/docs/Web/API/ChildNode) to Kotlin
 */
actual interface ChildNode {
  actual fun before(vararg nodes: Any)
  actual fun after(vararg nodes: Any)
  actual fun replaceWith(vararg nodes: Any)
  actual fun remove()
}