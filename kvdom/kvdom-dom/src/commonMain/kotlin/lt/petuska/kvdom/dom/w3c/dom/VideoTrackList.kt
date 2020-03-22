package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [VideoTrackList](https://developer.mozilla.org/en/docs/Web/API/VideoTrackList) to Kotlin
 */
expect abstract class VideoTrackList : EventTarget {
  open val length: Int
  open val selectedIndex: Int
  open var onchange: ((Event) -> Any)?
  open var onaddtrack: ((TrackEvent) -> Any)?
  open var onremovetrack: ((TrackEvent) -> Any)?
  fun getTrackById(id: String): VideoTrack?
}

expect inline operator fun VideoTrackList.get(index: Int): VideoTrack?