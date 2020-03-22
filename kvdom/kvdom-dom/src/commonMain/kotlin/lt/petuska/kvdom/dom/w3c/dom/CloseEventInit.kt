package lt.petuska.kvdom.dom.w3c.dom

expect interface CloseEventInit : EventInit {
  var wasClean: Boolean? /* = false */
  var code: Short? /* = 0 */
  var reason: String? /* = "" */
}

inline fun CloseEventInit(
  wasClean: Boolean? = false,
  code: Short? = 0,
  reason: String? = "",
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): CloseEventInit = object : CloseEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var wasClean: Boolean? = wasClean
  override var code: Short? = code
  override var reason: String? = reason
}
