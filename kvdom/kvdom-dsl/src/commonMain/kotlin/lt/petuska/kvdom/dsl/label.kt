package lt.petuska.kvdom.dsl

import lt.petuska.kvdom.core.node.VElement
import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.core.node.html.VLabel
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLLabelElement
import lt.petuska.kvdom.dsl.util.KvdomDsl


@KvdomDsl
fun VElement<*>.label(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLLabelElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VLabel.() -> Unit = {}
) = build(VLabel(attributes, eventListeners, children), builder)