package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.definitions.dom.event.EventListener
import lt.petuska.kvdom.definitions.dom.event.EventType
import lt.petuska.kvdom.definitions.dom.node.Document
import lt.petuska.kvdom.definitions.dom.node.Element
import lt.petuska.kvdom.definitions.dom.node.Node
import lt.petuska.kvdom.definitions.vdom.Patch
import lt.petuska.kvdom.definitions.vdom.VElement
import lt.petuska.kvdom.definitions.vdom.VNode
import lt.petuska.kvdom.util.safeSlice

open class ElementNode(
    override var tag: String,
    override val attributes: MutableMap<String, String> = mutableMapOf(),
    override val eventListeners: MutableMap<EventType, EventListener> = mutableMapOf(),
    override val children: MutableList<VNode> = mutableListOf()
) : BaseNode(), VElement {
    override fun copy(): VElement = run {
        ElementNode(
            tag,
            attributes.toMutableMap(),
            eventListeners.toMutableMap(),
            children.map(VNode::copy).toMutableList()
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

    override fun render(document: Document): Element = document.createElement(tag).also { node: Node ->
        (node as Element).apply {
            attributes.forEach {
                node.setAttribute(it.key, it.value)
            }
            eventListeners.forEach { (key, value) ->
                node.addEventListener(key, value)
            }
        }
        children.forEach {
            node.appendChild(it.render())
        }
    }

    fun diff(new: VElement): Patch = when (tag) {
        new.tag -> run {
            val attrPatch = diffAttributes(new)
            val eventListenerPatch = diffEventListeners(new)
            val childPatch = diffChildren(new)
            val patch = { node: Node ->
                attrPatch(node)?.let(eventListenerPatch)?.let(childPatch)
            }
            patch
        }

        else -> new.render().replacePatch
    }

    private fun VElement.diffAttributes(new: VElement): Patch {
        val patches = mutableListOf<Patch>()
        new.attributes.forEach { (key, value) ->
            patches.add { node: Node ->
                (node as Element).apply {
                    setAttribute(key, value)
                }
            }
        }

        attributes.keys.forEach { key ->
            if (!new.attributes.containsKey(key)) {
                patches.add { node: Node ->
                    (node as Element).apply {
                        removeAttribute(key)
                    }
                }
            }
        }

        return { node: Node ->
            node.apply {
                patches.forEach {
                    it(this)
                }
            }
        }
    }

    private fun VElement.diffEventListeners(new: VElement): Patch {
        val patches = mutableListOf<Patch>()

        eventListeners.forEach { (key, value) ->
            if (!new.eventListeners.containsKey(key)) {
                patches.add { node: Node ->
                    (node as Element).apply {
                        println("Removing listener: $value")
                        removeEventListener(key, value)
                    }
                }
            }
        }
        new.eventListeners.forEach { (key, value) ->
            if (eventListeners[key]?.hashCode() != value.hashCode()) {
                patches.add { node: Node ->
                    (node as Element).apply {
                        eventListeners[key]?.let {
                            println("Removing listener: $it")
                            removeEventListener(key, it)
                        }
                        println("Adding listener: $value")
                        addEventListener(key, value)
                    }
                }
            }
        }

        return { node: Node ->
            node.apply {
                patches.forEach {
                    it(this)
                }
            }
        }
    }

    private fun VElement.diffChildren(new: VElement): Patch {
        val childPatches = List(children.size) {
            val oldChild = children[it]
            val newChild = new.children.getOrNull(it)
            oldChild.diff(newChild)
        }

        val extraPatches = mutableListOf<Patch>()
        for (newChild in new.children.safeSlice(children.size until new.children.size)) {
            extraPatches.add { node: Node ->
                node.apply {
                    appendChild(newChild.render())
                }
            }
        }

        return { parentNode: Node ->
            parentNode.apply {
                for ((patch, child) in childPatches.zip(childNodes)) {
                    patch(child)
                }

                extraPatches.forEach { patch ->
                    patch(this)
                }
            }
        }
    }
}