package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DedicatedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/DedicatedWorkerGlobalScope) to Kotlin
 */
actual abstract class DedicatedWorkerGlobalScope actual constructor() :
  WorkerGlobalScope() {
  actual open var onmessage: ((MessageEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun postMessage(message: Any?, transfer: Array<Any>) {
  }
  
  actual fun close() {
  }
}