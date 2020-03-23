package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [TimeRanges](https://developer.mozilla.org/en/docs/Web/API/TimeRanges) to Kotlin
 */
actual abstract external class TimeRanges {
  actual open val length: Int
  actual fun start(index: Int): Double
  actual fun end(index: Int): Double
}