package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NodeList](https://developer.mozilla.org/en/docs/Web/API/NodeList) to Kotlin
 */
actual abstract external class NodeList : ItemArrayLike<Node> {
  actual override fun item(index: Int): Node?
}

@Suppress("UnsafeCastFromDynamic")
actual operator fun NodeList.get(index: Int): Node? = asDynamic()[index]