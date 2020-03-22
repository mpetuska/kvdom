package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [Worker](https://developer.mozilla.org/en/docs/Web/API/Worker) to Kotlin
 */
actual open class Worker actual constructor(
  scriptURL: String,
  options: WorkerOptions
) : EventTarget(),
  AbstractWorker {
  actual var onmessage: ((MessageEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onerror: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun terminate() {
  }
  
  actual fun postMessage(message: Any?, transfer: Array<Any>) {
  }
}