package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMRectReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMRectReadOnly) to Kotlin
 */
expect open class DOMRectReadOnly(x: Double, y: Double, width: Double, height: Double) {
  open val x: Double
  open val y: Double
  open val width: Double
  open val height: Double
  open val top: Double
  open val right: Double
  open val bottom: Double
  open val left: Double
}