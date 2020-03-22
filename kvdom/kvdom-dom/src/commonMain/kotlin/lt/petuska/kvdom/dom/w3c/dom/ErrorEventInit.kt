package lt.petuska.kvdom.dom.w3c.dom

expect interface ErrorEventInit : EventInit {
  var message: String? /* = "" */
  var filename: String? /* = "" */
  var lineno: Int? /* = 0 */
  var colno: Int? /* = 0 */
  var error: Any? /* = null */
}

inline fun ErrorEventInit(
  message: String? = "",
  filename: String? = "",
  lineno: Int? = 0,
  colno: Int? = 0,
  error: Any? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): ErrorEventInit = object : ErrorEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var message: String? = message
  override var filename: String? = filename
  override var lineno: Int? = lineno
  override var colno: Int? = colno
  override var error: Any? = error
}
