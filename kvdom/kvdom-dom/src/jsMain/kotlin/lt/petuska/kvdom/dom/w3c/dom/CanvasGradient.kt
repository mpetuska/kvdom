package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [CanvasGradient](https://developer.mozilla.org/en/docs/Web/API/CanvasGradient) to Kotlin
 */
actual abstract external class CanvasGradient {
  actual fun addColorStop(offset: Double, color: String)
}