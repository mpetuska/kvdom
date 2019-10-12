package lt.petuska.kvdom.definitions.dom.event


expect open class EventTargetImpl : EventTarget

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget
 */
expect interface EventTarget {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener
     */
    fun addEventListener(type: EventType, listener: EventListener)

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener
     */
    fun removeEventListener(type: EventType, listener: EventListener)
}