package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [TextTrack](https://developer.mozilla.org/en/docs/Web/API/TextTrack) to Kotlin
 */
actual abstract external class TextTrack : EventTarget, UnionAudioTrackOrTextTrackOrVideoTrack {
  actual open val kind: TextTrackKind
  actual open val label: String
  actual open val language: String
  actual open val id: String
  actual open val inBandMetadataTrackDispatchType: String
  actual open var mode: TextTrackMode
  actual open val cues: TextTrackCueList?
  actual open val activeCues: TextTrackCueList?
  actual open var oncuechange: ((Event) -> Dynamic)?
  actual fun addCue(cue: TextTrackCue)
  actual fun removeCue(cue: TextTrackCue)
}