package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [HTMLMediaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMediaElement) to Kotlin
 */
actual abstract external class HTMLMediaElement : HTMLElement {
  actual open val error: MediaError?
  actual open var src: String
  actual open var srcObject: Dynamic
  actual open val currentSrc: String
  actual open var crossOrigin: String?
  actual open val networkState: Short
  actual open var preload: String
  actual open val buffered: TimeRanges
  actual open val readyState: Short
  actual open val seeking: Boolean
  actual open var currentTime: Double
  actual open val duration: Double
  actual open val paused: Boolean
  actual open var defaultPlaybackRate: Double
  actual open var playbackRate: Double
  actual open val played: TimeRanges
  actual open val seekable: TimeRanges
  actual open val ended: Boolean
  actual open var autoplay: Boolean
  actual open var loop: Boolean
  actual open var controls: Boolean
  actual open var volume: Double
  actual open var muted: Boolean
  actual open var defaultMuted: Boolean
  actual open val audioTracks: AudioTrackList
  actual open val videoTracks: VideoTrackList
  actual open val textTracks: TextTrackList
  actual fun load()
  actual fun canPlayType(type: String): CanPlayTypeResult
  actual fun fastSeek(time: Double)
  actual fun getStartDate(): Dynamic
  actual fun play(): Promise<Unit>
  actual fun pause()
  actual fun addTextTrack(
    kind: TextTrackKind,
    label: String,
    language: String
  ): TextTrack
  
  actual companion object {
    actual val NETWORK_EMPTY: Short
    actual val NETWORK_IDLE: Short
    actual val NETWORK_LOADING: Short
    actual val NETWORK_NO_SOURCE: Short
    actual val HAVE_NOTHING: Short
    actual val HAVE_METADATA: Short
    actual val HAVE_CURRENT_DATA: Short
    actual val HAVE_FUTURE_DATA: Short
    actual val HAVE_ENOUGH_DATA: Short
    actual val ELEMENT_NODE: Short
    actual val ATTRIBUTE_NODE: Short
    actual val TEXT_NODE: Short
    actual val CDATA_SECTION_NODE: Short
    actual val ENTITY_REFERENCE_NODE: Short
    actual val ENTITY_NODE: Short
    actual val PROCESSING_INSTRUCTION_NODE: Short
    actual val COMMENT_NODE: Short
    actual val DOCUMENT_NODE: Short
    actual val DOCUMENT_TYPE_NODE: Short
    actual val DOCUMENT_FRAGMENT_NODE: Short
    actual val NOTATION_NODE: Short
    actual val DOCUMENT_POSITION_DISCONNECTED: Short
    actual val DOCUMENT_POSITION_PRECEDING: Short
    actual val DOCUMENT_POSITION_FOLLOWING: Short
    actual val DOCUMENT_POSITION_CONTAINS: Short
    actual val DOCUMENT_POSITION_CONTAINED_BY: Short
    actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}