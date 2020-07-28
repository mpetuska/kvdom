package lt.petuska.kvdom.dom

typealias EventHandler = ((Event) -> Unit)

expect abstract class EventTarget {
//    fun dispatchEvent(event: Event): Boolean
}

expect fun EventTarget.deleteEventListener(type: String, oldHandler: EventHandler)
expect fun EventTarget.setEventListener(type: String, handler: EventHandler)
