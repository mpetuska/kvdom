package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget

actual interface RelatedEventInit : EventInit {
  actual var relatedTarget: EventTarget?
}