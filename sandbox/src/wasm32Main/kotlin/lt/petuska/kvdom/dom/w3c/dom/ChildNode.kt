package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

/**
 * Exposes the JavaScript [ChildNode](https://developer.mozilla.org/en/docs/Web/API/ChildNode) to Kotlin
 */
actual interface ChildNode {
  actual fun before(vararg nodes: Dynamic)
  actual fun after(vararg nodes: Dynamic)
  actual fun replaceWith(vararg nodes: Dynamic)
  actual fun remove()
}