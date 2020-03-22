package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [TimeRanges](https://developer.mozilla.org/en/docs/Web/API/TimeRanges) to Kotlin
 */
actual abstract class TimeRanges actual constructor() {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  
  actual fun start(index: Int): Double {
    TODO("Not yet implemented")
  }
  
  actual fun end(index: Int): Double {
    TODO("Not yet implemented")
  }
}