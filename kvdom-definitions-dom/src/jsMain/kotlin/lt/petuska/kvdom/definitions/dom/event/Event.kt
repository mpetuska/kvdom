package lt.petuska.kvdom.definitions.dom.event

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Event
 */
actual external interface Event {
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

actual open external class EventImpl : Event {
    override val target: EventTarget
    override val type: String
    override fun preventDefault()
}