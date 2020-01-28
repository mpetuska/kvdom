package lt.petuska.kvdom.dsl

import lt.petuska.kvdom.core.node.VElement
import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.core.node.html.VInput
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLInputElement
import lt.petuska.kvdom.dsl.util.KvdomDsl


@KvdomDsl
fun VElement<*>.input(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLInputElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VInput.() -> Unit = {}
) = build(VInput(attributes, eventListeners, children), builder)