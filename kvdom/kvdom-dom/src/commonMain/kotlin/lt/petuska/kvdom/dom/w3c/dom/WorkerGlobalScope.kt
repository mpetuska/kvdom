package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.performance.GlobalPerformance

/**
 * Exposes the JavaScript [WorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WorkerGlobalScope) to Kotlin
 */
expect abstract class WorkerGlobalScope() : EventTarget,
  WindowOrWorkerGlobalScope, GlobalPerformance {
  open val self: WorkerGlobalScope
  open val location: WorkerLocation
  open val navigator: WorkerNavigator
  open var onerror: ((Any, String, Int, Int, Any?) -> Any)?
  open var onlanguagechange: ((Event) -> Any)?
  open var onoffline: ((Event) -> Any)?
  open var ononline: ((Event) -> Any)?
  open var onrejectionhandled: ((Event) -> Any)?
  open var onunhandledrejection: ((PromiseRejectionEvent) -> Any)?
  fun importScripts(vararg urls: String)
}