package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

expect abstract class HTMLAllCollection() {
  open val length: Int
  fun item(nameOrIndex: String): UnionElementOrHTMLCollection?
  fun namedItem(name: String): UnionElementOrHTMLCollection?
}

@NoWASM
expect operator fun HTMLAllCollection.get(index: Int): Element?

expect operator fun HTMLAllCollection.get(name: String): UnionElementOrHTMLCollection?
