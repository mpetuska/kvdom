package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.ArrayBuffer
import lt.petuska.kvdom.dom.khronos.webgl.ArrayBufferView
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.files.Blob

/**
 * Exposes the JavaScript [WebSocket](https://developer.mozilla.org/en/docs/Web/API/WebSocket) to Kotlin
 */
actual open class WebSocket actual constructor(url: String, protocols: Any) :
  EventTarget() {
  actual open val url: String
    get() = TODO("Not yet implemented")
  actual open val readyState: Short
    get() = TODO("Not yet implemented")
  actual open val bufferedAmount: Number
    get() = TODO("Not yet implemented")
  actual var onopen: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var onerror: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var onclose: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val extensions: String
    get() = TODO("Not yet implemented")
  actual open val protocol: String
    get() = TODO("Not yet implemented")
  actual var onmessage: ((MessageEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var binaryType: BinaryType
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun close(code: Short, reason: String) {
  }
  
  actual fun send(data: String) {
  }
  
  actual fun send(data: Blob) {
  }
  
  actual fun send(data: ArrayBuffer) {
  }
  
  actual fun send(data: ArrayBufferView) {
  }
  
  actual companion object {
    actual val CONNECTING: Short
      get() = TODO("Not yet implemented")
    actual val OPEN: Short
      get() = TODO("Not yet implemented")
    actual val CLOSING: Short
      get() = TODO("Not yet implemented")
    actual val CLOSED: Short
      get() = TODO("Not yet implemented")
  }
  
}