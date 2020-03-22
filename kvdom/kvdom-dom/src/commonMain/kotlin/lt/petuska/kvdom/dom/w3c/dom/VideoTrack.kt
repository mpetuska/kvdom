package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [VideoTrack](https://developer.mozilla.org/en/docs/Web/API/VideoTrack) to Kotlin
 */
expect abstract class VideoTrack() :
  UnionAudioTrackOrTextTrackOrVideoTrack {
  open val id: String
  open val kind: String
  open val label: String
  open val language: String
  open var selected: Boolean
}