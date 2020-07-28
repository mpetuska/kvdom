package lt.petuska.kvdom.dom

expect abstract class Node : EventTarget {
  val firstChild: Node?
  open var textContent: String?
  
  fun removeChild(child: Node): Node
  fun appendChild(node: Node): Node
  fun hasChildNodes(): Boolean
  
  val parentNode: Node?
}

fun Node.clear() {
  while (hasChildNodes()) {
    removeChild(firstChild!!)
  }
}
