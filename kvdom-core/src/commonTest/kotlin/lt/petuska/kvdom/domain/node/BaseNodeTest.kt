package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.definitions.dom.*
import lt.petuska.kvdom.domain.node.stub.BaseNodeStub
import lt.petuska.kvdom.domain.node.stub.ElementNodeStub
import lt.petuska.kvdom.domain.node.stub.TextNodeStub
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class BaseNodeTest {
    @Test
    fun diff_NewNull() {
        val old = object : BaseNodeStub() {}
        val patch = old.diff(null)

        val dNodeMock = object : NodeMock {
            var removeCalls = 0
            override fun remove() {
                removeCalls++
            }
        }
        assertNull(patch(dNodeMock))
        assertEquals(1, dNodeMock.removeCalls)
    }

    @Test
    fun diff_VText_to_VElement() {
        val expectedNewDNode = object : ElementMock {}
        val old = object : TextNodeStub() {}
        val new = object : ElementNodeStub() {
            override fun render(document: Document): Element {
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

    @Test
    fun diff_VElement_to_VText() {
        val expectedNewDNode = object : TextMock {}
        val old = object : ElementNodeStub() {}
        val new = object : TextNodeStub() {
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