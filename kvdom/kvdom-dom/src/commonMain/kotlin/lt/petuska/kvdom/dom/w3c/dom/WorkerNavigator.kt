package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.workers.ServiceWorkerContainer

/**
 * Exposes the JavaScript [WorkerNavigator](https://developer.mozilla.org/en/docs/Web/API/WorkerNavigator) to Kotlin
 */
expect abstract class WorkerNavigator() : NavigatorID,
  NavigatorLanguage,
  NavigatorOnLine,
  NavigatorConcurrentHardware {
  open val serviceWorker: ServiceWorkerContainer
}