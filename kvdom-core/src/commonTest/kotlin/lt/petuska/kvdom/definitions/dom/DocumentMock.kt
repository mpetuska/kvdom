package lt.petuska.kvdom.definitions.dom

interface DocumentMock : Document, NodeMock {
    override fun getElementById(id: String): Element? = object : ElementMock {}

    override fun createElement(tagName: String): Element = object : ElementMock {}

    override fun createTextNode(data: String): Text = object : TextMock {}
}