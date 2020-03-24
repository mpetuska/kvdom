package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventInit
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

@NoWASM
expect open class RelatedEvent(type: String, eventInitDict: RelatedEventInit = RelatedEventInit()) : Event {
  open val relatedTarget: EventTarget?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface RelatedEventInit : EventInit {
  var relatedTarget: EventTarget? /* = null */
}

fun RelatedEventInit(
  relatedTarget: EventTarget? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): RelatedEventInit = object : RelatedEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var relatedTarget: EventTarget? = relatedTarget
}