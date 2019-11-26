package lt.petuska.kvdom.dom.node


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Document
 */
expect class Document : Node {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/defaultView
     */
    val defaultView: Window?

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