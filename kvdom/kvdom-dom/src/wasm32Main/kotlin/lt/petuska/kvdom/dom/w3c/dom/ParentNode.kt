package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ParentNode](https://developer.mozilla.org/en/docs/Web/API/ParentNode) to Kotlin
 */
actual interface ParentNode {
  actual val children: HTMLCollection
  actual val firstElementChild: Element?
  actual val lastElementChild: Element?
  actual val childElementCount: Int
  actual fun prepend(vararg nodes: Any)
  actual fun append(vararg nodes: Any)
  actual fun querySelector(selectors: String): Element?
  actual fun querySelectorAll(selectors: String): NodeList
}