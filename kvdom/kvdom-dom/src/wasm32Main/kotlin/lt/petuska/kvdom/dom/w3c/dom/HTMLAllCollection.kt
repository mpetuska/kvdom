package lt.petuska.kvdom.dom.w3c.dom

actual abstract class HTMLAllCollection actual constructor() {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  
  actual fun item(nameOrIndex: String): UnionElementOrHTMLCollection? {
    TODO("Not yet implemented")
  }
  
  actual fun namedItem(name: String): UnionElementOrHTMLCollection? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun HTMLAllCollection.get(index: Int): Element? {
  TODO("Not yet implemented")
}

actual inline operator fun HTMLAllCollection.get(name: String): UnionElementOrHTMLCollection? {
  TODO("Not yet implemented")
}