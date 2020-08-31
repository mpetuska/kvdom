package lt.petuska.kvdom.dom

public actual typealias Document = org.w3c.dom.Document

public actual fun Document.createElement(qualifiedName: String): Element = createElement(qualifiedName)
public actual fun Document.createElementNS(qualifiedName: String, namespace: String): Element =
  createElementNS(namespace, qualifiedName)
