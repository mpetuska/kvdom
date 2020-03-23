package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [VideoTrack](https://developer.mozilla.org/en/docs/Web/API/VideoTrack) to Kotlin
 */
@NoWASM
actual abstract class VideoTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
  actual open val id: String
    get() = TODO("Not yet implemented")
  actual open val kind: String
    get() = TODO("Not yet implemented")
  actual open val label: String
    get() = TODO("Not yet implemented")
  actual open val language: String
    get() = TODO("Not yet implemented")
  actual open var selected: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
}