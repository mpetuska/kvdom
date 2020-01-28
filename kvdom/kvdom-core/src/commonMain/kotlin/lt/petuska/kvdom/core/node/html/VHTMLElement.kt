package lt.petuska.kvdom.core.node.html

import lt.petuska.kvdom.core.node.VElement
import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.core.util.AttributeDelegate
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLElement

open class VHTMLElement<T : HTMLElement>(
    tag: String,
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<T>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf()
) : VElement<T>(tag, attributes, eventListeners, children) {
    var style by AttributeDelegate()
}