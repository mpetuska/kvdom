package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [Worker](https://developer.mozilla.org/en/docs/Web/API/Worker) to Kotlin
 */
expect open class Worker(scriptURL: String, options: WorkerOptions) : EventTarget,
  AbstractWorker {
  var onmessage: ((MessageEvent) -> Any)?
  override var onerror: ((Event) -> Any)?
  fun terminate()
  fun postMessage(message: Any?, transfer: Array<Any>)
}