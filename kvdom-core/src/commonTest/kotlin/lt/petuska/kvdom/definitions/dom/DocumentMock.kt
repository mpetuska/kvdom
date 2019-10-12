package lt.petuska.kvdom.definitions.dom

import lt.petuska.kvdom.definitions.dom.node.Document
import lt.petuska.kvdom.definitions.dom.node.Element
import lt.petuska.kvdom.definitions.dom.node.Text

interface DocumentMock : Document, NodeMock {
    override fun getElementById(id: String): Element? = object : ElementMock {}

    override fun createElement(tagName: String): Element = object : ElementMock {}

    override fun createTextNode(data: String): Text = object : TextMock {}
}