package lt.petuska.kvdom.dom.w3c.dom.events

import lt.petuska.kvdom.dom.w3c.dom.EventInit

/**
 * Exposes the JavaScript [Event](https://developer.mozilla.org/en/docs/Web/API/Event) to Kotlin
 */
expect open class Event(type: String, eventInitDict: EventInit) {
  open val type: String
  open val target: EventTarget?
  open val currentTarget: EventTarget?
  open val eventPhase: Short
  open val bubbles: Boolean
  open val cancelable: Boolean
  open val defaultPrevented: Boolean
  open val composed: Boolean
  open val isTrusted: Boolean
  open val timeStamp: Number
  fun composedPath(): Array<EventTarget>
  fun stopPropagation()
  fun stopImmediatePropagation()
  fun preventDefault()
  fun initEvent(type: String, bubbles: Boolean, cancelable: Boolean)
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}