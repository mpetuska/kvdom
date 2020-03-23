package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [NodeList](https://developer.mozilla.org/en/docs/Web/API/NodeList) to Kotlin
 */
@NoWASM
expect abstract class NodeList() : ItemArrayLike<Node> {
  override fun item(index: Int): Node?
}

@NoWASM
expect operator fun NodeList.get(index: Int): Node?