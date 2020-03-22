package lt.petuska.kvdom.dom.event


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget
 */
expect open class EventTarget {
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener
   */
  fun <T : EventTarget> addEventListener(type: EventType, listener: EventListener<T>)
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener
   */
  fun <T : EventTarget> removeEventListener(type: EventType, listener: EventListener<T>)
}