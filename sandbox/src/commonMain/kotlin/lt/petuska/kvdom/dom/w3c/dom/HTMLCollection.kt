package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [HTMLCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLCollection) to Kotlin
 */
@NoWASM
expect abstract class HTMLCollection() : ItemArrayLike<Element>,
  UnionElementOrHTMLCollection {
  override fun item(index: Int): Element?
  fun namedItem(name: String): Element?
}

@NoWASM
expect operator fun HTMLCollection.get(index: Int): Element?

@NoWASM
expect operator fun HTMLCollection.get(name: String): Element?
