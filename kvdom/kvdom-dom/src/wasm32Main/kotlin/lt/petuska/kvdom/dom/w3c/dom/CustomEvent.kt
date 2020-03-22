package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [CustomEvent](https://developer.mozilla.org/en/docs/Web/API/CustomEvent) to Kotlin
 */
actual open class CustomEvent actual constructor(
  type: String,
  eventInitDict: CustomEventInit
) :
  Event() {
  actual open val detail: Any?
    get() = TODO("Not yet implemented")
  
  actual fun initCustomEvent(
    type: String,
    bubbles: Boolean,
    cancelable: Boolean,
    detail: Any?
  ) {
  }
  
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