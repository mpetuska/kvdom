package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [TextMetrics](https://developer.mozilla.org/en/docs/Web/API/TextMetrics) to Kotlin
 */
actual abstract external class TextMetrics {
  actual open val width: Double
  actual open val actualBoundingBoxLeft: Double
  actual open val actualBoundingBoxRight: Double
  actual open val fontBoundingBoxAscent: Double
  actual open val fontBoundingBoxDescent: Double
  actual open val actualBoundingBoxAscent: Double
  actual open val actualBoundingBoxDescent: Double
  actual open val emHeightAscent: Double
  actual open val emHeightDescent: Double
  actual open val hangingBaseline: Double
  actual open val alphabeticBaseline: Double
  actual open val ideographicBaseline: Double
}