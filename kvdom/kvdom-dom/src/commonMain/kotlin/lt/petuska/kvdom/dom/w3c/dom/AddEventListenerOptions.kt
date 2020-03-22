package lt.petuska.kvdom.dom.w3c.dom

expect interface AddEventListenerOptions : EventListenerOptions {
  var passive: Boolean? /* = false */
  var once: Boolean? /* = false */
}

inline fun AddEventListenerOptions(
  passive: Boolean? = false,
  once: Boolean? = false,
  capture: Boolean? = false
): AddEventListenerOptions = object : AddEventListenerOptions, EventListenerOptions by EventListenerOptions(capture) {
  override var passive: Boolean? = passive
  override var once: Boolean? = once
}
