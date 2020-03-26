package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [TimeRanges](https://developer.mozilla.org/en/docs/Web/API/TimeRanges) to Kotlin
 */
@NoWASM
expect abstract class TimeRanges {
  open val length: Int
  fun start(index: Int): Double
  fun end(index: Int): Double
}