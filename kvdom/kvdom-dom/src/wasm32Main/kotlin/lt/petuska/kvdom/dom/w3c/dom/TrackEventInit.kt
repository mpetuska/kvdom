package lt.petuska.kvdom.dom.w3c.dom

actual interface TrackEventInit : EventInit {
  actual var track: UnionAudioTrackOrTextTrackOrVideoTrack?
}