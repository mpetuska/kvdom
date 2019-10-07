package lt.petuska.kvdom.definitions.dom

interface NodeMock : Node {
    override fun appendChild(node: Node) {}

    override val childNodes: Array<Node> get() = arrayOf()
    override val nodeType: Int get() = 0

    override fun remove() {}

    override fun replaceWith(vararg nodes: Node) {}
}