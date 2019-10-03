package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.domain.Patch
import lt.petuska.kvdom.jsexternal.Document
import lt.petuska.kvdom.jsexternal.IDNode
import lt.petuska.kvdom.util.safeSlice


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

    override fun render(doc: Document): IDNode = doc.createElement(tag).also { dNode: IDNode ->
        attributes.forEach {
            dNode.setAttribute(it.key, it.value)
        }
        children.forEach {
            dNode.appendChild(it.render())
        }
    }

    override fun diffExisting(new: INode): Patch = when {
        new is IElementNode && tag == new.tag -> diffAttributes(new).let { attributesPatch ->
            diffChildren(new).let { childrenPatch ->
                { dNode: IDNode ->
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
            patches.add { dNode: IDNode ->
                dNode.apply {
                    setAttribute(key, value)
                }
            }
        }

        attributes.keys.forEach { key ->
            if (!new.attributes.containsKey(key)) {
                patches.add { dNode: IDNode ->
                    dNode.apply {
                        removeAttribute(key)
                    }
                }
            }
        }

        return { dNode: IDNode ->
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
        for (newChild in new.children.safeSlice(children.size until new.children.size)) {
            extraPatches.add { dNode ->
                dNode.apply {
                    appendChild(newChild.render())
                }
            }
        }

        return { parentDNode ->
            parentDNode.apply {
                for ((patch, dChild) in patches.zip(childNodes)) {
                    patch(dChild)
                }

                extraPatches.forEach { patch ->
                    patch(this)
                }
            }
        }
    }
}