package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.domain.Patch
import lt.petuska.kvdom.domain.node.stub.ElementNodeStub
import lt.petuska.kvdom.domain.node.stub.NodeStub
import lt.petuska.kvdom.domain.node.stub.TextNodeStub
import lt.petuska.kvdom.jsexternal.DElement
import lt.petuska.kvdom.jsexternal.DNode
import lt.petuska.kvdom.jsexternal.Document
import lt.petuska.kvdom.jsexternal.stub.DElementMock
import lt.petuska.kvdom.jsexternal.stub.DNodeMock
import lt.petuska.kvdom.jsexternal.stub.DocumentMock
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ElementNodeTest {
    @Test
    fun toHtml() {
        val elementNode =
            ElementNode("div", mapOf("id" to "1", "custom" to "really"), listOf(TextNode("text"), ElementNode("p")))
        val expected = """<div id="1" custom="really">text<p></p></div>"""
        val html = elementNode.toHtml()
        assertEquals(expected, html)
    }

    @Test
    fun render() {
        val elementNode = ElementNodeStub()
        val expected = object : DElementMock {
            var setAttributeCalls = mutableMapOf<String, List<String>>()
            override fun setAttribute(qualifiedName: String, value: String) {
                val calls = setAttributeCalls[qualifiedName] ?: listOf()
                setAttributeCalls[qualifiedName] = calls + value
            }

            var appendChildCalls = 0
            override fun appendChild(node: DNode): DElementMock {
                appendChildCalls++
                return this
            }
        }
        val stubDocument = object : DocumentMock {
            var createElementCount = 0
            override fun createElement(tag: String): DElement {
                createElementCount++
                return expected
            }
        }
        assertEquals(expected, elementNode.render(stubDocument))
        assertEquals(expected, (elementNode as INode).render(stubDocument))

        elementNode.attributes.forEach {
            assertTrue(expected.setAttributeCalls[it.key]?.contains(it.value) == true)
            assertEquals(2, expected.setAttributeCalls[it.key]?.size)
        }
        assertEquals(elementNode.children.size * 2, expected.appendChildCalls)
    }

    @Test
    fun diffExisting_ElementNodeWithSameTag() {
        val old = object : ElementNodeStub("div") {
            var diffAttributesCalls = 0
            override fun diffAttributes(new: IElementNode): Patch {
                diffAttributesCalls++
                return { dNode ->
                    dNode
                }
            }

            var diffChildrenCalls = 0
            override fun diffChildren(new: IElementNode): Patch {
                diffChildrenCalls++
                return { dNode ->
                    dNode
                }
            }
        }
        val new = ElementNodeStub("div")

        val patch = old.diffExisting(new)
        val dNode = object : DNodeMock {}
        assertEquals(dNode, patch(dNode))
        assertEquals(1, old.diffAttributesCalls)
        assertEquals(1, old.diffChildrenCalls)
    }

    @Test
    fun diffExisting_NotElementNode() {
        val old = ElementNode("div")
        val newDNode = object : DNodeMock {}
        val new = object : NodeStub() {
            var renderCalls = 0
            override fun render(doc: Document): DNode {
                renderCalls++
                return newDNode
            }
        }

        val patch = old.diff(new)

        val oldDNode = object : DNodeMock {
            var replaceWithCalls = 0
            override fun replaceWith(vararg nodes: DNode) {
                replaceWithCalls++
            }
        }
        assertEquals(newDNode, patch(oldDNode))
        assertEquals(1, new.renderCalls)
        assertEquals(1, oldDNode.replaceWithCalls)
    }

    @Test
    fun diffExisting_DifferentTag() {
        val old = ElementNode("div")
        val newDNode = object : DElementMock {}
        val new = object : ElementNodeStub("h1") {
            var renderCalls = 0
            override fun render(doc: Document): DElement {
                renderCalls++
                return newDNode
            }
        }

        val patch = old.diff(new)

        val oldDNode = object : DNodeMock {
            var replaceWithCalls = 0
            override fun replaceWith(vararg nodes: DNode) {
                replaceWithCalls++
            }
        }
        assertEquals(newDNode, patch(oldDNode))
        assertEquals(1, new.renderCalls)
        assertEquals(1, oldDNode.replaceWithCalls)
    }

    @Test
    fun diffAttributes() {
        val removedKey = "second"
        val attributes = mapOf(
            "id" to "1",
            "first" to "f",
            removedKey to "s"
        )
        val old = ElementNode(tag = "div", attributes = attributes)
        val new = ElementNode(tag = "div", attributes = attributes.filter { it.key != removedKey })

        val patch = old.diffAttributes(new)
        val dNode = object : DNodeMock {
            val attrs = old.attributes.toMutableMap()
            override fun setAttribute(qualifiedName: String, value: String) {
                attrs[qualifiedName] = value
            }

            override fun removeAttribute(key: String) {
                attrs.remove(key)
            }
        }
        assertEquals(dNode, patch(dNode))
        new.attributes.forEach {
            assertEquals(it.value, dNode.attrs[it.key])
        }
        assertFalse(dNode.attrs.containsKey(removedKey))
    }

    @Test
    fun diffChildren() {
        val c1 = object : TextNodeStub("first") {
            var diffCalls = 0
            override fun diff(new: INode?): Patch {
                diffCalls++
                return { dNode -> dNode }
            }
        }
        val c2 = object : ElementNodeStub("p") {
            var diffCalls = 0
            override fun diff(new: INode?): Patch {
                diffCalls++
                return { dNode -> dNode }
            }
        }
        val children = listOf(
            c1,
            c2,
            TextNode("removedText"),
            ElementNode("img")
        )
        val old = ElementNode(tag = "div", children = listOf(c1, c2))
        val new = ElementNode(
            tag = "div",
            children = listOf(
                c1,
                c2,
                object : TextNodeStub("removedText") {
                    override fun render(doc: Document): DNode {
                        return object : DNodeMock {}
                    }
                },
                object : ElementNodeStub("img") {
                    override fun render(doc: Document): DElement {
                        return object : DElementMock {}
                    }
                }
            )
        )

        val patch = old.diffChildren(new)
        val dNode = object : DNodeMock {
            var newChildrenCount = 0
            override fun appendChild(node: DNode): DNodeMock {
                newChildrenCount++
                return super.appendChild(node)
            }
        }
        assertEquals(dNode, patch(dNode))
        assertEquals(1, c1.diffCalls)
        assertEquals(1, c2.diffCalls)
        assertEquals(2, dNode.newChildrenCount)
    }
}