package lt.petuska.kvdom.dom.event

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Event
 */
actual open external class Event<T : EventTarget> {
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Event/target
   */
  actual val target: T
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Event/type
   */
  actual val type: EventType
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault
   */
  actual fun preventDefault()
}