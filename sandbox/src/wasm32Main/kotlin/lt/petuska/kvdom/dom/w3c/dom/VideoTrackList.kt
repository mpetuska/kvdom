package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [VideoTrackList](https://developer.mozilla.org/en/docs/Web/API/VideoTrackList) to Kotlin
 */
@NoWASM
actual abstract class VideoTrackList : EventTarget() {
  actual open val length: Int
    get() {
      TODO()
    }
  actual open val selectedIndex: Int
    get() {
      TODO()
    }
  actual open var onchange: ((Event) -> Dynamic)?
    get() {
      TODO()
    }
    set(value) {}
  actual open var onaddtrack: ((TrackEvent) -> Dynamic)?
    get() {
      TODO()
    }
    set(value) {}
  actual open var onremovetrack: ((TrackEvent) -> Dynamic)?
    get() {
      TODO()
    }
    set(value) {}
  
  actual abstract fun getTrackById(id: String): VideoTrack?
}

@NoWASM
actual operator fun VideoTrackList.get(index: Int): VideoTrack? {
  TODO("Not yet implemented")
}