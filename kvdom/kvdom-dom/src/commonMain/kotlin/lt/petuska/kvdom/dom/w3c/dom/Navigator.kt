package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.clipboard.Clipboard
import lt.petuska.kvdom.dom.w3c.dom.mediacapture.MediaDevices
import lt.petuska.kvdom.dom.w3c.dom.mediacapture.MediaStream
import lt.petuska.kvdom.dom.w3c.dom.mediacapture.MediaStreamConstraints
import lt.petuska.kvdom.dom.w3c.workers.ServiceWorkerContainer

/**
 * Exposes the JavaScript [Navigator](https://developer.mozilla.org/en/docs/Web/API/Navigator) to Kotlin
 */
expect abstract class Navigator() : NavigatorID,
  NavigatorLanguage,
  NavigatorOnLine,
  NavigatorContentUtils,
  NavigatorCookies,
  NavigatorPlugins,
  NavigatorConcurrentHardware {
  open val clipboard: Clipboard
  open val mediaDevices: MediaDevices
  open val maxTouchPoints: Int
  open val serviceWorker: ServiceWorkerContainer
  fun getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: (MediaStream) -> Unit,
    errorCallback: (Any) -> Unit
  )
  
  fun vibrate(pattern: Any): Boolean
}