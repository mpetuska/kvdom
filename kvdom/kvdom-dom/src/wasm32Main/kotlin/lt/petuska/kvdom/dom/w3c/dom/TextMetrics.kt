package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [TextMetrics](https://developer.mozilla.org/en/docs/Web/API/TextMetrics) to Kotlin
 */
actual abstract class TextMetrics actual constructor() {
  actual open val width: Double
    get() = TODO("Not yet implemented")
  actual open val actualBoundingBoxLeft: Double
    get() = TODO("Not yet implemented")
  actual open val actualBoundingBoxRight: Double
    get() = TODO("Not yet implemented")
  actual open val fontBoundingBoxAscent: Double
    get() = TODO("Not yet implemented")
  actual open val fontBoundingBoxDescent: Double
    get() = TODO("Not yet implemented")
  actual open val actualBoundingBoxAscent: Double
    get() = TODO("Not yet implemented")
  actual open val actualBoundingBoxDescent: Double
    get() = TODO("Not yet implemented")
  actual open val emHeightAscent: Double
    get() = TODO("Not yet implemented")
  actual open val emHeightDescent: Double
    get() = TODO("Not yet implemented")
  actual open val hangingBaseline: Double
    get() = TODO("Not yet implemented")
  actual open val alphabeticBaseline: Double
    get() = TODO("Not yet implemented")
  actual open val ideographicBaseline: Double
    get() = TODO("Not yet implemented")
}