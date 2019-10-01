package lt.petuska.kvdom.dom

import lt.petuska.kvdom.jsexternal.DNode
import lt.petuska.kvdom.jsexternal.StubDElement
import kotlin.test.Test
import kotlin.test.assertEquals

class MountTest {
    @Test
    fun mount() {
        val dElementReceiver = object : StubDElement {
            var replaceWithCalls = 0
            override fun replaceWith(vararg nodes: DNode) {
                replaceWithCalls++
            }
        }
        val dElementTarget = object : StubDElement {}
        val result = dElementReceiver.mount(dElementTarget)
        assertEquals(dElementTarget, result)
        assertEquals(1, dElementReceiver.replaceWithCalls)
    }
}