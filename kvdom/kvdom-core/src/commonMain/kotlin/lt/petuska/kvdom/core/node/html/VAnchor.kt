package lt.petuska.kvdom.core.node.html

import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.core.util.AttributeDelegate
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLAnchorElement

open class VAnchor(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLAnchorElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf()
) : VHTMLElement<HTMLAnchorElement>("a", attributes, eventListeners, children) {
    var href by AttributeDelegate()
}