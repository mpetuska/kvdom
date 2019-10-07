package lt.petuska.kvdom.definitions.dom

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/ChildNode
 */
actual external interface ChildNode {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/remove
     */
    actual fun remove()

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/replaceWith
     */
    actual fun replaceWith(vararg nodes: Node)
}