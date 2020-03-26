package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [PopStateEvent](https://developer.mozilla.org/en/docs/Web/API/PopStateEvent) to Kotlin
 */
@NoWASM
expect open class PopStateEvent(type: String, eventInitDict: PopStateEventInit = PopStateEventInit()) : Event {
  open val state: Any?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface PopStateEventInit : EventInit {
  var state: Any? /* = null */
}

@Suppress("FunctionName")
fun PopStateEventInit(
  state: Any? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): PopStateEventInit = object : PopStateEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var state: Any? = state
}