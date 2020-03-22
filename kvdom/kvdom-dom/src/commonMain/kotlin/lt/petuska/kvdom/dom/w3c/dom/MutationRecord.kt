package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MutationRecord](https://developer.mozilla.org/en/docs/Web/API/MutationRecord) to Kotlin
 */
expect abstract class MutationRecord() {
  open val type: String
  open val target: Node
  open val addedNodes: NodeList
  open val removedNodes: NodeList
  open val previousSibling: Node?
  open val nextSibling: Node?
  open val attributeName: String?
  open val attributeNamespace: String?
  open val oldValue: String?
}