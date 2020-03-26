package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

@NoWASM
actual abstract class TextTrackList : EventTarget() {
  actual open val length: Int
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
  
  actual fun getTrackById(id: String): TextTrack? {
    TODO()
  }
}

@NoWASM
actual operator fun TextTrackList.get(index: Int): TextTrack? {
  TODO("Not yet implemented")
}