package lt.petuska.kvdom.definitions.dom.event

typealias EventListener = (Event) -> Unit
typealias EventType = String

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Event
 */
expect open class Event {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/target
     */
    val target: EventTarget
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/type
     */
    val type: EventType

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault
     */
    fun preventDefault()
}