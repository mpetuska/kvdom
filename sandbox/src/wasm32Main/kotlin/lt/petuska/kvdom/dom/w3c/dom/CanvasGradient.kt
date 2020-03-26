package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [CanvasGradient](https://developer.mozilla.org/en/docs/Web/API/CanvasGradient) to Kotlin
 */
@NoWASM
actual abstract class CanvasGradient {
  actual fun addColorStop(offset: Double, color: String) {
  }
}