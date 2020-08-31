package lt.petuska.kvdom.dom

public expect open class Document : Node {
  public fun getElementById(elementId: String): Element?
}

public expect fun Document.createElement(qualifiedName: String): Element
public expect fun Document.createElementNS(qualifiedName: String, namespace: String): Element
