package lt.petuska.kvdom.definitions.dom.node


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Element
 */
expect open class Element : Node {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute
     */
    fun setAttribute(name: String, value: String)

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute
     */
    fun removeAttribute(attrName: String)
}