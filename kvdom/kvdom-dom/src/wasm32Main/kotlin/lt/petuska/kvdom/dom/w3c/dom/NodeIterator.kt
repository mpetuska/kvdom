package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NodeIterator](https://developer.mozilla.org/en/docs/Web/API/NodeIterator) to Kotlin
 */
actual abstract class NodeIterator actual constructor() {
  actual open val root: Node
    get() = TODO("Not yet implemented")
  actual open val referenceNode: Node
    get() = TODO("Not yet implemented")
  actual open val pointerBeforeReferenceNode: Boolean
    get() = TODO("Not yet implemented")
  actual open val whatToShow: Int
    get() = TODO("Not yet implemented")
  actual open val filter: NodeFilter?
    get() = TODO("Not yet implemented")
  
  actual fun nextNode(): Node? {
    TODO("Not yet implemented")
  }
  
  actual fun previousNode(): Node? {
    TODO("Not yet implemented")
  }
  
  actual fun detach() {
  }
}