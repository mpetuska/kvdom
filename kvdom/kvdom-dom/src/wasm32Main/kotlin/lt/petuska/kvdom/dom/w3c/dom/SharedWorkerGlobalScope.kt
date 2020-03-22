package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [SharedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/SharedWorkerGlobalScope) to Kotlin
 */
actual abstract class SharedWorkerGlobalScope actual constructor() : WorkerGlobalScope() {
  actual open val name: String
    get() = TODO("Not yet implemented")
  actual open val applicationCache: ApplicationCache
    get() = TODO("Not yet implemented")
  actual open var onconnect: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun close() {
  }
}