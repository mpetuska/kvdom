package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

@NoWASM
expect abstract class TextTrackList : EventTarget {
  open val length: Int
  open var onchange: ((Event) -> Dynamic)?
  open var onaddtrack: ((TrackEvent) -> Dynamic)?
  open var onremovetrack: ((TrackEvent) -> Dynamic)?
  fun getTrackById(id: String): TextTrack?
}

@NoWASM
expect operator fun TextTrackList.get(index: Int): TextTrack?
