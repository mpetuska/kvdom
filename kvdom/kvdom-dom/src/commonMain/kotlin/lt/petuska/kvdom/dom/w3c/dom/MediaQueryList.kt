package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventListener
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [MediaQueryList](https://developer.mozilla.org/en/docs/Web/API/MediaQueryList) to Kotlin
 */
expect abstract class MediaQueryList() : EventTarget {
  open val media: String
  open val matches: Boolean
  open var onchange: ((Event) -> Any)?
  fun addListener(listener: EventListener?)
  fun addListener(listener: ((Event) -> Unit)?)
  fun removeListener(listener: EventListener?)
  fun removeListener(listener: ((Event) -> Unit)?)
}