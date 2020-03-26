package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

actual open external class RelatedEvent actual constructor(type: String, eventInitDict: RelatedEventInit) : Event {
  actual open val relatedTarget: EventTarget?
  
  actual companion object {
    actual val NONE: Short
    actual val CAPTURING_PHASE: Short
    actual val AT_TARGET: Short
    actual val BUBBLING_PHASE: Short
  }
}

actual external interface RelatedEventInit : EventInit {
  actual var relatedTarget: EventTarget?
}