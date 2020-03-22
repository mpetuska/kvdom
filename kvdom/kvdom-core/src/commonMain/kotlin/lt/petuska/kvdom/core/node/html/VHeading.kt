package lt.petuska.kvdom.core.node.html

import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLHeadingElement

open class VHeading(
  section: Int,
  attributes: MutableMap<String, String> = mutableMapOf(),
  eventListeners: MutableMap<EventType, EventListener<HTMLHeadingElement>> = mutableMapOf(),
  children: MutableList<VNode<*>> = mutableListOf()
) : VHTMLElement<HTMLHeadingElement>("h$section", attributes, eventListeners, children)