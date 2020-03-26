package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [AudioTrack](https://developer.mozilla.org/en/docs/Web/API/AudioTrack) to Kotlin
 */
@NoWASM
expect abstract class AudioTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
  open val id: String
  open val kind: String
  open val label: String
  open val language: String
  open var enabled: Boolean
}