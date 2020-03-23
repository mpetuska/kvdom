package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [VideoTrack](https://developer.mozilla.org/en/docs/Web/API/VideoTrack) to Kotlin
 */
actual abstract external class VideoTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
  actual open val id: String
  actual open val kind: String
  actual open val label: String
  actual open val language: String
  actual open var selected: Boolean
}