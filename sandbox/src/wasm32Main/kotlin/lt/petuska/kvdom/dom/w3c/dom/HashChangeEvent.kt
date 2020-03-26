package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [HashChangeEvent](https://developer.mozilla.org/en/docs/Web/API/HashChangeEvent) to Kotlin
 */
@NoWASM
actual open class HashChangeEvent actual constructor(
  type: String,
  eventInitDict: HashChangeEventInit
) : Event(type, eventInitDict) {
  actual open val oldURL: String
    get() = TODO("Not yet implemented")
  actual open val newURL: String
    get() = TODO("Not yet implemented")
  
  actual companion object {
    actual val NONE: Short
      get() = TODO("Not yet implemented")
    actual val CAPTURING_PHASE: Short
      get() = TODO("Not yet implemented")
    actual val AT_TARGET: Short
      get() = TODO("Not yet implemented")
    actual val BUBBLING_PHASE: Short
      get() = TODO("Not yet implemented")
  }
  
}

actual interface HashChangeEventInit : EventInit {
  actual var oldURL: String?
  actual var newURL: String?
}