package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [SharedWorker](https://developer.mozilla.org/en/docs/Web/API/SharedWorker) to Kotlin
 */
actual open class SharedWorker actual constructor(
  scriptURL: String,
  name: String,
  options: WorkerOptions
) : EventTarget(), AbstractWorker {
  actual open val port: MessagePort
    get() = TODO("Not yet implemented")
  actual override var onerror: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
}