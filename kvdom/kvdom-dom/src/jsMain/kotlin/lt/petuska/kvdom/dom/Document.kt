package lt.petuska.kvdom.dom

actual typealias Document = org.w3c.dom.Document

actual fun Document.createElement(qualifiedName: String): Element = createElement(qualifiedName)
actual fun Document.createElementNS(qualifiedName: String, namespace: String): Element =
  createElementNS(namespace, qualifiedName)
