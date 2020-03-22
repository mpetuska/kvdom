package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [TextTrack](https://developer.mozilla.org/en/docs/Web/API/TextTrack) to Kotlin
 */
expect abstract class TextTrack() : EventTarget,
  UnionAudioTrackOrTextTrackOrVideoTrack {
  open val kind: TextTrackKind
  open val label: String
  open val language: String
  open val id: String
  open val inBandMetadataTrackDispatchType: String
  open var mode: TextTrackMode
  open val cues: TextTrackCueList?
  open val activeCues: TextTrackCueList?
  open var oncuechange: ((Event) -> Any)?
  fun addCue(cue: TextTrackCue)
  fun removeCue(cue: TextTrackCue)
}