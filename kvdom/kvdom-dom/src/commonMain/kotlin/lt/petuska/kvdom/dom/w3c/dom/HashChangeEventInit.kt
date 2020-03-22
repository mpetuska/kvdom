package lt.petuska.kvdom.dom.w3c.dom

expect interface HashChangeEventInit : EventInit {
  var oldURL: String? /* = "" */
  var newURL: String? /* = "" */
}

inline fun HashChangeEventInit(
  oldURL: String? = "",
  newURL: String? = "",
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): HashChangeEventInit = object : HashChangeEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var oldURL: String? = oldURL
  override var newURL: String? = newURL
}
