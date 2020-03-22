package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.xhr.ProgressEvent

expect abstract class ApplicationCache() : EventTarget {
  open val status: Short
  open var onchecking: ((Event) -> Any)?
  open var onerror: ((Event) -> Any)?
  open var onnoupdate: ((Event) -> Any)?
  open var ondownloading: ((Event) -> Any)?
  open var onprogress: ((ProgressEvent) -> Any)?
  open var onupdateready: ((Event) -> Any)?
  open var oncached: ((Event) -> Any)?
  open var onobsolete: ((Event) -> Any)?
  fun update()
  fun abort()
  fun swapCache()
  
  companion object {
    val UNCACHED: Short
    val IDLE: Short
    val CHECKING: Short
    val DOWNLOADING: Short
    val UPDATEREADY: Short
    val OBSOLETE: Short
  }
}