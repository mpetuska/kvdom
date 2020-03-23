package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [VideoTrackList](https://developer.mozilla.org/en/docs/Web/API/VideoTrackList) to Kotlin
 */
@NoWASM
expect abstract class VideoTrackList : EventTarget {
  open val length: Int
  open val selectedIndex: Int
  open var onchange: ((Event) -> Dynamic)?
  open var onaddtrack: ((TrackEvent) -> Dynamic)?
  open var onremovetrack: ((TrackEvent) -> Dynamic)?
  abstract fun getTrackById(id: String): VideoTrack?
}

@NoWASM
expect operator fun VideoTrackList.get(index: Int): VideoTrack?
