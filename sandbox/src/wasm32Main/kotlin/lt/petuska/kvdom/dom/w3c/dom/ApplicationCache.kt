package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.xhr.ProgressEvent

@NoWASM
actual abstract class ApplicationCache : EventTarget() {
  actual open val status: Short = TODO()
  actual open var onchecking: ((Event) -> Dynamic)? = TODO()
  actual open var onerror: ((Event) -> Dynamic)? = TODO()
  actual open var onnoupdate: ((Event) -> Dynamic)? = TODO()
  actual open var ondownloading: ((Event) -> Dynamic)? = TODO()
  actual open var onprogress: ((ProgressEvent) -> Dynamic)? = TODO()
  actual open var onupdateready: ((Event) -> Dynamic)? = TODO()
  actual open var oncached: ((Event) -> Dynamic)? = TODO()
  actual open var onobsolete: ((Event) -> Dynamic)? = TODO()
  actual fun update() {
    TODO()
  }
  
  actual fun abort() {
    TODO()
  }
  
  actual fun swapCache() {
    TODO()
  }
  
  actual companion object {
    actual val UNCACHED: Short = TODO()
    actual val IDLE: Short = TODO()
    actual val CHECKING: Short = TODO()
    actual val DOWNLOADING: Short = TODO()
    actual val UPDATEREADY: Short = TODO()
    actual val OBSOLETE: Short = TODO()
  }
}