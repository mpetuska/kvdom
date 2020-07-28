package lt.petuska.kvdom.dom

expect open class Document : Node {
  fun getElementById(elementId: String): Element?
}

expect fun Document.createElement(qualifiedName: String): Element
expect fun Document.createElementNS(qualifiedName: String, namespace: String): Element
