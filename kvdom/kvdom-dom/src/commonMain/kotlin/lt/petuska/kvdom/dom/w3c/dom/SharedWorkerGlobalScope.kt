package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [SharedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/SharedWorkerGlobalScope) to Kotlin
 */
expect abstract class SharedWorkerGlobalScope() : WorkerGlobalScope {
  open val name: String
  open val applicationCache: ApplicationCache
  open var onconnect: ((Event) -> Any)?
  fun close()
}