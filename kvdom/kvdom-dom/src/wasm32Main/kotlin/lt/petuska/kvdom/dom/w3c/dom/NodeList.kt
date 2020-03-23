package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [NodeList](https://developer.mozilla.org/en/docs/Web/API/NodeList) to Kotlin
 */
@NoWASM
actual abstract class NodeList actual constructor() : ItemArrayLike<Node> {
  actual override fun item(index: Int): Node? {
    TODO("Not yet implemented")
  }
}

@NoWASM
actual operator fun NodeList.get(index: Int): Node? {
  TODO("Not yet implemented")
}