package lt.petuska.kvdom.dsl

import lt.petuska.kvdom.core.node.VElement
import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.core.node.html.VAnchor
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLAnchorElement
import lt.petuska.kvdom.dsl.util.KvdomDsl


@KvdomDsl
fun VElement<*>.a(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLAnchorElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VAnchor.() -> Unit = {}
) = build(VAnchor(attributes, eventListeners, children), builder)