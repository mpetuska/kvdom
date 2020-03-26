package lt.petuska.kvdom.dom.w3c.dom

actual abstract external class HTMLAllCollection {
  actual open val length: Int
  
  actual fun item(nameOrIndex: String): UnionElementOrHTMLCollection?
  
  actual fun namedItem(name: String): UnionElementOrHTMLCollection?
}

@Suppress("UnsafeCastFromDynamic")
actual operator fun HTMLAllCollection.get(index: Int): Element? = asDynamic()[index]

@Suppress("UnsafeCastFromDynamic")
actual operator fun HTMLAllCollection.get(name: String): UnionElementOrHTMLCollection? = asDynamic()[name]