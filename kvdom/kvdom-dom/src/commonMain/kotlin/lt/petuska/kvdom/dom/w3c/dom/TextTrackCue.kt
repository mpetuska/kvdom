package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [TextTrackCue](https://developer.mozilla.org/en/docs/Web/API/TextTrackCue) to Kotlin
 */
@NoWASM
expect abstract class TextTrackCue : EventTarget {
  open val track: TextTrack?
  open var id: String
  open var startTime: Double
  open var endTime: Double
  open var pauseOnExit: Boolean
  open var onenter: ((Event) -> Dynamic)?
  open var onexit: ((Event) -> Dynamic)?
}