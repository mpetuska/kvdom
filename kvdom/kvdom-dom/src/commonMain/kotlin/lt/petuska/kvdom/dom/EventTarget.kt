package lt.petuska.kvdom.dom

public typealias EventHandler = ((Event) -> Unit)

public expect abstract class EventTarget {
//    fun dispatchEvent(event: Event): Boolean
}

public expect fun EventTarget.deleteEventListener(type: String, oldHandler: EventHandler)
public expect fun EventTarget.setEventListener(type: String, handler: EventHandler)
