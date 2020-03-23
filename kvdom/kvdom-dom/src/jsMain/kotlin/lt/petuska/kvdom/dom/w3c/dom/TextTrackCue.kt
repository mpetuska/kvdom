package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [TextTrackCue](https://developer.mozilla.org/en/docs/Web/API/TextTrackCue) to Kotlin
 */
actual abstract external class TextTrackCue : EventTarget {
  actual open val track: TextTrack?
  actual open var id: String
  actual open var startTime: Double
  actual open var endTime: Double
  actual open var pauseOnExit: Boolean
  actual open var onenter: ((Event) -> Dynamic)?
  actual open var onexit: ((Event) -> Dynamic)?
}