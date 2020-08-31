package lt.petuska.kvdom.dom

public expect abstract class Node : EventTarget {
  public val firstChild: Node?
  public open var textContent: String?

  public fun removeChild(child: Node): Node
  public fun appendChild(node: Node): Node
  public fun hasChildNodes(): Boolean

  public val parentNode: Node?
}

public fun Node.clear() {
  while (hasChildNodes()) {
    removeChild(firstChild!!)
  }
}
