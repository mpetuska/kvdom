package lt.petuska.kvdom.definitions.dom


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Node
 */
actual external interface Node : EventTarget, ChildNode {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Node/appendChild
     */
    actual fun appendChild(node: Node)

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Node/childNodes
     */
    actual val childNodes: Array<Node>
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Node/nodeType
     */
    actual val nodeType: Int
}

actual open external class NodeImpl : Node {
    override fun appendChild(node: Node)
    override val childNodes: Array<Node>
    override val nodeType: Int
    override fun remove()
    override fun replaceWith(vararg nodes: Node)
}