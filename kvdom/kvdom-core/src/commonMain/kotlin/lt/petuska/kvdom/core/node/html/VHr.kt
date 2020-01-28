package lt.petuska.kvdom.core.node.html

import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLHRElement

open class VHr(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLHRElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf()
) : VHTMLElement<HTMLHRElement>("hr", attributes, eventListeners, children)