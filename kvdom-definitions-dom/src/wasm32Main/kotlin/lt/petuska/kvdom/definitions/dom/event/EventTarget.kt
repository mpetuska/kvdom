package lt.petuska.kvdom.definitions.dom.event

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.toLong
import kotlinx.wasm.jsinterop.*
import lt.petuska.kvdom.definitions.dom.util.JsObject
import kotlin.collections.set


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget
 */
actual interface EventTarget {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener
     */
    actual fun addEventListener(
        type: EventType,
        listener: EventListener
    )

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener
     */
    actual fun removeEventListener(
        type: EventType,
        listener: EventListener
    )
}

actual open class EventTargetImpl(arena: Arena, index: Object) : JsObject(arena, index), EventTarget {
    private val eventListeners = mutableMapOf<Int, StableRef<KtFunction<*>>>()
    override fun addEventListener(type: EventType, listener: EventListener) {
        val listenerHash = listener.hashCode()
        val ref = StableRef.create<KtFunction<Unit>> {
            val event = EventImpl(it[0].arena, it[0].index)
            listener(event)
        }
        eventListeners[listenerHash] = ref
        val wListenerPtr = ref.asCPointer().toLong().toInt()
        js_EventTarget_addEventListener(arena, index, stringPointer(type), stringLengthBytes(type), wListenerPtr)
    }

    override fun removeEventListener(type: EventType, listener: EventListener) {
        val listenerHash = listener.hashCode()
        eventListeners[listenerHash]?.let {
            val wListenerPtr = it.asCPointer().toLong().toInt()
            js_EventTarget_removeEventListener(arena, index, stringPointer(type), stringLengthBytes(type), wListenerPtr)
            it.dispose()
            eventListeners.remove(listenerHash)
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