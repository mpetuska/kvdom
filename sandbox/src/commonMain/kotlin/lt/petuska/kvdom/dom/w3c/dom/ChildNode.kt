package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

/**
 * Exposes the JavaScript [ChildNode](https://developer.mozilla.org/en/docs/Web/API/ChildNode) to Kotlin
 */
expect interface ChildNode {
  fun before(vararg nodes: Dynamic)
  fun after(vararg nodes: Dynamic)
  fun replaceWith(vararg nodes: Dynamic)
  fun remove()
}