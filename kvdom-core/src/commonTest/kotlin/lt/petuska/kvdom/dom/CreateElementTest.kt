package lt.petuska.kvdom.dom

import lt.petuska.kvdom.domain.node.ElementNode
import lt.petuska.kvdom.domain.node.stub.ElementNodeStub
import kotlin.test.Test
import kotlin.test.assertEquals

class CreateElementTest {
    @Test
    fun fullInput() {
        val expected = ElementNodeStub()
        val result = createElement(expected.tag, expected.attributes, expected.children)

        assertEquals(expected.toHtml(), result.toHtml())
    }

    @Test
    fun minimalInput() {
        val tag = "img"
        val expected = ElementNode(tag)
        val result = createElement(tag)

        assertEquals(expected.toHtml(), result.toHtml())
    }
}