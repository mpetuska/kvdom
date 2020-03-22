package lt.petuska.kvdom.core.node.html

import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLLabelElement

open class VLabel(
  attributes: MutableMap<String, String> = mutableMapOf(),
  eventListeners: MutableMap<EventType, EventListener<HTMLLabelElement>> = mutableMapOf(),
  children: MutableList<VNode<*>> = mutableListOf()
) : VHTMLElement<HTMLLabelElement>("label", attributes, eventListeners, children)