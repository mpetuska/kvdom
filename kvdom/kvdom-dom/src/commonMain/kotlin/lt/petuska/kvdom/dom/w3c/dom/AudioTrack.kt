package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [AudioTrack](https://developer.mozilla.org/en/docs/Web/API/AudioTrack) to Kotlin
 */
expect abstract class AudioTrack() :
  UnionAudioTrackOrTextTrackOrVideoTrack {
  open val id: String
  open val kind: String
  open val label: String
  open val language: String
  open var enabled: Boolean
}