package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [PageTransitionEvent](https://developer.mozilla.org/en/docs/Web/API/PageTransitionEvent) to Kotlin
 */
actual open external class PageTransitionEvent actual constructor(
  type: String,
  eventInitDict: PageTransitionEventInit
) :
  Event {
  actual open val persisted: Boolean
  
  actual companion object {
    actual val NONE: Short
    actual val CAPTURING_PHASE: Short
    actual val AT_TARGET: Short
    actual val BUBBLING_PHASE: Short
  }
}

actual external interface PageTransitionEventInit : EventInit {
  actual var persisted: Boolean?
}