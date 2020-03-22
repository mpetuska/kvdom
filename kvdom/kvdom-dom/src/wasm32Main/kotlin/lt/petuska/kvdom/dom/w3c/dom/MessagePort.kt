package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.workers.UnionClientOrMessagePortOrServiceWorker
import lt.petuska.kvdom.dom.w3c.workers.UnionMessagePortOrServiceWorker

/**
 * Exposes the JavaScript [MessagePort](https://developer.mozilla.org/en/docs/Web/API/MessagePort) to Kotlin
 */
actual abstract class MessagePort actual constructor() : EventTarget(),
  UnionMessagePortOrWindowProxy, UnionMessagePortOrServiceWorker, UnionClientOrMessagePortOrServiceWorker {
  actual open var onmessage: ((MessageEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun postMessage(message: Any?, transfer: Array<Any>) {
  }
  
  actual fun start() {
  }
  
  actual fun close() {
  }
}