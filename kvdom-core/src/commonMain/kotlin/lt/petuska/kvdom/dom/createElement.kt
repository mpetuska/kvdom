package lt.petuska.kvdom.dom

import lt.petuska.kvdom.definitions.dom.event.EventListener
import lt.petuska.kvdom.definitions.dom.event.EventType
import lt.petuska.kvdom.definitions.vdom.VNode
import lt.petuska.kvdom.domain.node.ElementNode

fun createElement(
    tag: String,
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener> = mutableMapOf(),
    children: MutableList<VNode> = mutableListOf()
): ElementNode = ElementNode(tag, attributes, eventListeners, children)