package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.definitions.dom.*
import lt.petuska.kvdom.definitions.vdom.VNode
import lt.petuska.kvdom.domain.node.stub.ElementNodeStub
import lt.petuska.kvdom.domain.node.stub.TextNodeStub
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ElementNodeTest {
    @Test
    fun toHtml() {
        val elementNode = ElementNode(
            tag = "div",
            attributes = mapOf("id" to "1", "custom" to "really"),
            children = listOf(
                TextNode("text"),
                ElementNode("p")
            )
        )
        val expected = """<div id="1" custom="really">text<p></p></div>"""
        assertEquals(expected, elementNode.toHtml())
    }

    @Test
    fun render() {
        val children = List(2) {
            object : TextNodeStub() {
                override fun render(document: Document): Text {
                    return object : TextMock {}
                }
            }
        }
        val elementNode = ElementNodeStub(children = children)
        val expected = object : ElementMock {
            var setAttributeCalls = mutableMapOf<String, List<String>>()
            override fun setAttribute(name: String, value: String) {
                val calls = setAttributeCalls[name] ?: listOf()
                setAttributeCalls[name] = calls + value
            }

            var appendChildCalls = 0
            override fun appendChild(node: Node) {
                appendChildCalls++
            }
        }
        val stubDocument = object : DocumentMock {
            var createElementCount = 0
            override fun createElement(tagName: String): Element {
                createElementCount++
                return expected
            }
        }
        assertEquals(expected, elementNode.render(stubDocument))
        assertEquals(expected, (elementNode as VNode).render(stubDocument))

        elementNode.attributes.forEach {
            assertTrue(expected.setAttributeCalls[it.key]?.contains(it.value) == true)
            assertEquals(2, expected.setAttributeCalls[it.key]?.size)
        }
        assertEquals(elementNode.children.size * 2, expected.appendChildCalls)
    }

    @Test
    fun diff_DifferentTags() {
        val expectedNewDNode = object : ElementMock {}
        val old = ElementNode("div")
        val new = object : ElementNodeStub("h1") {
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
    fun diff() {
        val expectedNewDNode = object : ElementMock {}
        val old = object : ElementNodeStub() {}
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
        //TODO assertions
    }
}