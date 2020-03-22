package lt.petuska.kvdom.dom.w3c.dom

actual interface AddEventListenerOptions : EventListenerOptions {
  actual var passive: Boolean?
  actual var once: Boolean?
}