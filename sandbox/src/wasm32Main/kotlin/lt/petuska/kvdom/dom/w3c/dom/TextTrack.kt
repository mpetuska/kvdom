package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [TextTrack](https://developer.mozilla.org/en/docs/Web/API/TextTrack) to Kotlin
 */
@NoWASM
actual abstract class TextTrack : EventTarget(), UnionAudioTrackOrTextTrackOrVideoTrack {
  actual open val kind: TextTrackKind
    get() {
      TODO()
    }
  actual open val label: String
    get() {
      TODO()
    }
  actual open val language: String
    get() {
      TODO()
    }
  actual open val id: String
    get() {
      TODO()
    }
  actual open val inBandMetadataTrackDispatchType: String
    get() {
      TODO()
    }
  actual open var mode: TextTrackMode
    get() {
      TODO()
    }
    set(value) {}
  actual open val cues: TextTrackCueList?
    get() {
      TODO()
    }
  actual open val activeCues: TextTrackCueList?
    get() {
      TODO()
    }
  actual open var oncuechange: ((Event) -> Dynamic)?
    get() {
      TODO()
    }
    set(value) {}
  
  actual fun addCue(cue: TextTrackCue) {
    TODO()
  }
  
  actual fun removeCue(cue: TextTrackCue) {
    TODO()
  }
}