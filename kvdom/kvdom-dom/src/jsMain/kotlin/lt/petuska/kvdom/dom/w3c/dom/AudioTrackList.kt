package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import org.w3c.dom.get

/**
 * Exposes the JavaScript [AudioTrackList](https://developer.mozilla.org/en/docs/Web/API/AudioTrackList) to Kotlin
 */
actual typealias AudioTrackList = org.w3c.dom.AudioTrackList

actual inline operator fun AudioTrackList.get(index: Int): AudioTrack? =get(index)