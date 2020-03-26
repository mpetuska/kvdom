package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [HashChangeEvent](https://developer.mozilla.org/en/docs/Web/API/HashChangeEvent) to Kotlin
 */
actual open external class HashChangeEvent actual constructor(type: String, eventInitDict: HashChangeEventInit) :
  Event {
  actual open val oldURL: String
  actual open val newURL: String
  
  actual companion object {
    actual val NONE: Short
    actual val CAPTURING_PHASE: Short
    actual val AT_TARGET: Short
    actual val BUBBLING_PHASE: Short
  }
}

actual external interface HashChangeEventInit : EventInit {
  actual var oldURL: String?
  actual var newURL: String?
}