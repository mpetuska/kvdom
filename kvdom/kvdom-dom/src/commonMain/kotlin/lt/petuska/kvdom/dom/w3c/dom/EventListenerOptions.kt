package lt.petuska.kvdom.dom.w3c.dom

expect interface EventListenerOptions {
  var capture: Boolean? /* = false */
}

inline fun EventListenerOptions(capture: Boolean? = false): EventListenerOptions = object : EventListenerOptions {
  override var capture: Boolean? = capture
}
