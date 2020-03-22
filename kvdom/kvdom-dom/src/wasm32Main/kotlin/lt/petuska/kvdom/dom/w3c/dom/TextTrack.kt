package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [TextTrack](https://developer.mozilla.org/en/docs/Web/API/TextTrack) to Kotlin
 */
actual abstract class TextTrack actual constructor() : EventTarget(),
  UnionAudioTrackOrTextTrackOrVideoTrack {
  actual open val kind: TextTrackKind
    get() = TODO("Not yet implemented")
  actual open val label: String
    get() = TODO("Not yet implemented")
  actual open val language: String
    get() = TODO("Not yet implemented")
  actual open val id: String
    get() = TODO("Not yet implemented")
  actual open val inBandMetadataTrackDispatchType: String
    get() = TODO("Not yet implemented")
  actual open var mode: TextTrackMode
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val cues: TextTrackCueList?
    get() = TODO("Not yet implemented")
  actual open val activeCues: TextTrackCueList?
    get() = TODO("Not yet implemented")
  actual open var oncuechange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun addCue(cue: TextTrackCue) {
  }
  
  actual fun removeCue(cue: TextTrackCue) {
  }
}