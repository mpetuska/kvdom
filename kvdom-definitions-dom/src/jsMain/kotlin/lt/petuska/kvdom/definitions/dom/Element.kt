package lt.petuska.kvdom.definitions.dom


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Element
 */
actual external interface Element : Node, ChildNode {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute
     */
    actual fun setAttribute(name: String, value: String)

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute
     */
    actual fun removeAttribute(attrName: String)
}

actual external class ElementImpl : NodeImpl, Element {
    override fun setAttribute(name: String, value: String)

    override fun removeAttribute(attrName: String)
}