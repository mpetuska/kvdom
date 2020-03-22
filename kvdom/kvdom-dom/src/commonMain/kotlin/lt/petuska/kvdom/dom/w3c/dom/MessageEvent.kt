package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [MessageEvent](https://developer.mozilla.org/en/docs/Web/API/MessageEvent) to Kotlin
 */
expect open class MessageEvent(type: String, eventInitDict: MessageEventInit) :
  Event {
  open val data: Any?
  open val origin: String
  open val lastEventId: String
  open val source: UnionMessagePortOrWindowProxy?
  open val ports: Array<out MessagePort>
  fun initMessageEvent(
    type: String,
    bubbles: Boolean,
    cancelable: Boolean,
    data: Any?,
    origin: String,
    lastEventId: String,
    source: UnionMessagePortOrWindowProxy?,
    ports: Array<MessagePort>
  )
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}