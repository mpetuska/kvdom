package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MutationRecord](https://developer.mozilla.org/en/docs/Web/API/MutationRecord) to Kotlin
 */
actual abstract class MutationRecord actual constructor() {
  actual open val type: String
    get() = TODO("Not yet implemented")
  actual open val target: Node
    get() = TODO("Not yet implemented")
  actual open val addedNodes: NodeList
    get() = TODO("Not yet implemented")
  actual open val removedNodes: NodeList
    get() = TODO("Not yet implemented")
  actual open val previousSibling: Node?
    get() = TODO("Not yet implemented")
  actual open val nextSibling: Node?
    get() = TODO("Not yet implemented")
  actual open val attributeName: String?
    get() = TODO("Not yet implemented")
  actual open val attributeNamespace: String?
    get() = TODO("Not yet implemented")
  actual open val oldValue: String?
    get() = TODO("Not yet implemented")
}