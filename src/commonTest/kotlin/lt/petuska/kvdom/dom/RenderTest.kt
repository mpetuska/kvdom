package lt.petuska.kvdom.dom

import lt.petuska.kvdom.domain.node.Node
import lt.petuska.kvdom.jsexternal.DElement
import lt.petuska.kvdom.jsexternal.DNode
import lt.petuska.kvdom.jsexternal.StubDElement
import lt.petuska.kvdom.jsexternal.StubDocument
import lt.petuska.kvdom.testutil.ValueProvider
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RenderTest {
    @Test
    fun renderTextNode() {
        val textNode = ValueProvider.textNode()
        val expected = object : StubDElement {

        }
        val stubDocument = object : StubDocument {
            var createTextNodeCalls = 0
            override fun createTextNode(text: String): DElement {
                createTextNodeCalls++
                return expected
            }
        }
        assertEquals(expected, textNode.render(stubDocument))
        assertEquals(expected, (textNode as Node).render(stubDocument))
        assertEquals(2, stubDocument.createTextNodeCalls)
    }

    @Test
    fun renderElementNode() {
        val elementNode = ValueProvider.elementNode()
        val expected = object : StubDElement {
            var setAttributeCalls = mutableMapOf<String, List<String>>()
            override fun setAttribute(qualifiedName: String, value: String) {
                val calls = setAttributeCalls[qualifiedName] ?: listOf()
                setAttributeCalls[qualifiedName] = calls + value
            }

            var appendChildCalls = 0
            override fun appendChild(node: DNode): StubDElement {
                appendChildCalls++
                return this
            }
        }
        val stubDocument = object : StubDocument {
            var createElementCount = 0
            override fun createElement(tag: String): DElement {
                createElementCount++
                return expected
            }
        }
        assertEquals(expected, elementNode.render(stubDocument))
        assertEquals(expected, (elementNode as Node).render(stubDocument))

        elementNode.attributes.forEach {
            assertTrue(expected.setAttributeCalls[it.key]?.contains(it.value) == true)
            assertEquals(2, expected.setAttributeCalls[it.key]?.size)
        }
        assertEquals(elementNode.children.size * 2, expected.appendChildCalls)
    }
}