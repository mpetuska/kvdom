package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [HTMLMediaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMediaElement) to Kotlin
 */
@NoWASM
expect abstract class HTMLMediaElement : HTMLElement {
  open val error: MediaError?
  open var src: String
  open var srcObject: Dynamic
  open val currentSrc: String
  open var crossOrigin: String?
  open val networkState: Short
  open var preload: String
  open val buffered: TimeRanges
  open val readyState: Short
  open val seeking: Boolean
  open var currentTime: Double
  open val duration: Double
  open val paused: Boolean
  open var defaultPlaybackRate: Double
  open var playbackRate: Double
  open val played: TimeRanges
  open val seekable: TimeRanges
  open val ended: Boolean
  open var autoplay: Boolean
  open var loop: Boolean
  open var controls: Boolean
  open var volume: Double
  open var muted: Boolean
  open var defaultMuted: Boolean
  open val audioTracks: AudioTrackList
  open val videoTracks: VideoTrackList
  open val textTracks: TextTrackList
  fun load()
  fun canPlayType(type: String): CanPlayTypeResult
  fun fastSeek(time: Double)
  fun getStartDate(): Dynamic
  fun play(): Promise<Unit>
  fun pause()
  fun addTextTrack(
    kind: TextTrackKind,
    label: String = "",
    language: String = ""
  ): TextTrack
  
  companion object {
    val NETWORK_EMPTY: Short
    val NETWORK_IDLE: Short
    val NETWORK_LOADING: Short
    val NETWORK_NO_SOURCE: Short
    val HAVE_NOTHING: Short
    val HAVE_METADATA: Short
    val HAVE_CURRENT_DATA: Short
    val HAVE_FUTURE_DATA: Short
    val HAVE_ENOUGH_DATA: Short
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}