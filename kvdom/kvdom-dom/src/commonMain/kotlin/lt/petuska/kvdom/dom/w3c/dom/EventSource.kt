package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [EventSource](https://developer.mozilla.org/en/docs/Web/API/EventSource) to Kotlin
 */
expect open class EventSource(url: String, eventSourceInitDict: EventSourceInit) :
  EventTarget {
  open val url: String
  open val withCredentials: Boolean
  open val readyState: Short
  var onopen: ((Event) -> Any)?
  var onmessage: ((MessageEvent) -> Any)?
  var onerror: ((Event) -> Any)?
  fun close()
  
  companion object {
    val CONNECTING: Short
    val OPEN: Short
    val CLOSED: Short
  }
}