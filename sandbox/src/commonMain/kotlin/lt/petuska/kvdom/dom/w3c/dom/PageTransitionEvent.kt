package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [PageTransitionEvent](https://developer.mozilla.org/en/docs/Web/API/PageTransitionEvent) to Kotlin
 */
@NoWASM
expect open class PageTransitionEvent(
  type: String,
  eventInitDict: PageTransitionEventInit = PageTransitionEventInit()
) :
  Event {
  open val persisted: Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface PageTransitionEventInit : EventInit {
  var persisted: Boolean? /* = false */
}

@Suppress("FunctionName")
fun PageTransitionEventInit(
  persisted: Boolean? = false,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): PageTransitionEventInit = object : PageTransitionEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var persisted: Boolean? = persisted
}