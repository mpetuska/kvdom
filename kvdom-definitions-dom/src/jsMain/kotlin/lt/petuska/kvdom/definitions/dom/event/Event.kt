package lt.petuska.kvdom.definitions.dom.event

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Event
 */
actual open external class Event {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/target
     */
    actual val target: EventTarget
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/type
     */
    actual val type: EventType

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault
     */
    actual fun preventDefault()
}