package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [HashChangeEvent](https://developer.mozilla.org/en/docs/Web/API/HashChangeEvent) to Kotlin
 */
@NoWASM
expect open class HashChangeEvent(type: String, eventInitDict: HashChangeEventInit = HashChangeEventInit()) : Event {
  open val oldURL: String
  open val newURL: String
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface HashChangeEventInit : EventInit {
  var oldURL: String? /* = "" */
  var newURL: String? /* = "" */
}

@Suppress("FunctionName")
fun HashChangeEventInit(
  oldURL: String? = "",
  newURL: String? = "",
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): HashChangeEventInit = object : HashChangeEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var oldURL: String? = oldURL
  override var newURL: String? = newURL
}