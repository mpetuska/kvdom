package lt.petuska.kvdom.dom

actual typealias EventTarget = org.w3c.dom.events.EventTarget

actual fun EventTarget.deleteEventListener(type: String, oldHandler: EventHandler) {
  asDynamic()["on$type"] = undefined
}

actual fun EventTarget.setEventListener(type: String, handler: EventHandler) {
  asDynamic()["on$type"] = handler
}
