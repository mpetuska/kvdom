package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [ErrorEvent](https://developer.mozilla.org/en/docs/Web/API/ErrorEvent) to Kotlin
 */
@NoWASM
expect open class ErrorEvent(type: String, eventInitDict: ErrorEventInit = ErrorEventInit()) :
  Event {
  open val message: String
  open val filename: String
  open val lineno: Int
  open val colno: Int
  open val error: Any?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface ErrorEventInit : EventInit {
  var message: String? /* = "" */
  var filename: String? /* = "" */
  var lineno: Int? /* = 0 */
  var colno: Int? /* = 0 */
  var error: Any? /* = null */
}

@Suppress("FunctionName")
fun ErrorEventInit(
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