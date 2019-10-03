package lt.petuska.kvdom.jsexternal.stub

import lt.petuska.kvdom.jsexternal.DElement
import lt.petuska.kvdom.jsexternal.Document

interface DocumentMock : Document {
    override fun getElementById(elementID: String): DElement? = throw NotImplementedError()

    override fun createElement(tag: String): DElement = throw NotImplementedError()

    override fun createTextNode(text: String): DElement = throw NotImplementedError()
}