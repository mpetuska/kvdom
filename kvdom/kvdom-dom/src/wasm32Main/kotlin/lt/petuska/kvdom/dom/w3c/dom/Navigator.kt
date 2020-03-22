package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.clipboard.Clipboard
import lt.petuska.kvdom.dom.w3c.dom.mediacapture.MediaDevices
import lt.petuska.kvdom.dom.w3c.dom.mediacapture.MediaStream
import lt.petuska.kvdom.dom.w3c.dom.mediacapture.MediaStreamConstraints
import lt.petuska.kvdom.dom.w3c.workers.ServiceWorkerContainer

/**
 * Exposes the JavaScript [Navigator](https://developer.mozilla.org/en/docs/Web/API/Navigator) to Kotlin
 */
actual abstract class Navigator actual constructor() : NavigatorID,
  NavigatorLanguage,
  NavigatorOnLine,
  NavigatorContentUtils,
  NavigatorCookies,
  NavigatorPlugins,
  NavigatorConcurrentHardware {
  actual open val clipboard: Clipboard
    get() = TODO("Not yet implemented")
  actual open val mediaDevices: MediaDevices
    get() = TODO("Not yet implemented")
  actual open val maxTouchPoints: Int
    get() = TODO("Not yet implemented")
  actual open val serviceWorker: ServiceWorkerContainer
    get() = TODO("Not yet implemented")
  
  actual fun getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: (MediaStream) -> Unit,
    errorCallback: (Any) -> Unit
  ) {
  }
  
  actual fun vibrate(pattern: Any): Boolean {
    TODO("Not yet implemented")
  }
}