package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [CloseEvent](https://developer.mozilla.org/en/docs/Web/API/CloseEvent) to Kotlin
 */
actual open class CloseEvent actual constructor(
  type: String,
  eventInitDict: CloseEventInit
) : Event(type, eventInitDict) {
  actual open val wasClean: Boolean
    get() = TODO("Not yet implemented")
  actual open val code: Short
    get() = TODO("Not yet implemented")
  actual open val reason: String
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