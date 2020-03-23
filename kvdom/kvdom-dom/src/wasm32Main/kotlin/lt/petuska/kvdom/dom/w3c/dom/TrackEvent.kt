package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [TrackEvent](https://developer.mozilla.org/en/docs/Web/API/TrackEvent) to Kotlin
 */
@NoWASM
actual open class TrackEvent actual constructor(
  type: String,
  eventInitDict: TrackEventInit
) : Event(type, eventInitDict) {
  actual open val track: UnionAudioTrackOrTextTrackOrVideoTrack?
    get() = TODO("Not yet implemented")
  
  actual companion object {
    actual val NONE: Short
      get() = TODO("Not yet implemented")
    actual val CAPTURING_PHASE: Short
      get() = TODO("Not yet implemented")
    actual val AT_TARGET: Short
      get() = TODO("Not yet implemented")
    actual val BUBBLING_PHASE: Short
      get() = TODO("Not yet implemented")
  }
  
}

actual interface TrackEventInit : EventInit {
  actual var track: UnionAudioTrackOrTextTrackOrVideoTrack?
}