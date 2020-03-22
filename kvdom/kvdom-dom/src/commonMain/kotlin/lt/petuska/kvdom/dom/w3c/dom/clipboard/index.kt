package lt.petuska.kvdom.dom.w3c.dom.clipboard

import lt.petuska.kvdom.dom.w3c.dom.DataTransfer
import lt.petuska.kvdom.dom.w3c.dom.EventInit
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.fetch.Promise


external interface ClipboardEventInit : EventInit {
  var clipboardData: DataTransfer? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ClipboardEventInit(
  clipboardData: DataTransfer? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): ClipboardEventInit {
  val o = js("({})")
  o["clipboardData"] = clipboardData
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [ClipboardEvent](https://developer.mozilla.org/en/docs/Web/API/ClipboardEvent) to Kotlin
 */
public open external class ClipboardEvent(type: String, eventInitDict: ClipboardEventInit = definedExternally) : Event {
  open val clipboardData: DataTransfer?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

/**
 * Exposes the JavaScript [Clipboard](https://developer.mozilla.org/en/docs/Web/API/Clipboard) to Kotlin
 */
public abstract external class Clipboard : EventTarget {
  fun read(): Promise<DataTransfer>
  fun readText(): Promise<String>
  fun write(data: DataTransfer): Promise<Unit>
  fun writeText(data: String): Promise<Unit>
}

external interface ClipboardPermissionDescriptor {
  var allowWithoutGesture: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ClipboardPermissionDescriptor(allowWithoutGesture: Boolean? = false): ClipboardPermissionDescriptor {
  val o = js("({})")
  o["allowWithoutGesture"] = allowWithoutGesture
  return o
}