package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLCollection) to Kotlin
 */
actual abstract external class HTMLCollection : ItemArrayLike<Element>, UnionElementOrHTMLCollection {
  actual override fun item(index: Int): Element?
  
  actual fun namedItem(name: String): Element?
}

@Suppress("UnsafeCastFromDynamic")
actual operator fun HTMLCollection.get(index: Int): Element? = asDynamic()[index]

@Suppress("UnsafeCastFromDynamic")
actual operator fun HTMLCollection.get(name: String): Element? = asDynamic()[name]