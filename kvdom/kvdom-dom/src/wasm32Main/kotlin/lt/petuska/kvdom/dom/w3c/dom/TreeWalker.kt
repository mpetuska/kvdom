package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [TreeWalker](https://developer.mozilla.org/en/docs/Web/API/TreeWalker) to Kotlin
 */
actual abstract class TreeWalker actual constructor() {
  actual open val root: Node
    get() = TODO("Not yet implemented")
  actual open val whatToShow: Int
    get() = TODO("Not yet implemented")
  actual open val filter: NodeFilter?
    get() = TODO("Not yet implemented")
  actual open var currentNode: Node
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun parentNode(): Node? {
    TODO("Not yet implemented")
  }
  
  actual fun firstChild(): Node? {
    TODO("Not yet implemented")
  }
  
  actual fun lastChild(): Node? {
    TODO("Not yet implemented")
  }
  
  actual fun previousSibling(): Node? {
    TODO("Not yet implemented")
  }
  
  actual fun nextSibling(): Node? {
    TODO("Not yet implemented")
  }
  
  actual fun previousNode(): Node? {
    TODO("Not yet implemented")
  }
  
  actual fun nextNode(): Node? {
    TODO("Not yet implemented")
  }
}