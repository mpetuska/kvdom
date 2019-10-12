package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.definitions.dom.DocumentMock
import lt.petuska.kvdom.definitions.dom.NodeMock
import lt.petuska.kvdom.definitions.dom.TextMock
import lt.petuska.kvdom.definitions.dom.node.Document
import lt.petuska.kvdom.definitions.dom.node.Node
import lt.petuska.kvdom.definitions.dom.node.Text
import lt.petuska.kvdom.domain.node.stub.TextNodeStub
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TextNodeTest {
    @Test
    fun toHtml() {
        val text = "I'm so pretty"
        val target = TextNode(text)

        assertEquals(text, target.toHtml())
    }

    @Test
    fun render() {
        val expected = object : TextMock {}
        val stubDocument = object : DocumentMock {
            var createData = mutableSetOf<String>()
            override fun createTextNode(data: String): Text {
                createData.add(data)
                return expected
            }
        }
        val text = "I'm so pretty"
        val target = TextNode(text)

        assertEquals(expected, target.render(stubDocument))
        assertTrue(stubDocument.createData.contains(text))
    }

    @Test
    fun diff_Equals() {
        val old = TextNode("so same")
        val new = TextNode("so same")
        val patch = old.diff(new)

        val dNodeMock = object : NodeMock {}
        assertEquals(dNodeMock, patch(dNodeMock))
    }

    @Test
    fun diff_NotEquals() {
        val expectedNewDNode = object : TextMock {}
        val old = TextNode("so same")
        val new = object : TextNodeStub("not so same") {
            override fun render(document: Document): Text {
                return expectedNewDNode
            }
        }
        val patch = old.diff(new)

        val dNodeMock = object : NodeMock {
            var replaceWithCalls = 0
            override fun replaceWith(vararg nodes: Node) {
                replaceWithCalls++
            }
        }
        assertEquals(expectedNewDNode, patch(dNodeMock))
        assertEquals(1, dNodeMock.replaceWithCalls)
    }
}