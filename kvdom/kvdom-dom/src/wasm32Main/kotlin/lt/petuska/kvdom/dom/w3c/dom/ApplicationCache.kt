package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.xhr.ProgressEvent

actual abstract class ApplicationCache actual constructor() : EventTarget() {
  actual open val status: Short
    get() = TODO("Not yet implemented")
  actual open var onchecking: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onerror: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onnoupdate: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var ondownloading: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onprogress: ((ProgressEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onupdateready: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var oncached: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var onobsolete: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun update() {
  }
  
  actual fun abort() {
  }
  
  actual fun swapCache() {
  }
  
  actual companion object {
    actual val UNCACHED: Short
      get() = TODO("Not yet implemented")
    actual val IDLE: Short
      get() = TODO("Not yet implemented")
    actual val CHECKING: Short
      get() = TODO("Not yet implemented")
    actual val DOWNLOADING: Short
      get() = TODO("Not yet implemented")
    actual val UPDATEREADY: Short
      get() = TODO("Not yet implemented")
    actual val OBSOLETE: Short
      get() = TODO("Not yet implemented")
  }
  
}