package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [MessageEvent](https://developer.mozilla.org/en/docs/Web/API/MessageEvent) to Kotlin
 */
actual open class MessageEvent actual constructor(
  type: String,
  eventInitDict: MessageEventInit
) :
  Event(type, eventInitDict) {
  actual open val data: Any?
    get() = TODO("Not yet implemented")
  actual open val origin: String
    get() = TODO("Not yet implemented")
  actual open val lastEventId: String
    get() = TODO("Not yet implemented")
  actual open val source: UnionMessagePortOrWindowProxy?
    get() = TODO("Not yet implemented")
  actual open val ports: Array<out MessagePort>
    get() = TODO("Not yet implemented")
  
  actual fun initMessageEvent(
    type: String,
    bubbles: Boolean,
    cancelable: Boolean,
    data: Any?,
    origin: String,
    lastEventId: String,
    source: UnionMessagePortOrWindowProxy?,
    ports: Array<MessagePort>
  ) {
  }
  
  actual companion object {
    actual val NONE: Short
      get() = TODO("Not yet implemented")
    actual val CAPTURING_PHASE: Short
      get() = TODO("Not yet implemented")
    actual val AT_TARGET: Short
      get() = TODO("Not yet implemented")
    actual val BUBBLING_PHASE: Short
      get() = TODO("Not yet implemented")
  }
  
}