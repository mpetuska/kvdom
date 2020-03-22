package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [CanvasGradient](https://developer.mozilla.org/en/docs/Web/API/CanvasGradient) to Kotlin
 */
expect abstract class CanvasGradient() {
  fun addColorStop(offset: Double, color: String)
}