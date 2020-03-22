package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [TextTrackCue](https://developer.mozilla.org/en/docs/Web/API/TextTrackCue) to Kotlin
 */
actual abstract class TextTrackCue actual constructor() : EventTarget() {
  actual open val track: TextTrack?
    get() = TODO("Not yet implemented")
  actual open var id: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var startTime: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var endTime: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var pauseOnExit: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onenter: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onexit: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
}