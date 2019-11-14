package lt.petuska.kvdom.definitions.dom.event


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget
 */
expect open class EventTarget {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener
     */
    fun addEventListener(type: EventType, listener: EventListener)

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener
     */
    fun removeEventListener(type: EventType, listener: EventListener)
}