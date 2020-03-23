package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [TextTrackCue](https://developer.mozilla.org/en/docs/Web/API/TextTrackCue) to Kotlin
 */
@NoWASM
actual abstract class TextTrackCue : EventTarget() {
  actual open val track: TextTrack?
    get() {
      TODO()
    }
  actual open var id: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var startTime: Double
    get() {
      TODO()
    }
    set(value) {}
  actual open var endTime: Double
    get() {
      TODO()
    }
    set(value) {}
  actual open var pauseOnExit: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var onenter: ((Event) -> Dynamic)?
    get() {
      TODO()
    }
    set(value) {}
  actual open var onexit: ((Event) -> Dynamic)?
    get() {
      TODO()
    }
    set(value) {}
}