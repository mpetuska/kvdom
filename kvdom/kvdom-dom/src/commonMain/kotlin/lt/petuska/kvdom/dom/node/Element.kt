package lt.petuska.kvdom.dom.node


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

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttribute
     */
    fun getAttribute(attributeName: String): String?

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Element/tagName
     */
    val tagName: String
}