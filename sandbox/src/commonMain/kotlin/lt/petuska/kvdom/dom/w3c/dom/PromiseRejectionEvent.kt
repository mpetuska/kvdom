package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [PromiseRejectionEvent](https://developer.mozilla.org/en/docs/Web/API/PromiseRejectionEvent) to Kotlin
 */
@NoWASM
expect open class PromiseRejectionEvent(type: String, eventInitDict: PromiseRejectionEventInit) : Event {
  open val promise: Promise<Any?>
  open val reason: Any?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

@NoWASM
expect interface PromiseRejectionEventInit : EventInit {
  var promise: Promise<Any?>?
  var reason: Any?
}

@Suppress("FunctionName")
@NoWASM
fun PromiseRejectionEventInit(
  promise: Promise<Any?>?,
  reason: Any? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): PromiseRejectionEventInit =
  object : PromiseRejectionEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
    override var promise: Promise<Any?>? = promise
    override var reason: Any? = reason
  }