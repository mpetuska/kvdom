package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [AudioTrackList](https://developer.mozilla.org/en/docs/Web/API/AudioTrackList) to Kotlin
 */
actual abstract class AudioTrackList actual constructor() : EventTarget() {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  actual open var onchange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onaddtrack: ((TrackEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onremovetrack: ((TrackEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun getTrackById(id: String): AudioTrack? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun AudioTrackList.get(index: Int): AudioTrack? {
  TODO("Not yet implemented")
}