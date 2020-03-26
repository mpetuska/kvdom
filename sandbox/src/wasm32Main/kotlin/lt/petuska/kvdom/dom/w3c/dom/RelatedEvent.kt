package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

@NoWASM
actual open class RelatedEvent actual constructor(
  type: String,
  eventInitDict: RelatedEventInit
) : Event(type, eventInitDict) {
  actual open val relatedTarget: EventTarget?
    get() = TODO("Not yet implemented")
  
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

actual interface RelatedEventInit : EventInit {
  actual var relatedTarget: EventTarget?
}