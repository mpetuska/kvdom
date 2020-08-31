package lt.petuska.kvdom.dom

public actual typealias EventTarget = org.w3c.dom.events.EventTarget

public actual fun EventTarget.deleteEventListener(type: String, oldHandler: EventHandler) {
  asDynamic()["on$type"] = undefined
}

public actual fun EventTarget.setEventListener(type: String, handler: EventHandler) {
  asDynamic()["on$type"] = handler
}
