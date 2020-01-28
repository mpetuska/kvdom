package lt.petuska.kvdom.dsl

import lt.petuska.kvdom.core.node.VElement
import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.core.node.html.VButton
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLButtonElement
import lt.petuska.kvdom.dsl.util.KvdomDsl


@KvdomDsl
fun VElement<*>.button(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLButtonElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VButton.() -> Unit = {}
) = build(VButton(attributes, eventListeners, children), builder)