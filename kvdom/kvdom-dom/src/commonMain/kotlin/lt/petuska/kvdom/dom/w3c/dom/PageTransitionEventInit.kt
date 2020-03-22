package lt.petuska.kvdom.dom.w3c.dom

expect interface PageTransitionEventInit : EventInit {
  var persisted: Boolean? /* = false */
}

inline fun PageTransitionEventInit(
  persisted: Boolean? = false,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): PageTransitionEventInit = object : PageTransitionEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var persisted: Boolean? = persisted
}
