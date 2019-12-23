package lt.petuska.kvdom.core.node

import lt.petuska.kvdom.core.util.UUID
import lt.petuska.kvdom.dom.document
import lt.petuska.kvdom.dom.event.EventListener
import lt.petuska.kvdom.dom.event.EventType
import lt.petuska.kvdom.dom.node.Element
import lt.petuska.kvdom.dom.node.Node

open class VElement internal constructor(
    uuid: Long = UUID.next(),
    node: Node? = null,
    var tag: String,
    val attributes: MutableMap<String, String> = mutableMapOf(),
    val eventListeners: MutableMap<EventType, EventListener> = mutableMapOf(),
    val children: MutableList<VNode> = mutableListOf()
) : VNode(uuid, node) {
    constructor(
        tag: String,
        attributes: MutableMap<String, String> = mutableMapOf(),
        eventListeners: MutableMap<EventType, EventListener> = mutableMapOf(),
        children: MutableList<VNode> = mutableListOf()
    ) : this(UUID.next(), null, tag, attributes, eventListeners, children)

    override fun copy(): VElement = run {
        VElement(
            uuid,
            `$node`,
            tag,
            HashMap(attributes),
            HashMap(eventListeners),
            ArrayList(children.map(VNode::copy))
        )
    }

    override fun toHtml(): String = StringBuilder().run {
        append("<$tag")
        attributes.forEach {
            append(" ${it.key}=\"${it.value}\"")
        }
        append(">")
        children.forEach {
            append(it.toHtml())
        }
        append("</$tag>")
        toString()
    }

    override fun render(): Element = document.createElement(tag).also { node: Element ->
        attributes.forEach {
            node.setAttribute(it.key, it.value)
        }
        eventListeners.forEach { (key, value) ->
            node.addEventListener(key, value)
        }
    }

    override fun diff(): () -> Node? = when ((snapshot as VElement).tag) {
        tag -> run {
            val dElement = `$node` as Element
            val snap = snapshot as VElement

            val attrPatch = diffAttributes(dElement, snap)
            val eventListenerPatch = diffEventListeners(dElement, snap)
            val childPatch = diffChildren(dElement, snap)

            return {
                attrPatch()
                eventListenerPatch()
                childPatch()
                dElement
            }
        }

        else -> {
            {
                render().also {
                    `$node`?.replaceWith(it)
                    children.forEach { child ->
                        child.patch(it)
                    }
                }
            }
        }
    }

    private fun diffAttributes(dElement: Element, snap: VElement): () -> Unit {
        val patches = mutableListOf<() -> Unit>()

        attributes.forEach { (key, value) ->
            patches.add {
                dElement.setAttribute(key, value)
            }
        }

        snap.attributes.keys.forEach { key ->
            if (!attributes.containsKey(key)) {
                patches.add {
                    dElement.removeAttribute(key)
                }
            }
        }

        return {
            patches.forEach {
                it()
            }
        }
    }

    private fun diffEventListeners(dElement: Element, snap: VElement): () -> Unit {
        val patches = mutableListOf<() -> Unit>()

        eventListeners.forEach { (key, value) ->
            if (snap.eventListeners[key]?.hashCode() != value.hashCode()) {
                patches.add {
                    eventListeners[key]?.let {
                        dElement.removeEventListener(key, it)
                    }
                    dElement.addEventListener(key, value)
                }
            }
        }
        snap.eventListeners.forEach { (key, value) ->
            if (!eventListeners.containsKey(key)) {
                patches.add {
                    dElement.apply {
                        removeEventListener(key, value)
                    }
                }
            }
        }

        return {
            patches.forEach {
                it()
            }
        }
    }

    private fun diffChildren(dElement: Element, snap: VElement): () -> Unit {
        val childPatches = children.filter { current ->
            snap.children.any { old ->
                current.uuid == old.uuid
            }
        }.map { child ->
            {
                child.patch(dElement)
            }
        }

        val removalPatches = snap.children.filter { old ->
            children.none { current ->
                old.uuid == current.uuid
            }
        }.map { child ->
            {
                child.patch(null)
            }
        }

        return {
            childPatches.forEach { it() }
            removalPatches.forEach { it() }
        }
    }
}