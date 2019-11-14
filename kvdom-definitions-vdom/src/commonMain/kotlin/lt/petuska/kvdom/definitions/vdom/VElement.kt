package lt.petuska.kvdom.definitions.vdom

import lt.petuska.kvdom.definitions.dom.event.EventListener
import lt.petuska.kvdom.definitions.dom.event.EventType
import lt.petuska.kvdom.definitions.dom.node.Document
import lt.petuska.kvdom.definitions.dom.node.Element


interface VElement : VNode {
    val tag: String
    val attributes: MutableMap<String, String>
    val eventListeners: MutableMap<EventType, EventListener>
    val children: MutableList<VNode>

    override fun render(document: Document): Element
    override fun copy(): VElement
}