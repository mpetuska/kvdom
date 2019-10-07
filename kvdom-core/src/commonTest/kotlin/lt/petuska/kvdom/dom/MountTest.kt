package lt.petuska.kvdom.dom

import lt.petuska.kvdom.definitions.dom.ElementMock
import lt.petuska.kvdom.definitions.dom.Node
import kotlin.test.Test
import kotlin.test.assertEquals

class MountTest {
    @Test
    fun mount() {
        val dElementReceiver = object : ElementMock {
            var replaceWithCalls = 0
            override fun replaceWith(vararg nodes: Node) {
                replaceWithCalls++
            }
        }
        val dElementTarget = object : ElementMock {}
        val result = dElementReceiver.mount(dElementTarget)
        assertEquals(dElementTarget, result)
        assertEquals(1, dElementReceiver.replaceWithCalls)
    }
}