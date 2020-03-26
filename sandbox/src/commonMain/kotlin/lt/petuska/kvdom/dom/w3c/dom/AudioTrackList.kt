package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [AudioTrackList](https://developer.mozilla.org/en/docs/Web/API/AudioTrackList) to Kotlin
 */
@NoWASM
expect abstract class AudioTrackList : EventTarget {
  abstract val length: Int
  abstract var onchange: ((Event) -> Dynamic)?
  abstract var onaddtrack: ((TrackEvent) -> Dynamic)?
  abstract var onremovetrack: ((TrackEvent) -> Dynamic)?
  abstract fun getTrackById(id: String): AudioTrack?
}

@NoWASM
expect operator fun AudioTrackList.get(index: Int): AudioTrack?