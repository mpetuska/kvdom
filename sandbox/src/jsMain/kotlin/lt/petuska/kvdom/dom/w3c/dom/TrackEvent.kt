package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [TrackEvent](https://developer.mozilla.org/en/docs/Web/API/TrackEvent) to Kotlin
 */
actual open external class TrackEvent actual constructor(type: String, eventInitDict: TrackEventInit) : Event {
  actual open val track: UnionAudioTrackOrTextTrackOrVideoTrack?
  
  actual companion object {
    actual val NONE: Short
    actual val CAPTURING_PHASE: Short
    actual val AT_TARGET: Short
    actual val BUBBLING_PHASE: Short
  }
}

actual external interface TrackEventInit : EventInit {
  actual var track: UnionAudioTrackOrTextTrackOrVideoTrack?
}