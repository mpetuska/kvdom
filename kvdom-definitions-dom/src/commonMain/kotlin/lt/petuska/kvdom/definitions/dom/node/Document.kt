package lt.petuska.kvdom.definitions.dom.node


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Document
 */
expect class Document : Node {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementById
     */
    fun getElementById(id: String): Element?

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement
     */
    fun createElement(tagName: String): Element

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/createTextNode
     */
    fun createTextNode(data: String): Text
}