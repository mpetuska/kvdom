package lt.petuska.kvdom.dom.event

typealias EventListener<T> = (Event<T>) -> Unit
typealias EventType = String

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Event
 */
expect open class Event<T : EventTarget> {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/target
     */
    val target: T
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/type
     */
    val type: EventType

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault
     */
    fun preventDefault()
}