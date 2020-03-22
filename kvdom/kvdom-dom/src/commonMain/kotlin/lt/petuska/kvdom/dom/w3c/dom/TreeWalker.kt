package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [TreeWalker](https://developer.mozilla.org/en/docs/Web/API/TreeWalker) to Kotlin
 */
expect abstract class TreeWalker() {
  open val root: Node
  open val whatToShow: Int
  open val filter: NodeFilter?
  open var currentNode: Node
  fun parentNode(): Node?
  fun firstChild(): Node?
  fun lastChild(): Node?
  fun previousSibling(): Node?
  fun nextSibling(): Node?
  fun previousNode(): Node?
  fun nextNode(): Node?
}