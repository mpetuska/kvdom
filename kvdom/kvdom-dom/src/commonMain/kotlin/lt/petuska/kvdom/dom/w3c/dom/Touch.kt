package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [Touch](https://developer.mozilla.org/en/docs/Web/API/Touch) to Kotlin
 */
expect abstract class Touch() {
  open val identifier: Int
  open val target: EventTarget
  open val screenX: Int
  open val screenY: Int
  open val clientX: Int
  open val clientY: Int
  open val pageX: Int
  open val pageY: Int
  open val region: String?
}