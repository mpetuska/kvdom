package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [TextMetrics](https://developer.mozilla.org/en/docs/Web/API/TextMetrics) to Kotlin
 */
expect abstract class TextMetrics() {
  open val width: Double
  open val actualBoundingBoxLeft: Double
  open val actualBoundingBoxRight: Double
  open val fontBoundingBoxAscent: Double
  open val fontBoundingBoxDescent: Double
  open val actualBoundingBoxAscent: Double
  open val actualBoundingBoxDescent: Double
  open val emHeightAscent: Double
  open val emHeightDescent: Double
  open val hangingBaseline: Double
  open val alphabeticBaseline: Double
  open val ideographicBaseline: Double
}