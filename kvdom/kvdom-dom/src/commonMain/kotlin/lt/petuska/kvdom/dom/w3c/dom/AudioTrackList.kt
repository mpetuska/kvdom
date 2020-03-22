package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [AudioTrackList](https://developer.mozilla.org/en/docs/Web/API/AudioTrackList) to Kotlin
 */
expect abstract class AudioTrackList() : EventTarget {
  open val length: Int
  open var onchange: ((Event) -> Any)?
  open var onaddtrack: ((TrackEvent) -> Any)?
  open var onremovetrack: ((TrackEvent) -> Any)?
  fun getTrackById(id: String): AudioTrack?
}

expect inline operator fun AudioTrackList.get(index: Int): AudioTrack?