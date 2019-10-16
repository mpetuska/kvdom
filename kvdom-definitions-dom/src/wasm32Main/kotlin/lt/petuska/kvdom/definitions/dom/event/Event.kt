package lt.petuska.kvdom.definitions.dom.event

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.ArenaManager
import kotlinx.wasm.jsinterop.Object
import lt.petuska.kvdom.definitions.dom.util.JsObject

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Event
 */
actual interface Event {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/target
     */
    actual val target: EventTarget
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/type
     */
    actual val type: String

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault
     */
    actual fun preventDefault()
}

actual open class EventImpl(arena: Arena, index: Object) : JsObject(arena, index), Event {
    override val target: EventTarget
        get() = run {
            ArenaManager.currentArena = arena
            val jsTarget = getProperty("target")
            EventTargetImpl(jsTarget.arena, jsTarget.index)
        }
    override val type: String get() = getStringProperty("type")

    override fun preventDefault() {
        js_Event_preventDefault(arena, index)
    }
}

@SymbolName("kvdom_Event_preventDefault")
private external fun js_Event_preventDefault(
    arena: Arena,
    index: Object
)