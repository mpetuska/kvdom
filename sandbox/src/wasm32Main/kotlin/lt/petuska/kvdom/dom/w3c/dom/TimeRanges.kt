package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [TimeRanges](https://developer.mozilla.org/en/docs/Web/API/TimeRanges) to Kotlin
 */
@NoWASM
actual abstract class TimeRanges {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  
  actual fun start(index: Int): Double {
    TODO("Not yet implemented")
  }
  
  actual fun end(index: Int): Double {
    TODO("Not yet implemented")
  }
}