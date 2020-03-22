package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [BroadcastChannel](https://developer.mozilla.org/en/docs/Web/API/BroadcastChannel) to Kotlin
 */
expect open class BroadcastChannel(name: String) :
  EventTarget {
  open val name: String
  var onmessage: ((MessageEvent) -> Any)?
  fun postMessage(message: Any?)
  fun close()
}