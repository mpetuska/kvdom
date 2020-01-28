package lt.petuska.kvdom.dom.event


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget
 */
actual open external class EventTarget {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener
     */
    actual fun <T : EventTarget> addEventListener(
        type: EventType,
        listener: EventListener<T>
    )

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener
     */
    actual fun <T : EventTarget> removeEventListener(
        type: EventType,
        listener: EventListener<T>
    )
}