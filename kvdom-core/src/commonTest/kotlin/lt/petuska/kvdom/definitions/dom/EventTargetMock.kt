package lt.petuska.kvdom.definitions.dom

import lt.petuska.kvdom.definitions.dom.event.EventListener
import lt.petuska.kvdom.definitions.dom.event.EventTarget
import lt.petuska.kvdom.definitions.dom.event.EventType

interface EventTargetMock : EventTarget {
    override fun addEventListener(type: EventType, listener: EventListener) {}

    override fun removeEventListener(type: EventType, listener: EventListener) {}
}