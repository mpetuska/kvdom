package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [CaretPosition](https://developer.mozilla.org/en/docs/Web/API/CaretPosition) to Kotlin
 */
expect abstract class CaretPosition() {
  open val offsetNode: Node
  open val offset: Int
  fun getClientRect(): DOMRect?
}