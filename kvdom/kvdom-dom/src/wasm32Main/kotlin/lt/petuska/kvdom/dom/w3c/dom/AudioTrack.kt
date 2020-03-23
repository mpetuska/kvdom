package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [AudioTrack](https://developer.mozilla.org/en/docs/Web/API/AudioTrack) to Kotlin
 */
@NoWASM
actual abstract class AudioTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
  actual open val id: String
    get() = TODO("Not yet implemented")
  actual open val kind: String
    get() = TODO("Not yet implemented")
  actual open val label: String
    get() = TODO("Not yet implemented")
  actual open val language: String
    get() = TODO("Not yet implemented")
  actual open var enabled: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
}