package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.workers.ServiceWorkerContainer

/**
 * Exposes the JavaScript [WorkerNavigator](https://developer.mozilla.org/en/docs/Web/API/WorkerNavigator) to Kotlin
 */
actual abstract class WorkerNavigator actual constructor() : NavigatorID,
  NavigatorLanguage,
  NavigatorOnLine,
  NavigatorConcurrentHardware {
  actual open val serviceWorker: ServiceWorkerContainer
    get() = TODO("Not yet implemented")
}