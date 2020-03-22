package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventListener
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [MediaQueryList](https://developer.mozilla.org/en/docs/Web/API/MediaQueryList) to Kotlin
 */
actual abstract class MediaQueryList actual constructor() : EventTarget() {
  actual open val media: String
    get() = TODO("Not yet implemented")
  actual open val matches: Boolean
    get() = TODO("Not yet implemented")
  actual open var onchange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun addListener(listener: EventListener?) {
  }
  
  actual fun addListener(listener: ((Event) -> Unit)?) {
  }
  
  actual fun removeListener(listener: EventListener?) {
  }
  
  actual fun removeListener(listener: ((Event) -> Unit)?) {
  }
}