package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [SharedWorker](https://developer.mozilla.org/en/docs/Web/API/SharedWorker) to Kotlin
 */
expect open class SharedWorker(scriptURL: String, name: String, options: WorkerOptions) : EventTarget, AbstractWorker {
  open val port: MessagePort
  override var onerror: ((Event) -> Any)?
}