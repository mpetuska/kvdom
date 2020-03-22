package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ParentNode](https://developer.mozilla.org/en/docs/Web/API/ParentNode) to Kotlin
 */
expect interface ParentNode {
  val children: HTMLCollection
  val firstElementChild: Element?
  val lastElementChild: Element?
  val childElementCount: Int
  fun prepend(vararg nodes: Any)
  fun append(vararg nodes: Any)
  fun querySelector(selectors: String): Element?
  fun querySelectorAll(selectors: String): NodeList
}