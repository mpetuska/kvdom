package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit

/**
 * Exposes the JavaScript [TrackEvent](https://developer.mozilla.org/en/docs/Web/API/TrackEvent) to Kotlin
 */
@NoWASM
expect open class TrackEvent(type: String, eventInitDict: TrackEventInit = TrackEventInit()) : Event {
  open val track: UnionAudioTrackOrTextTrackOrVideoTrack?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface TrackEventInit : EventInit {
  var track: UnionAudioTrackOrTextTrackOrVideoTrack? /* = null */
}

fun TrackEventInit(
  track: UnionAudioTrackOrTextTrackOrVideoTrack? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): TrackEventInit = object : TrackEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var track: UnionAudioTrackOrTextTrackOrVideoTrack? = track
}