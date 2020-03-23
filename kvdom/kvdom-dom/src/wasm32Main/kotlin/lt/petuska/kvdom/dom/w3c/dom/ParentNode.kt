package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [ParentNode](https://developer.mozilla.org/en/docs/Web/API/ParentNode) to Kotlin
 */
@NoWASM
actual interface ParentNode {
  actual val children: HTMLCollection
  actual val firstElementChild: Element?
  actual val lastElementChild: Element?
  actual val childElementCount: Int
  actual fun prepend(vararg nodes: Dynamic)
  actual fun append(vararg nodes: Dynamic)
  actual fun querySelector(selectors: String): Element?
  actual fun querySelectorAll(selectors: String): NodeList
}