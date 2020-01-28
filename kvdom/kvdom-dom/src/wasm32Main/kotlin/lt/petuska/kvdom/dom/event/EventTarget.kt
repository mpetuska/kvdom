package lt.petuska.kvdom.dom.event

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.toCPointer
import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.JsValue
import kotlinx.wasm.jsinterop.KtFunction
import kotlinx.wasm.jsinterop.Object
import kotlinx.wasm.jsinterop.Pointer
import kotlinx.wasm.jsinterop.stringLengthBytes
import kotlinx.wasm.jsinterop.stringPointer
import kotlinx.wasm.jsinterop.wrapFunction
import kotlin.collections.set


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget
 */
actual open class EventTarget(arena: Arena, index: Object) : JsValue(arena, index) {
    private companion object {
        // <EventListenerHashCode, Pointer>
        private val eventListeners = mutableMapOf<Int, Int>()
    }

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener
     */
    @Suppress("UNCHECKED_CAST")
    actual fun <T : EventTarget> addEventListener(type: EventType, listener: EventListener<T>) {
        val listenerHash = listener.hashCode()
        val wListenerPtr = wrapFunction {
            val event = Event(it[0].arena, it[0].index, this) as Event<T>
            listener(event)
        }
        eventListeners[listenerHash] = wListenerPtr
        js_EventTarget_addEventListener(arena, index, stringPointer(type), stringLengthBytes(type), wListenerPtr)
    }

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener
     */
    actual fun <T : EventTarget> removeEventListener(type: EventType, listener: EventListener<T>) {
        val listenerHash = listener.hashCode()
        eventListeners[listenerHash]?.let {
            it.toLong().toCPointer<CPointed>()?.asStableRef<KtFunction<*>>()?.let { ref ->
                js_EventTarget_removeEventListener(arena, index, stringPointer(type), stringLengthBytes(type), it)
                eventListeners.remove(listenerHash)
                ref.dispose()
            }
        } ?: println("No event listener found to be removed")
    }
}

@SymbolName("kvdom_EventTarget_addEventListener")
private external fun js_EventTarget_addEventListener(
    arena: Arena,
    index: Object,
    typePtr: Pointer,
    typeLen: Int,
    listenerPtr: Pointer
)

@SymbolName("kvdom_EventTarget_removeEventListener")
private external fun js_EventTarget_removeEventListener(
    arena: Arena,
    index: Object,
    typePtr: Pointer,
    typeLen: Int,
    listenerPtr: Pointer
)