package lt.petuska.kvdom.definitions.dom.node

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/ChildNode
 */
expect interface ChildNode {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/remove
     */
    fun remove()

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/replaceWith
     */
    fun replaceWith(vararg nodes: Node)
}