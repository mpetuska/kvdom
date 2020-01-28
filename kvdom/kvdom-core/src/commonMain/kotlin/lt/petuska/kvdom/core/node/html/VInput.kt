package lt.petuska.kvdom.core.node.html

import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.core.util.AttributeDelegate
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLInputElement

open class VInput(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLInputElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf()
) : VHTMLElement<HTMLInputElement>("input", attributes, eventListeners, children) {
    var value by AttributeDelegate()
}