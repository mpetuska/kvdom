package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLCollection) to Kotlin
 */
actual abstract class HTMLCollection actual constructor() : ItemArrayLike<Element>,
  UnionElementOrHTMLCollection {
  actual override fun item(index: Int): Element? {
    TODO("Not yet implemented")
  }
  
  actual fun namedItem(name: String): Element? {
    TODO("Not yet implemented")
  }
}