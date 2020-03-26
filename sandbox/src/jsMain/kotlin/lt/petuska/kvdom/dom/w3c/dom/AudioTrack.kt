package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [AudioTrack](https://developer.mozilla.org/en/docs/Web/API/AudioTrack) to Kotlin
 */
actual abstract external class AudioTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
  actual open val id: String
  actual open val kind: String
  actual open val label: String
  actual open val language: String
  actual open var enabled: Boolean
}