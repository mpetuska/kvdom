package lt.petuska.kvdom.domain.node.stub

import lt.petuska.kvdom.definitions.dom.Document
import lt.petuska.kvdom.definitions.dom.Node
import lt.petuska.kvdom.domain.node.BaseNode

open class BaseNodeStub : BaseNode() {
    override fun render(document: Document): Node = throw NotImplementedError()
    override fun toHtml(): String = throw NotImplementedError()
}