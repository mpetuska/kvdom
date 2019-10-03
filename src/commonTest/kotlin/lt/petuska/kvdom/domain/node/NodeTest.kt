package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.domain.Patch
import lt.petuska.kvdom.domain.node.stub.NodeStub
import lt.petuska.kvdom.jsexternal.stub.DNodeMock
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class NodeTest {
    @Test
    fun diff_NewNull() {
        val oldNode = object : NodeStub() {
            var diffExistingCalls = 0
            override fun diffExisting(new: INode): Patch {
                diffExistingCalls++
                return { dNode -> dNode }
            }
        }
        val dNode = object : DNodeMock {
            var removeCalls = 0
            override fun remove() {
                removeCalls++
            }
        }
        val patch = oldNode.diff(null)
        assertNull(patch(dNode))
        assertEquals(0, oldNode.diffExistingCalls)
        assertEquals(1, dNode.removeCalls)
    }

    @Test
    fun diff() {
        val oldNode = object : NodeStub() {
            var diffExistingCalls = 0
            override fun diffExisting(new: INode): Patch {
                diffExistingCalls++
                return { dNode -> dNode }
            }
        }
        val new = NodeStub()

        val dNode = object : DNodeMock {
            var removeCalls = 0
            override fun remove() {
                removeCalls++
            }
        }
        val patch = oldNode.diff(new)
        assertEquals(dNode, patch(dNode))
        assertEquals(1, oldNode.diffExistingCalls)
        assertEquals(0, dNode.removeCalls)
    }
}