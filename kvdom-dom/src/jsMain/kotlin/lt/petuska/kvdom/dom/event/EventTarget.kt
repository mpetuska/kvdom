package lt.petuska.kvdom.dom.event


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget
 */
actual open external class EventTarget {
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