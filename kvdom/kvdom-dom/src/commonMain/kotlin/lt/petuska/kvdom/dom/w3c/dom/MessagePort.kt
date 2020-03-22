package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.workers.UnionClientOrMessagePortOrServiceWorker
import lt.petuska.kvdom.dom.w3c.workers.UnionMessagePortOrServiceWorker

/**
 * Exposes the JavaScript [MessagePort](https://developer.mozilla.org/en/docs/Web/API/MessagePort) to Kotlin
 */
expect abstract class MessagePort() : EventTarget, UnionMessagePortOrWindowProxy, UnionMessagePortOrServiceWorker,
  UnionClientOrMessagePortOrServiceWorker {
  open var onmessage: ((MessageEvent) -> Any)?
  fun postMessage(message: Any?, transfer: Array<Any>)
  fun start()
  fun close()
}