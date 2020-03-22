package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NodeIterator](https://developer.mozilla.org/en/docs/Web/API/NodeIterator) to Kotlin
 */
expect abstract class NodeIterator() {
  open val root: Node
  open val referenceNode: Node
  open val pointerBeforeReferenceNode: Boolean
  open val whatToShow: Int
  open val filter: NodeFilter?
  fun nextNode(): Node?
  fun previousNode(): Node?
  fun detach()
}