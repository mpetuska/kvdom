package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [CustomEvent](https://developer.mozilla.org/en/docs/Web/API/CustomEvent) to Kotlin
 */
expect open class CustomEvent(type: String, eventInitDict: CustomEventInit) :
  Event {
  open val detail: Any?
  fun initCustomEvent(type: String, bubbles: Boolean, cancelable: Boolean, detail: Any?)
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}