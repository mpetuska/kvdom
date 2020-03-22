package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMPointReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMPointReadOnly) to Kotlin
 */
expect open class DOMPointReadOnly(x: Double, y: Double, z: Double, w: Double) {
  open val x: Double
  open val y: Double
  open val z: Double
  open val w: Double
  fun matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint
}