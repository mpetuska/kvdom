package lt.petuska.kvdom.dom.w3c.dom.events

/**
 * Exposes the JavaScript [Event](https://developer.mozilla.org/en/docs/Web/API/Event) to Kotlin
 */
actual open external class Event actual constructor(type: String, eventInitDict: EventInit) {
  actual open val type: String
  actual open val target: EventTarget?
  actual open val currentTarget: EventTarget?
  actual open val eventPhase: Short
  actual open val bubbles: Boolean
  actual open val cancelable: Boolean
  actual open val defaultPrevented: Boolean
  actual open val composed: Boolean
  actual open val isTrusted: Boolean
  actual open val timeStamp: Number
  actual fun composedPath(): Array<EventTarget>
  actual fun stopPropagation()
  actual fun stopImmediatePropagation()
  actual fun preventDefault()
  actual fun initEvent(type: String, bubbles: Boolean, cancelable: Boolean)
  
  actual companion object {
    actual val NONE: Short
    actual val CAPTURING_PHASE: Short
    actual val AT_TARGET: Short
    actual val BUBBLING_PHASE: Short
  }
}

actual external interface EventInit {
  actual var bubbles: Boolean?
  actual var cancelable: Boolean?
  actual var composed: Boolean?
}