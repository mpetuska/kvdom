package lt.petuska.kvdom.jsexternal.stub

import lt.petuska.kvdom.jsexternal.Document
import lt.petuska.kvdom.jsexternal.IDNode

interface DocumentMock : Document {
    override fun getElementById(elementID: String): IDNode? = throw NotImplementedError()

    override fun createElement(tag: String): IDNode = throw NotImplementedError()

    override fun createTextNode(text: String): IDNode = throw NotImplementedError()
}