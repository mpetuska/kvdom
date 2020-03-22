package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMPointReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMPointReadOnly) to Kotlin
 */
actual open class DOMPointReadOnly actual constructor(
  x: Double,
  y: Double,
  z: Double,
  w: Double
) {
  actual open val x: Double
    get() = TODO("Not yet implemented")
  actual open val y: Double
    get() = TODO("Not yet implemented")
  actual open val z: Double
    get() = TODO("Not yet implemented")
  actual open val w: Double
    get() = TODO("Not yet implemented")
  
  actual fun matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint {
    TODO("Not yet implemented")
  }
}