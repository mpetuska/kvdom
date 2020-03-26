package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

@NoWASM
actual abstract class HTMLAllCollection {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  
  actual fun item(nameOrIndex: String): UnionElementOrHTMLCollection? {
    TODO("Not yet implemented")
  }
  
  actual fun namedItem(name: String): UnionElementOrHTMLCollection? {
    TODO("Not yet implemented")
  }
}

@NoWASM
actual operator fun HTMLAllCollection.get(index: Int): Element? {
  TODO("Not yet implemented")
}

@NoWASM
actual operator fun HTMLAllCollection.get(name: String): UnionElementOrHTMLCollection? {
  TODO("Not yet implemented")
}