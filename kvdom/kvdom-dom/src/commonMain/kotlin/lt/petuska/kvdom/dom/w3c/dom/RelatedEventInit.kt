package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

expect interface RelatedEventInit : EventInit {
  var relatedTarget: EventTarget? /* = null */
}

inline fun RelatedEventInit(
  relatedTarget: EventTarget? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): RelatedEventInit = object : RelatedEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var relatedTarget: EventTarget? = relatedTarget
}