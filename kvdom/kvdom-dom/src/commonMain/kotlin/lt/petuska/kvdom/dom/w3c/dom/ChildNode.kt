package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ChildNode](https://developer.mozilla.org/en/docs/Web/API/ChildNode) to Kotlin
 */
expect interface ChildNode {
  fun before(vararg nodes: Any)
  fun after(vararg nodes: Any)
  fun replaceWith(vararg nodes: Any)
  fun remove()
}