package lt.petuska.kvdom.dom

import lt.petuska.kvdom.domain.node.ElementNode
import lt.petuska.kvdom.domain.node.Node
import lt.petuska.kvdom.domain.node.TextNode
import lt.petuska.kvdom.jsexternal.DNode

//https://dev.to/ycmjason/building-a-simple-virtual-dom-from-scratch-3d05

typealias Patch = (dElement: DNode) -> DNode?

fun Node.diff(new: Node?): Patch = when {
    // Node was removed
    new == null -> { dNode: DNode ->
        dNode.remove().let { null }
    }
    this is TextNode || new is TextNode -> if (this != new) { dNode: DNode ->
        // 1. Both nodes are TextNodes with different values
        // 2. One is TextNode and the other is ElementNode
        new.render().also {
            dNode.replaceWith(it)
        }
    } else { dNode: DNode ->
        // Both TextNodes with identical values
        dNode
    }
    // Completely different tags
    this is ElementNode && new is ElementNode -> if (tag != new.tag) { dNode: DNode ->
        new.render().also {
            dNode.replaceWith(it)
        }
    } else diffAttributes(new).let { attributesPatch ->
        diffChildren(new).let { childrenPatch ->
            { dNode: DNode ->
                attributesPatch(dNode)?.let {
                    childrenPatch(it)
                }
            }
        }
    }
    else -> throw IllegalStateException("Diffing Node [$this] with Node [$new] failed")
}

private fun ElementNode.diffAttributes(new: ElementNode): Patch {
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

private fun ElementNode.diffChildren(new: ElementNode): Patch {
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
