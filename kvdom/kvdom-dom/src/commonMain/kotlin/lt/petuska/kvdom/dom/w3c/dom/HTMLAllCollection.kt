package lt.petuska.kvdom.dom.w3c.dom

expect abstract class HTMLAllCollection() {
  open val length: Int
  fun item(nameOrIndex: String): UnionElementOrHTMLCollection?
  fun namedItem(name: String): UnionElementOrHTMLCollection?
}

expect inline operator fun HTMLAllCollection.get(index: Int): Element?

expect inline operator fun HTMLAllCollection.get(name: String): UnionElementOrHTMLCollection?