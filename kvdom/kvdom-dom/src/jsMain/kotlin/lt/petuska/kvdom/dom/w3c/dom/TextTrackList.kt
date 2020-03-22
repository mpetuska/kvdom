package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import org.w3c.dom.get

actual typealias TextTrackList = org.w3c.dom.TextTrackList

actual inline operator fun TextTrackList.get(index: Int): TextTrack? = get(index)