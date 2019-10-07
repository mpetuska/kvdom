package lt.petuska.kvdom.definitions.dom


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Document
 */
actual external interface Document : Node {
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

actual external class DocumentImpl : NodeImpl, Document {
    override fun getElementById(id: String): Element?

    override fun createElement(tagName: String): Element

    override fun createTextNode(data: String): Text
}