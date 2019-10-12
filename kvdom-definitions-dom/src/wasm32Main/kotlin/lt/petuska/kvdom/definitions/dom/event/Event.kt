package lt.petuska.kvdom.definitions.dom.event

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.JsValue
import kotlinx.wasm.jsinterop.Object

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

actual open class EventImpl(arena: Arena, index: Object) : JsValue(arena, index), Event {
    override val target: EventTarget
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val type: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun preventDefault() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}