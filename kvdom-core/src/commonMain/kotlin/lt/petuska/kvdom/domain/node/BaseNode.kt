package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.definitions.dom.node.Node
import lt.petuska.kvdom.definitions.vdom.Patch
import lt.petuska.kvdom.definitions.vdom.VNode

abstract class BaseNode : VNode {
    override fun diff(new: VNode?): Patch = when {
        new == null -> removePatch

        new is TextNode && this is TextNode -> diff(new)

        new is ElementNode && this is ElementNode -> diff(new)

        else -> new.render().replacePatch
    }

    protected val passivePatch: Patch = { node: Node -> node }
    private val removePatch: Patch get() = { node: Node -> null.apply { node.remove() } }
    protected val Node.replacePatch: Patch get() = { node: Node -> this.apply { node.replaceWith(this) } }
}