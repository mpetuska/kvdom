package lt.petuska.kvdom.dom.w3c.dom

expect interface PopStateEventInit : EventInit {
  var state: Any? /* = null */
}

inline fun PopStateEventInit(
  state: Any? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): PopStateEventInit = object : PopStateEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var state: Any? = state
}
