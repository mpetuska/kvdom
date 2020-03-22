package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import org.w3c.dom.get

/**
 * Exposes the JavaScript [VideoTrackList](https://developer.mozilla.org/en/docs/Web/API/VideoTrackList) to Kotlin
 */
actual typealias VideoTrackList = org.w3c.dom.VideoTrackList

actual inline operator fun VideoTrackList.get(index: Int): VideoTrack? = get(index)