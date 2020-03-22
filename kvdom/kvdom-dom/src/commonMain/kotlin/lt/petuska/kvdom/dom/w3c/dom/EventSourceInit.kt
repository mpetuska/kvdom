package lt.petuska.kvdom.dom.w3c.dom

expect interface EventSourceInit {
  var withCredentials: Boolean? /* = false */
}

inline fun EventSourceInit(withCredentials: Boolean? = false): EventSourceInit = object : EventSourceInit {
  override var withCredentials: Boolean? = withCredentials
}
