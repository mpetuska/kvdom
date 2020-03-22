package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.fetch.Promise

expect interface PromiseRejectionEventInit : EventInit {
  var promise: Promise<Any?>?
  var reason: Any?
}

inline fun PromiseRejectionEventInit(
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
