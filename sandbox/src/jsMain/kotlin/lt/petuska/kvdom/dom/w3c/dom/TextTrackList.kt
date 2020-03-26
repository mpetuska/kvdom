package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

actual abstract external class TextTrackList : EventTarget {
  actual open val length: Int
  actual open var onchange: ((Event) -> Dynamic)?
  actual open var onaddtrack: ((TrackEvent) -> Dynamic)?
  actual open var onremovetrack: ((TrackEvent) -> Dynamic)?
  actual fun getTrackById(id: String): TextTrack?
}

@Suppress("UnsafeCastFromDynamic")
actual operator fun TextTrackList.get(index: Int): TextTrack? = asDynamic()[index]