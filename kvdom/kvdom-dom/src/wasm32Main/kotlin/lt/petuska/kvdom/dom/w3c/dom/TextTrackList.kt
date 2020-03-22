package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

actual abstract class TextTrackList actual constructor() : EventTarget() {
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
  
  actual fun getTrackById(id: String): TextTrack? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun TextTrackList.get(index: Int): TextTrack? {
  TODO("Not yet implemented")
}