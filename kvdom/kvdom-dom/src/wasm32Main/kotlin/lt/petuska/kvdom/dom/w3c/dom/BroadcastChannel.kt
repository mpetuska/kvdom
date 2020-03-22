package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [BroadcastChannel](https://developer.mozilla.org/en/docs/Web/API/BroadcastChannel) to Kotlin
 */
actual open class BroadcastChannel actual constructor(name: String) :
  EventTarget() {
  actual open val name: String
    get() = TODO("Not yet implemented")
  actual var onmessage: ((MessageEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun postMessage(message: Any?) {
  }
  
  actual fun close() {
  }
}