package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [ErrorEvent](https://developer.mozilla.org/en/docs/Web/API/ErrorEvent) to Kotlin
 */
@NoWASM
actual open class ErrorEvent actual constructor(
  type: String,
  eventInitDict: ErrorEventInit
) : Event(type, eventInitDict) {
  actual open val message: String
    get() = TODO("Not yet implemented")
  actual open val filename: String
    get() = TODO("Not yet implemented")
  actual open val lineno: Int
    get() = TODO("Not yet implemented")
  actual open val colno: Int
    get() = TODO("Not yet implemented")
  actual open val error: Any?
    get() = TODO("Not yet implemented")
  
  actual companion object {
    actual val NONE: Short
      get() = TODO("Not yet implemented")
    actual val CAPTURING_PHASE: Short
      get() = TODO("Not yet implemented")
    actual val AT_TARGET: Short
      get() = TODO("Not yet implemented")
    actual val BUBBLING_PHASE: Short
      get() = TODO("Not yet implemented")
  }
  
}

actual interface ErrorEventInit : EventInit {
  actual var message: String?
  actual var filename: String?
  actual var lineno: Int?
  actual var colno: Int?
  actual var error: Any?
}