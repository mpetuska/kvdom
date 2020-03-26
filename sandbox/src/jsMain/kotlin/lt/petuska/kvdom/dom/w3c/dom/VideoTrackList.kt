package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [VideoTrackList](https://developer.mozilla.org/en/docs/Web/API/VideoTrackList) to Kotlin
 */
actual abstract external class VideoTrackList : EventTarget {
  actual open val length: Int
  actual open val selectedIndex: Int
  actual open var onchange: ((Event) -> Dynamic)?
  actual open var onaddtrack: ((TrackEvent) -> Dynamic)?
  actual open var onremovetrack: ((TrackEvent) -> Dynamic)?
  actual abstract fun getTrackById(id: String): VideoTrack?
}

@Suppress("UnsafeCastFromDynamic")
actual operator fun VideoTrackList.get(index: Int): VideoTrack? = asDynamic()[index]