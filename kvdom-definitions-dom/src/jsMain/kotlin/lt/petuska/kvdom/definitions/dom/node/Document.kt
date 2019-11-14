package lt.petuska.kvdom.definitions.dom.node


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Document
 */
actual external class Document : Node {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementById
     */
    actual fun getElementById(id: String): Element?

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement
     */
    actual fun createElement(tagName: String): Element

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Document/createTextNode
     */
    actual fun createTextNode(data: String): Text
}