package lt.petuska.kvdom.core.node

import lt.petuska.kvdom.dom.node.Document
import lt.petuska.kvdom.dom.node.Node

typealias Patch = (node: Node) -> Node?

abstract class VNode {
    fun diff(new: VNode?): Patch = when {
        new == null -> removePatch

        new is VText && this is VText -> diff(new)

        new is VElement && this is VElement -> diff(new)

        else -> new.render().replacePatch
    }

    protected val passivePatch: Patch = { node: Node -> node }
    private val removePatch: Patch get() = { node: Node -> null.apply { node.remove() } }
    protected val Node.replacePatch: Patch get() = { node: Node -> this.apply { node.replaceWith(this) } }
    abstract fun copy(): VNode
    abstract fun toHtml(): String
    abstract fun render(document: Document = lt.petuska.kvdom.dom.document): Node
}