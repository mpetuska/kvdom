package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.xhr.ProgressEvent

actual abstract external class ApplicationCache : EventTarget {
  actual open val status: Short
  actual open var onchecking: ((Event) -> Dynamic)?
  actual open var onerror: ((Event) -> Dynamic)?
  actual open var onnoupdate: ((Event) -> Dynamic)?
  actual open var ondownloading: ((Event) -> Dynamic)?
  actual open var onprogress: ((ProgressEvent) -> Dynamic)?
  actual open var onupdateready: ((Event) -> Dynamic)?
  actual open var oncached: ((Event) -> Dynamic)?
  actual open var onobsolete: ((Event) -> Dynamic)?
  actual fun update()
  actual fun abort()
  actual fun swapCache()
  
  actual companion object {
    actual val UNCACHED: Short
    actual val IDLE: Short
    actual val CHECKING: Short
    actual val DOWNLOADING: Short
    actual val UPDATEREADY: Short
    actual val OBSOLETE: Short
  }
}