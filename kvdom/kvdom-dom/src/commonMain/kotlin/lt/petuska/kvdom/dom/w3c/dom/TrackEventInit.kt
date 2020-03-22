package lt.petuska.kvdom.dom.w3c.dom

expect interface TrackEventInit : EventInit {
  var track: UnionAudioTrackOrTextTrackOrVideoTrack? /* = null */
}

inline fun TrackEventInit(
  track: UnionAudioTrackOrTextTrackOrVideoTrack? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): TrackEventInit = object : TrackEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var track: UnionAudioTrackOrTextTrackOrVideoTrack? = track
}
