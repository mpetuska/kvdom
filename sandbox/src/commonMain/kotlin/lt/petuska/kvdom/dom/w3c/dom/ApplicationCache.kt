package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.xhr.ProgressEvent

@NoWASM
expect abstract class ApplicationCache : EventTarget {
  open val status: Short
  open var onchecking: ((Event) -> Dynamic)?
  open var onerror: ((Event) -> Dynamic)?
  open var onnoupdate: ((Event) -> Dynamic)?
  open var ondownloading: ((Event) -> Dynamic)?
  open var onprogress: ((ProgressEvent) -> Dynamic)?
  open var onupdateready: ((Event) -> Dynamic)?
  open var oncached: ((Event) -> Dynamic)?
  open var onobsolete: ((Event) -> Dynamic)?
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