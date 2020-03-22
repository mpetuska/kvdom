package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLCollection) to Kotlin
 */
expect abstract class HTMLCollection() : ItemArrayLike<Element>,
  UnionElementOrHTMLCollection {
  override fun item(index: Int): Element?
  fun namedItem(name: String): Element?
}