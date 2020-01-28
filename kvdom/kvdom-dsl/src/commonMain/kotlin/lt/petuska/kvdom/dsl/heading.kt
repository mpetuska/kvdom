package lt.petuska.kvdom.dsl

import lt.petuska.kvdom.core.node.VElement
import lt.petuska.kvdom.core.node.VNode
import lt.petuska.kvdom.core.node.html.VHeading
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.html.HTMLHeadingElement
import lt.petuska.kvdom.dsl.util.KvdomDsl


private fun VElement<*>.heading(
    section: Int,
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLHeadingElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VHeading.() -> Unit = {}
) = build(VHeading(section, attributes, eventListeners, children), builder)

@KvdomDsl
fun VElement<*>.h1(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLHeadingElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VHeading.() -> Unit = {}
) = heading(1, attributes, eventListeners, children, builder)

@KvdomDsl
fun VElement<*>.h2(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLHeadingElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VHeading.() -> Unit = {}
) = heading(1, attributes, eventListeners, children, builder)

@KvdomDsl
fun VElement<*>.h3(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLHeadingElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VHeading.() -> Unit = {}
) = heading(1, attributes, eventListeners, children, builder)

@KvdomDsl
fun VElement<*>.h4(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLHeadingElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VHeading.() -> Unit = {}
) = heading(1, attributes, eventListeners, children, builder)

@KvdomDsl
fun VElement<*>.h5(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLHeadingElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VHeading.() -> Unit = {}
) = heading(1, attributes, eventListeners, children, builder)

@KvdomDsl
fun VElement<*>.h6(
    attributes: MutableMap<String, String> = mutableMapOf(),
    eventListeners: MutableMap<EventType, EventListener<HTMLHeadingElement>> = mutableMapOf(),
    children: MutableList<VNode<*>> = mutableListOf(), builder: VHeading.() -> Unit = {}
) = heading(1, attributes, eventListeners, children, builder)