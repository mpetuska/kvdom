package lt.petuska.kvdom.dom.w3c.dom.events

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [Event](https://developer.mozilla.org/en/docs/Web/API/Event) to Kotlin
 */
@NoWASM
actual open class Event actual constructor(
  type: String,
  eventInitDict: EventInit
) {
  actual open val type: String
    get() = TODO("Not yet implemented")
  actual open val target: EventTarget?
    get() = TODO("Not yet implemented")
  actual open val currentTarget: EventTarget?
    get() = TODO("Not yet implemented")
  actual open val eventPhase: Short
    get() = TODO("Not yet implemented")
  actual open val bubbles: Boolean
    get() = TODO("Not yet implemented")
  actual open val cancelable: Boolean
    get() = TODO("Not yet implemented")
  actual open val defaultPrevented: Boolean
    get() = TODO("Not yet implemented")
  actual open val composed: Boolean
    get() = TODO("Not yet implemented")
  actual open val isTrusted: Boolean
    get() = TODO("Not yet implemented")
  actual open val timeStamp: Number
    get() = TODO("Not yet implemented")
  
  actual fun composedPath(): Array<EventTarget> {
    TODO("Not yet implemented")
  }
  
  actual fun stopPropagation() {
  }
  
  actual fun stopImmediatePropagation() {
  }
  
  actual fun preventDefault() {
  }
  
  actual fun initEvent(type: String, bubbles: Boolean, cancelable: Boolean) {
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

actual interface EventInit {
  actual var bubbles: Boolean?
  actual var cancelable: Boolean?
  actual var composed: Boolean?
}