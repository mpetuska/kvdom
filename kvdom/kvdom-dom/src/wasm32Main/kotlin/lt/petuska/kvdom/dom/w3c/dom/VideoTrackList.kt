package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

/**
 * Exposes the JavaScript [VideoTrackList](https://developer.mozilla.org/en/docs/Web/API/VideoTrackList) to Kotlin
 */
actual abstract class VideoTrackList : EventTarget() {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  actual open val selectedIndex: Int
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
  
  actual fun getTrackById(id: String): VideoTrack? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun VideoTrackList.get(index: Int): VideoTrack? {
  TODO("Not yet implemented")
}