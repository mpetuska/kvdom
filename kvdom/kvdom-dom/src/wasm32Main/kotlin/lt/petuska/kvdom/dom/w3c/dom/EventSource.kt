package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [EventSource](https://developer.mozilla.org/en/docs/Web/API/EventSource) to Kotlin
 */
actual open class EventSource actual constructor(
  url: String,
  eventSourceInitDict: EventSourceInit
) :
  EventTarget() {
  actual open val url: String
    get() = TODO("Not yet implemented")
  actual open val withCredentials: Boolean
    get() = TODO("Not yet implemented")
  actual open val readyState: Short
    get() = TODO("Not yet implemented")
  actual var onopen: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var onmessage: ((MessageEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var onerror: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun close() {
  }
  
  actual companion object {
    actual val CONNECTING: Short
      get() = TODO("Not yet implemented")
    actual val OPEN: Short
      get() = TODO("Not yet implemented")
    actual val CLOSED: Short
      get() = TODO("Not yet implemented")
  }
  
}