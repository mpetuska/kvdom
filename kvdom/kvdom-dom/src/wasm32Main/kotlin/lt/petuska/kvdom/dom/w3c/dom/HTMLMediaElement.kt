package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [HTMLMediaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMediaElement) to Kotlin
 */
@NoWASM
actual abstract class HTMLMediaElement : HTMLElement() {
  actual open val error: MediaError?
    get() {
      TODO()
    }
  actual open var src: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var srcObject: Dynamic
    get() {
      TODO()
    }
    set(value) {}
  actual open val currentSrc: String
    get() {
      TODO()
    }
  actual open var crossOrigin: String?
    get() {
      TODO()
    }
    set(value) {}
  actual open val networkState: Short
    get() {
      TODO()
    }
  actual open var preload: String
    get() {
      TODO()
    }
    set(value) {}
  actual open val buffered: TimeRanges
    get() {
      TODO()
    }
  actual open val readyState: Short
    get() {
      TODO()
    }
  actual open val seeking: Boolean
    get() {
      TODO()
    }
  actual open var currentTime: Double
    get() {
      TODO()
    }
    set(value) {}
  actual open val duration: Double
    get() {
      TODO()
    }
  actual open val paused: Boolean
    get() {
      TODO()
    }
  actual open var defaultPlaybackRate: Double
    get() {
      TODO()
    }
    set(value) {}
  actual open var playbackRate: Double
    get() {
      TODO()
    }
    set(value) {}
  actual open val played: TimeRanges
    get() {
      TODO()
    }
  actual open val seekable: TimeRanges
    get() {
      TODO()
    }
  actual open val ended: Boolean
    get() {
      TODO()
    }
  actual open var autoplay: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var loop: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var controls: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var volume: Double
    get() {
      TODO()
    }
    set(value) {}
  actual open var muted: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var defaultMuted: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open val audioTracks: AudioTrackList
    get() {
      TODO()
    }
  actual open val videoTracks: VideoTrackList
    get() {
      TODO()
    }
  actual open val textTracks: TextTrackList
    get() {
      TODO()
    }
  
  actual fun load() {
    TODO("Not yet implemented")
  }
  
  actual fun canPlayType(type: String): CanPlayTypeResult {
    TODO("Not yet implemented")
  }
  
  actual fun fastSeek(time: Double) {
    TODO("Not yet implemented")
  }
  
  actual fun getStartDate(): Dynamic {
    TODO("Not yet implemented")
  }
  
  actual fun play(): Promise<Unit> {
    TODO("Not yet implemented")
  }
  
  actual fun pause() {
    TODO("Not yet implemented")
  }
  
  actual fun addTextTrack(
    kind: TextTrackKind,
    label: String,
    language: String
  ): TextTrack {
    TODO("Not yet implemented")
  }
  
  actual companion object {
    actual val NETWORK_EMPTY: Short = TODO("Not yet implemented")
    actual val NETWORK_IDLE: Short = TODO("Not yet implemented")
    actual val NETWORK_LOADING: Short = TODO("Not yet implemented")
    actual val NETWORK_NO_SOURCE: Short = TODO("Not yet implemented")
    actual val HAVE_NOTHING: Short = TODO("Not yet implemented")
    actual val HAVE_METADATA: Short = TODO("Not yet implemented")
    actual val HAVE_CURRENT_DATA: Short = TODO("Not yet implemented")
    actual val HAVE_FUTURE_DATA: Short = TODO("Not yet implemented")
    actual val HAVE_ENOUGH_DATA: Short = TODO("Not yet implemented")
    actual val ELEMENT_NODE: Short = TODO("Not yet implemented")
    actual val ATTRIBUTE_NODE: Short = TODO("Not yet implemented")
    actual val TEXT_NODE: Short = TODO("Not yet implemented")
    actual val CDATA_SECTION_NODE: Short = TODO("Not yet implemented")
    actual val ENTITY_REFERENCE_NODE: Short = TODO("Not yet implemented")
    actual val ENTITY_NODE: Short = TODO("Not yet implemented")
    actual val PROCESSING_INSTRUCTION_NODE: Short = TODO("Not yet implemented")
    actual val COMMENT_NODE: Short = TODO("Not yet implemented")
    actual val DOCUMENT_NODE: Short = TODO("Not yet implemented")
    actual val DOCUMENT_TYPE_NODE: Short = TODO("Not yet implemented")
    actual val DOCUMENT_FRAGMENT_NODE: Short = TODO("Not yet implemented")
    actual val NOTATION_NODE: Short = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_DISCONNECTED: Short = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_PRECEDING: Short = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_FOLLOWING: Short = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_CONTAINS: Short = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_CONTAINED_BY: Short = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short = TODO("Not yet implemented")
  }
}