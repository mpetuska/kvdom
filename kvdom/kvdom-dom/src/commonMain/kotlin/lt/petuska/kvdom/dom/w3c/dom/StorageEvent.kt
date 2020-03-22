package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [StorageEvent](https://developer.mozilla.org/en/docs/Web/API/StorageEvent) to Kotlin
 */
expect open class StorageEvent(type: String, eventInitDict: StorageEventInit) :
  Event {
  open val key: String?
  open val oldValue: String?
  open val newValue: String?
  open val url: String
  open val storageArea: Storage?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}