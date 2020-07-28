package lt.petuska.kvdom.dom

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.toCPointer
import kotlinx.wasm.jsinterop.*
import lt.petuska.kvdom.dom.EventTarget.Companion.eventListeners
import kotlin.collections.set

actual abstract class EventTarget(arena: Arena, index: Object) : JsValue(arena, index) {
  companion object {
    // <EventListenerBody, Pointer>
    internal val eventListeners = mutableMapOf<String, Pointer>()
  }
//    fun dispatchEvent(event: Event): Boolean
}

private fun EventHandler.body() = toString().substringAfter("{")

actual fun EventTarget.deleteEventListener(type: String, oldHandler: EventHandler) {
  val listenerHash = oldHandler.body()
  eventListeners[listenerHash]?.let {
    it.toLong().toCPointer<CPointed>()?.asStableRef<KtFunction<*>>()?.let { ref ->
      js_deleteEventListener(
        arena, index,
        stringPointer(type), stringLengthBytes(type),
        it
      )
      eventListeners.remove(listenerHash)
      ref.dispose()
    }
  } ?: println("No event listener found to be removed")
}

actual fun EventTarget.setEventListener(type: String, handler: EventHandler) {
  val listenerBody = handler.body()
  val wListenerPtr = wrapFunction {
    val event = Event(it[0].arena, it[0].index)
    handler(event)
  }
  js_setEventListener(
    arena, index,
    stringPointer(type), stringLengthBytes(type),
    wListenerPtr
  )
  eventListeners[listenerBody] = wListenerPtr
}

@SymbolName("kvdom_EventTarget_setEventListener")
private external fun js_setEventListener(
  arena: Arena,
  index: Object,
  typePtr: Pointer,
  typeLen: Int,
  listenerPtr: Pointer,
)

@SymbolName("kvdom_EventTarget_deleteEventListener")
private external fun js_deleteEventListener(
  arena: Arena,
  index: Object,
  typePtr: Pointer,
  typeLen: Int,
  listenerPtr: Pointer,
)
