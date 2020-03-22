package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [CaretPosition](https://developer.mozilla.org/en/docs/Web/API/CaretPosition) to Kotlin
 */
actual abstract class CaretPosition actual constructor() {
  actual open val offsetNode: Node
    get() = TODO("Not yet implemented")
  actual open val offset: Int
    get() = TODO("Not yet implemented")
  
  actual fun getClientRect(): DOMRect? {
    TODO("Not yet implemented")
  }
}