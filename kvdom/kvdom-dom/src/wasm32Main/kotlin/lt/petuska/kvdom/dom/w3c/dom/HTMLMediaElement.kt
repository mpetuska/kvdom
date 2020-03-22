package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [HTMLMediaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMediaElement) to Kotlin
 */
actual abstract class HTMLMediaElement actual constructor() : HTMLElement() {
  actual open val error: MediaError?
    get() = TODO("Not yet implemented")
  actual open var src: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var srcObject: Any
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val currentSrc: String
    get() = TODO("Not yet implemented")
  actual open var crossOrigin: String?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val networkState: Short
    get() = TODO("Not yet implemented")
  actual open var preload: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val buffered: TimeRanges
    get() = TODO("Not yet implemented")
  actual open val readyState: Short
    get() = TODO("Not yet implemented")
  actual open val seeking: Boolean
    get() = TODO("Not yet implemented")
  actual open var currentTime: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val duration: Double
    get() = TODO("Not yet implemented")
  actual open val paused: Boolean
    get() = TODO("Not yet implemented")
  actual open var defaultPlaybackRate: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var playbackRate: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val played: TimeRanges
    get() = TODO("Not yet implemented")
  actual open val seekable: TimeRanges
    get() = TODO("Not yet implemented")
  actual open val ended: Boolean
    get() = TODO("Not yet implemented")
  actual open var autoplay: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var loop: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var controls: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var volume: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var muted: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var defaultMuted: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val audioTracks: AudioTrackList
    get() = TODO("Not yet implemented")
  actual open val videoTracks: VideoTrackList
    get() = TODO("Not yet implemented")
  actual open val textTracks: TextTrackList
    get() = TODO("Not yet implemented")
  
  actual fun load() {
  }
  
  actual fun canPlayType(type: String): CanPlayTypeResult {
    TODO("Not yet implemented")
  }
  
  actual fun fastSeek(time: Double) {
  }
  
  actual fun getStartDate(): Any {
    TODO("Not yet implemented")
  }
  
  actual fun play(): Promise<Unit> {
    TODO("Not yet implemented")
  }
  
  actual fun pause() {
  }
  
  actual fun addTextTrack(
    kind: TextTrackKind,
    label: String,
    language: String
  ): TextTrack {
    TODO("Not yet implemented")
  }
  
  actual companion object {
    actual val NETWORK_EMPTY: Short
      get() = TODO("Not yet implemented")
    actual val NETWORK_IDLE: Short
      get() = TODO("Not yet implemented")
    actual val NETWORK_LOADING: Short
      get() = TODO("Not yet implemented")
    actual val NETWORK_NO_SOURCE: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_NOTHING: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_METADATA: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_CURRENT_DATA: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_FUTURE_DATA: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_ENOUGH_DATA: Short
      get() = TODO("Not yet implemented")
    actual val ELEMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val ATTRIBUTE_NODE: Short
      get() = TODO("Not yet implemented")
    actual val TEXT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val CDATA_SECTION_NODE: Short
      get() = TODO("Not yet implemented")
    actual val ENTITY_REFERENCE_NODE: Short
      get() = TODO("Not yet implemented")
    actual val ENTITY_NODE: Short
      get() = TODO("Not yet implemented")
    actual val PROCESSING_INSTRUCTION_NODE: Short
      get() = TODO("Not yet implemented")
    actual val COMMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_TYPE_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_FRAGMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val NOTATION_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_DISCONNECTED: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_PRECEDING: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_FOLLOWING: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_CONTAINS: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_CONTAINED_BY: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
      get() = TODO("Not yet implemented")
  }
  
}