package lt.petuska.kvdom.core.node.html

import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLButtonElement

open class VButton(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLButtonElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf()
) : VHTMLElement<HTMLButtonElement>("button", attributes, eventListeners, children)