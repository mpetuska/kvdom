package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NodeList](https://developer.mozilla.org/en/docs/Web/API/NodeList) to Kotlin
 */
actual abstract class NodeList actual constructor() : ItemArrayLike<Node> {
  actual override fun item(index: Int): Node? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun NodeList.get(index: Int): Node? {
  TODO("Not yet implemented")
}

actual inline operator fun HTMLCollection.get(index: Int): Element? {
  TODO("Not yet implemented")
}

actual inline operator fun HTMLCollection.get(name: String): Element? {
  TODO("Not yet implemented")
}