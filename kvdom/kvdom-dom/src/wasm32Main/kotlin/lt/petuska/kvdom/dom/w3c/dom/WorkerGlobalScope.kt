package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.performance.GlobalPerformance

/**
 * Exposes the JavaScript [WorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WorkerGlobalScope) to Kotlin
 */
actual abstract class WorkerGlobalScope actual constructor() : EventTarget(), WindowOrWorkerGlobalScope,
  GlobalPerformance {
  actual open val self: WorkerGlobalScope
    get() = TODO("Not yet implemented")
  actual open val location: WorkerLocation
    get() = TODO("Not yet implemented")
  actual open val navigator: WorkerNavigator
    get() = TODO("Not yet implemented")
  actual open var onerror: ((Any, String, Int, Int, Any?) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onlanguagechange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onoffline: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var ononline: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onrejectionhandled: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onunhandledrejection: ((PromiseRejectionEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun importScripts(vararg urls: String) {
  }
}