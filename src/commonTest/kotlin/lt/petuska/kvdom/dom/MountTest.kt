package lt.petuska.kvdom.dom

import lt.petuska.kvdom.jsexternal.DNode
import lt.petuska.kvdom.jsexternal.stub.DElementMock
import kotlin.test.Test
import kotlin.test.assertEquals

class MountTest {
    @Test
    fun mount() {
        val dElementReceiver = object : DElementMock {
            var replaceWithCalls = 0
            override fun replaceWith(vararg nodes: DNode) {
                replaceWithCalls++
            }
        }
        val dElementTarget = object : DElementMock {}
        val result = dElementReceiver.mount(dElementTarget)
        assertEquals(dElementTarget, result)
        assertEquals(1, dElementReceiver.replaceWithCalls)
    }
}