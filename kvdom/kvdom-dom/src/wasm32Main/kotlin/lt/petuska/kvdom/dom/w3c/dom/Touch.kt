package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [Touch](https://developer.mozilla.org/en/docs/Web/API/Touch) to Kotlin
 */
actual abstract class Touch actual constructor() {
  actual open val identifier: Int
    get() = TODO("Not yet implemented")
  actual open val target: EventTarget
    get() = TODO("Not yet implemented")
  actual open val screenX: Int
    get() = TODO("Not yet implemented")
  actual open val screenY: Int
    get() = TODO("Not yet implemented")
  actual open val clientX: Int
    get() = TODO("Not yet implemented")
  actual open val clientY: Int
    get() = TODO("Not yet implemented")
  actual open val pageX: Int
    get() = TODO("Not yet implemented")
  actual open val pageY: Int
    get() = TODO("Not yet implemented")
  actual open val region: String?
    get() = TODO("Not yet implemented")
}