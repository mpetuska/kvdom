package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [HTMLCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLCollection) to Kotlin
 */
@NoWASM
actual abstract class HTMLCollection : ItemArrayLike<Element>, UnionElementOrHTMLCollection {
  actual override fun item(index: Int): Element? {
    TODO("Not yet implemented")
  }
  
  actual fun namedItem(name: String): Element? {
    TODO("Not yet implemented")
  }
}

@NoWASM
actual operator fun HTMLCollection.get(index: Int): Element? {
  TODO("Not yet implemented")
}

@NoWASM
actual operator fun HTMLCollection.get(name: String): Element? {
  TODO("Not yet implemented")
}