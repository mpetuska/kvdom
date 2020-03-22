package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.ArrayBuffer
import lt.petuska.kvdom.dom.khronos.webgl.ArrayBufferView
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.files.Blob

/**
 * Exposes the JavaScript [WebSocket](https://developer.mozilla.org/en/docs/Web/API/WebSocket) to Kotlin
 */
expect open class WebSocket(url: String, protocols: Any) :
  EventTarget {
  open val url: String
  open val readyState: Short
  open val bufferedAmount: Number
  var onopen: ((Event) -> Any)?
  var onerror: ((Event) -> Any)?
  var onclose: ((Event) -> Any)?
  open val extensions: String
  open val protocol: String
  var onmessage: ((MessageEvent) -> Any)?
  var binaryType: BinaryType
  fun close(code: Short, reason: String)
  fun send(data: String)
  fun send(data: Blob)
  fun send(data: ArrayBuffer)
  fun send(data: ArrayBufferView)
  
  companion object {
    val CONNECTING: Short
    val OPEN: Short
    val CLOSING: Short
    val CLOSED: Short
  }
}