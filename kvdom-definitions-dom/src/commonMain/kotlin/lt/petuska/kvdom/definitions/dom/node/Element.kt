package lt.petuska.kvdom.definitions.dom.node


expect class ElementImpl : Element

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Element
 */
expect interface Element : Node, ChildNode {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute
     */
    fun setAttribute(name: String, value: String)

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute
     */
    fun removeAttribute(attrName: String)
}