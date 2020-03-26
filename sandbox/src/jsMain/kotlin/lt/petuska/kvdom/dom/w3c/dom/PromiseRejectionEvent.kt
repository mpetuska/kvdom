package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [PromiseRejectionEvent](https://developer.mozilla.org/en/docs/Web/API/PromiseRejectionEvent) to Kotlin
 */
actual open external class PromiseRejectionEvent actual constructor(
  type: String,
  eventInitDict: PromiseRejectionEventInit
) :
  Event {
  actual open val promise: Promise<Any?>
  actual open val reason: Any?
  
  actual companion object {
    actual val NONE: Short
    actual val CAPTURING_PHASE: Short
    actual val AT_TARGET: Short
    actual val BUBBLING_PHASE: Short
  }
}

actual external interface PromiseRejectionEventInit : EventInit {
  actual var promise: Promise<Any?>?
  actual var reason: Any?
}