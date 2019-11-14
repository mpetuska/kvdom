package lt.petuska.kvdom.definitions.dom.node


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Element
 */
actual open external class Element : Node, ChildNode {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute
     */
    actual fun setAttribute(name: String, value: String)

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute
     */
    actual fun removeAttribute(attrName: String)
}