package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Range](https://developer.mozilla.org/en/docs/Web/API/Range) to Kotlin
 */
actual open class Range actual constructor() {
  actual open val startContainer: Node
    get() = TODO("Not yet implemented")
  actual open val startOffset: Int
    get() = TODO("Not yet implemented")
  actual open val endContainer: Node
    get() = TODO("Not yet implemented")
  actual open val endOffset: Int
    get() = TODO("Not yet implemented")
  actual open val collapsed: Boolean
    get() = TODO("Not yet implemented")
  actual open val commonAncestorContainer: Node
    get() = TODO("Not yet implemented")
  
  actual fun setStart(node: Node, offset: Int) {
  }
  
  actual fun setEnd(node: Node, offset: Int) {
  }
  
  actual fun setStartBefore(node: Node) {
  }
  
  actual fun setStartAfter(node: Node) {
  }
  
  actual fun setEndBefore(node: Node) {
  }
  
  actual fun setEndAfter(node: Node) {
  }
  
  actual fun collapse(toStart: Boolean) {
  }
  
  actual fun selectNode(node: Node) {
  }
  
  actual fun selectNodeContents(node: Node) {
  }
  
  actual fun compareBoundaryPoints(how: Short, sourceRange: Range): Short {
    TODO("Not yet implemented")
  }
  
  actual fun deleteContents() {
  }
  
  actual fun extractContents(): DocumentFragment {
    TODO("Not yet implemented")
  }
  
  actual fun cloneContents(): DocumentFragment {
    TODO("Not yet implemented")
  }
  
  actual fun insertNode(node: Node) {
  }
  
  actual fun surroundContents(newParent: Node) {
  }
  
  actual fun cloneRange(): Range {
    TODO("Not yet implemented")
  }
  
  actual fun detach() {
  }
  
  actual fun isPointInRange(node: Node, offset: Int): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun comparePoint(node: Node, offset: Int): Short {
    TODO("Not yet implemented")
  }
  
  actual fun intersectsNode(node: Node): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun getClientRects(): Array<DOMRect> {
    TODO("Not yet implemented")
  }
  
  actual fun getBoundingClientRect(): DOMRect {
    TODO("Not yet implemented")
  }
  
  actual fun createContextualFragment(fragment: String): DocumentFragment {
    TODO("Not yet implemented")
  }
  
  actual companion object {
    actual val START_TO_START: Short
      get() = TODO("Not yet implemented")
    actual val START_TO_END: Short
      get() = TODO("Not yet implemented")
    actual val END_TO_END: Short
      get() = TODO("Not yet implemented")
    actual val END_TO_START: Short
      get() = TODO("Not yet implemented")
  }
  
}