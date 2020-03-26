package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [AudioTrackList](https://developer.mozilla.org/en/docs/Web/API/AudioTrackList) to Kotlin
 */
actual abstract external class AudioTrackList : EventTarget {
  actual abstract val length: Int
  actual abstract var onchange: ((Event) -> Dynamic)?
  actual abstract var onaddtrack: ((TrackEvent) -> Dynamic)?
  actual abstract var onremovetrack: ((TrackEvent) -> Dynamic)?
  actual abstract fun getTrackById(id: String): AudioTrack?
}

@Suppress("UnsafeCastFromDynamic")
actual operator fun AudioTrackList.get(index: Int): AudioTrack? = asDynamic()[index]