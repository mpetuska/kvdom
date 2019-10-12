package lt.petuska.kvdom.definitions.dom.event


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget
 */
actual external interface EventTarget {
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

actual open external class EventTargetImpl : EventTarget {
    override fun addEventListener(type: EventType, listener: EventListener)

    override fun removeEventListener(type: EventType, listener: EventListener)
}