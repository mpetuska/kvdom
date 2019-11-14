package lt.petuska.kvdom.dom

import lt.petuska.kvdom.definitions.vdom.VNode
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.domain.node.VElement

fun createElement(
    tag: String,
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener> = mutableMapOf(),
    children: MutableList<VNode> = mutableListOf()
): VElement = VElement(tag, attributes, eventListeners, children)