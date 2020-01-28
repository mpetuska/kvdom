package lt.petuska.kvdom.dsl

import lt.petuska.kvdom.core.node.VElement
import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.core.node.html.VHr
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLHRElement
import lt.petuska.kvdom.dsl.util.KvdomDsl


@KvdomDsl
fun VElement<*>.hr(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLHRElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VHr.() -> Unit = {}
) = build(VHr(attributes, eventListeners, children), builder)