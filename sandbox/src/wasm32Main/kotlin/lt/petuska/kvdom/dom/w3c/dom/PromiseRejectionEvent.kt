package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [PromiseRejectionEvent](https://developer.mozilla.org/en/docs/Web/API/PromiseRejectionEvent) to Kotlin
 */
@NoWASM
actual open class PromiseRejectionEvent actual constructor(
  type: String,
  eventInitDict: PromiseRejectionEventInit
) : Event(type, eventInitDict) {
  actual open val promise: Promise<Any?>
    get() = TODO("Not yet implemented")
  actual open val reason: Any?
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

@NoWASM
actual interface PromiseRejectionEventInit : EventInit {
  actual var promise: Promise<Any?>?
  actual var reason: Any?
}