package lt.petuska.kvdom.dom

import lt.petuska.kvdom.jsexternal.IDNode
import lt.petuska.kvdom.jsexternal.stub.DNodeMock
import kotlin.test.Test
import kotlin.test.assertEquals

class MountTest {
    @Test
    fun mount() {
        val dElementReceiver = object : DNodeMock {
            var replaceWithCalls = 0
            override fun replaceWith(node: IDNode) {
                replaceWithCalls++
            }
        }
        val dElementTarget = object : DNodeMock {}
        val result = dElementReceiver.mount(dElementTarget)
        assertEquals(dElementTarget, result)
        assertEquals(1, dElementReceiver.replaceWithCalls)
    }
}