package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NodeList](https://developer.mozilla.org/en/docs/Web/API/NodeList) to Kotlin
 */
expect abstract class NodeList() : ItemArrayLike<Node> {
  override fun item(index: Int): Node?
}

expect inline operator fun NodeList.get(index: Int): Node?

expect inline operator fun HTMLCollection.get(index: Int): Element?

expect inline operator fun HTMLCollection.get(name: String): Element?
