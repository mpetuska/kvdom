package lt.petuska.kvdom.definitions.dom

import lt.petuska.kvdom.definitions.dom.node.Node

interface NodeMock : EventTargetMock, Node {
    override fun appendChild(node: Node) {}

    override val childNodes: Array<Node> get() = arrayOf()
    override val nodeType: Int get() = 0

    override fun remove() {}

    override fun replaceWith(vararg nodes: Node) {}
}