package lt.petuska.kvdom.definitions.dom.node

import lt.petuska.kvdom.definitions.dom.event.EventTarget


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Node
 */
actual open external class Node : EventTarget, ChildNode {
    override fun remove()

    override fun replaceWith(vararg nodes: Node)

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