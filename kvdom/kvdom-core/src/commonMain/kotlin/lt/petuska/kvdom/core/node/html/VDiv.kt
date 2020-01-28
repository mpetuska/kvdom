package lt.petuska.kvdom.core.node.html

import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLDivElement

open class VDiv(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLDivElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf()
) : VHTMLElement<HTMLDivElement>("div", attributes, eventListeners, children)