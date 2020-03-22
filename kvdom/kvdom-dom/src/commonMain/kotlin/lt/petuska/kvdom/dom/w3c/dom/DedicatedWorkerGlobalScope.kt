package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DedicatedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/DedicatedWorkerGlobalScope) to Kotlin
 */
expect abstract class DedicatedWorkerGlobalScope() : WorkerGlobalScope {
  open var onmessage: ((MessageEvent) -> Any)?
  fun postMessage(message: Any?, transfer: Array<Any>)
  fun close()
}