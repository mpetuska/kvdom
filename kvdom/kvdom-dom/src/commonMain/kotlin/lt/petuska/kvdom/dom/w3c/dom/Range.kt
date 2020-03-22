package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Range](https://developer.mozilla.org/en/docs/Web/API/Range) to Kotlin
 */
expect open class Range() {
  open val startContainer: Node
  open val startOffset: Int
  open val endContainer: Node
  open val endOffset: Int
  open val collapsed: Boolean
  open val commonAncestorContainer: Node
  fun setStart(node: Node, offset: Int)
  fun setEnd(node: Node, offset: Int)
  fun setStartBefore(node: Node)
  fun setStartAfter(node: Node)
  fun setEndBefore(node: Node)
  fun setEndAfter(node: Node)
  fun collapse(toStart: Boolean)
  fun selectNode(node: Node)
  fun selectNodeContents(node: Node)
  fun compareBoundaryPoints(how: Short, sourceRange: Range): Short
  fun deleteContents()
  fun extractContents(): DocumentFragment
  fun cloneContents(): DocumentFragment
  fun insertNode(node: Node)
  fun surroundContents(newParent: Node)
  fun cloneRange(): Range
  fun detach()
  fun isPointInRange(node: Node, offset: Int): Boolean
  fun comparePoint(node: Node, offset: Int): Short
  fun intersectsNode(node: Node): Boolean
  fun getClientRects(): Array<DOMRect>
  fun getBoundingClientRect(): DOMRect
  fun createContextualFragment(fragment: String): DocumentFragment
  
  companion object {
    val START_TO_START: Short
    val START_TO_END: Short
    val END_TO_END: Short
    val END_TO_START: Short
  }
}