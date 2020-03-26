package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [ErrorEvent](https://developer.mozilla.org/en/docs/Web/API/ErrorEvent) to Kotlin
 */
actual open external class ErrorEvent actual constructor(type: String, eventInitDict: ErrorEventInit) :
  Event {
  actual open val message: String
  actual open val filename: String
  actual open val lineno: Int
  actual open val colno: Int
  actual open val error: Any?
  
  actual companion object {
    actual val NONE: Short
    actual val CAPTURING_PHASE: Short
    actual val AT_TARGET: Short
    actual val BUBBLING_PHASE: Short
  }
}

actual external interface ErrorEventInit : EventInit {
  actual var message: String?
  actual var filename: String?
  actual var lineno: Int?
  actual var colno: Int?
  actual var error: Any?
}