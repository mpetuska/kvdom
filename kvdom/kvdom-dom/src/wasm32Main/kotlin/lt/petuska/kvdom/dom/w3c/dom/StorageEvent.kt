package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [StorageEvent](https://developer.mozilla.org/en/docs/Web/API/StorageEvent) to Kotlin
 */
actual open class StorageEvent actual constructor(
  type: String,
  eventInitDict: StorageEventInit
) :
  Event() {
  actual open val key: String?
    get() = TODO("Not yet implemented")
  actual open val oldValue: String?
    get() = TODO("Not yet implemented")
  actual open val newValue: String?
    get() = TODO("Not yet implemented")
  actual open val url: String
    get() = TODO("Not yet implemented")
  actual open val storageArea: Storage?
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