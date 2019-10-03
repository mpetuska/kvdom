package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.domain.node.stub.NodeStub
import lt.petuska.kvdom.domain.node.stub.TextNodeStub
import lt.petuska.kvdom.jsexternal.Document
import lt.petuska.kvdom.jsexternal.IDNode
import lt.petuska.kvdom.jsexternal.stub.DNodeMock
import lt.petuska.kvdom.jsexternal.stub.DocumentMock
import kotlin.test.Test
import kotlin.test.assertEquals

class TextNodeTest {
    @Test
    fun diffExisting_NotTextNode() {
        val old = TextNode("")
        val newDNode = object : DNodeMock {}
        val new = object : NodeStub() {
            var renderCalls = 0
            override fun render(doc: Document): IDNode {
                renderCalls++
                return newDNode
            }
        }

        val patch = old.diff(new)

        val oldDNode = object : DNodeMock {
            var replaceWithCalls = 0
            override fun replaceWith(node: IDNode) {
                replaceWithCalls++
            }
        }
        assertEquals(newDNode, patch(oldDNode))
        assertEquals(1, new.renderCalls)
        assertEquals(1, oldDNode.replaceWithCalls)
    }

    @Test
    fun diffExisting_NotEquals() {
        val old = TextNode("")
        val newDNode = object : DNodeMock {}
        val new = object : TextNodeStub("new") {
            var renderCalls = 0
            override fun render(doc: Document): IDNode {
                renderCalls++
                return newDNode
            }
        }

        val patch = old.diff(new)

        val oldDNode = object : DNodeMock {
            var replaceWithCalls = 0
            override fun replaceWith(node: IDNode) {
                replaceWithCalls++
            }
        }
        assertEquals(newDNode, patch(oldDNode))
        assertEquals(1, new.renderCalls)
        assertEquals(1, oldDNode.replaceWithCalls)
    }

    @Test
    fun diffExisting_Equals() {
        val tNode = TextNode("old")

        val patch = tNode.diff(tNode)

        val oldDNode = object : DNodeMock {}
        assertEquals(oldDNode, patch(oldDNode))
    }

    @Test
    fun render() {
        val textNode = TextNodeStub()
        val expected = object : DNodeMock {}
        val stubDocument = object : DocumentMock {
            var createTextNodeCalls = 0
            override fun createTextNode(text: String): IDNode {
                createTextNodeCalls++
                return expected
            }
        }
        assertEquals(expected, textNode.render(stubDocument))
        assertEquals(expected, (textNode as INode).render(stubDocument))
        assertEquals(2, stubDocument.createTextNodeCalls)
    }
}