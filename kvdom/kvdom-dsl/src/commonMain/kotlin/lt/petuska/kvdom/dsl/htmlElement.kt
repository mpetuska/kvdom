package lt.petuska.kvdom.dsl

import lt.petuska.kvdom.core.node.VElement
import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.core.node.html.VHTMLElement
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLElement
import lt.petuska.kvdom.dsl.util.KvdomDsl


@KvdomDsl
fun <T : HTMLElement> VElement<*>.htmlElement(
    tag: String,
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<T>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VHTMLElement<T>.() -> Unit = {}
) = build(VHTMLElement(tag, attributes, eventListeners, children), builder)

@KvdomDsl
internal fun <T : VHTMLElement<*>> VElement<*>.build(
    instance: T,
    builder: T.() -> Unit
) = instance.also {
    it.builder()
    children.add(it)
}