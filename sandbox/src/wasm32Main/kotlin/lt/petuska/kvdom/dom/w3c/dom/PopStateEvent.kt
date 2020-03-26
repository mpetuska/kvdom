package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [PopStateEvent](https://developer.mozilla.org/en/docs/Web/API/PopStateEvent) to Kotlin
 */
@NoWASM
actual open class PopStateEvent actual constructor(
  type: String,
  eventInitDict: PopStateEventInit
) : Event(type, eventInitDict) {
  actual open val state: Any?
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

actual interface PopStateEventInit : EventInit {
  actual var state: Any?
}