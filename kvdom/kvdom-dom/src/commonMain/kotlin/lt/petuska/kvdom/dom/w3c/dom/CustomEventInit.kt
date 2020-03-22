package lt.petuska.kvdom.dom.w3c.dom

expect interface CustomEventInit : EventInit {
  var detail: Any? /* = null */
}

inline fun CustomEventInit(
  detail: Any? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): CustomEventInit = object : CustomEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var detail: Any? = detail
}
