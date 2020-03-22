package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

expect abstract class TextTrackList() : EventTarget {
  open val length: Int
  open var onchange: ((Event) -> Any)?
  open var onaddtrack: ((TrackEvent) -> Any)?
  open var onremovetrack: ((TrackEvent) -> Any)?
  fun getTrackById(id: String): TextTrack?
}

expect inline operator fun TextTrackList.get(index: Int): TextTrack?
