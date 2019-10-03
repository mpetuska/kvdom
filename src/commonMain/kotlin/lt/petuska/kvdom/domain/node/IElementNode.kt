package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.domain.Patch
import lt.petuska.kvdom.jsexternal.DElement
import lt.petuska.kvdom.jsexternal.DNode
import lt.petuska.kvdom.jsexternal.Document


interface IElementNode : INode {
    val tag: String
    val attributes: Map<String, String>
    val children: List<INode>
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

    override fun render(doc: Document): DElement = doc.createElement(tag).also { dElement ->
        attributes.forEach {
            dElement.setAttribute(it.key, it.value)
        }
        children.forEach {
            dElement.appendChild(it.render())
        }
    }

    override fun diffExisting(new: INode): Patch = when {
        new is IElementNode && tag == new.tag -> diffAttributes(new).let { attributesPatch ->
            diffChildren(new).let { childrenPatch ->
                { dNode: DNode ->
                    attributesPatch(dNode)?.let {
                        childrenPatch(it)
                    }
                }
            }
        }
        else -> { dNode ->
            new.render().also {
                dNode.replaceWith(it)
            }
        }
    }

    fun diffAttributes(new: IElementNode): Patch {
        val patches = mutableListOf<Patch>()
        new.attributes.forEach { (key, value) ->
            patches.add { dNode: DNode ->
                dNode.apply {
                    setAttribute(key, value)
                }
            }
        }

        attributes.keys.forEach { key ->
            if (!new.attributes.containsKey(key)) {
                patches.add { dNode: DNode ->
                    dNode.apply {
                        removeAttribute(key)
                    }
                }
            }
        }

        return { dNode: DNode ->
            dNode.apply {
                patches.forEach {
                    it(this)
                }
            }
        }
    }

    fun diffChildren(new: IElementNode): Patch {
        val patches = List(children.size) {
            children[it].diff(new.children.getOrNull(it))
        }
        val extraPatches = mutableListOf<Patch>()
        for (newChild in new.children.slice(children.size until new.children.size)) {
            extraPatches.add { dNode: DNode ->
                dNode.apply {
                    appendChild(newChild.render())
                }
            }
        }

        return { dNode: DNode ->
            for ((patch, dChild) in patches.zip(dNode.childNodes)) {
                patch(dChild)
            }
            dNode.apply {
                extraPatches.forEach {
                    it(this)
                }
            }
        }
    }
}