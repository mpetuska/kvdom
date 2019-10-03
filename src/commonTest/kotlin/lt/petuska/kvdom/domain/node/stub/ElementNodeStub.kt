package lt.petuska.kvdom.domain.node.stub

import lt.petuska.kvdom.domain.node.ElementNode
import lt.petuska.kvdom.domain.node.IElementNode
import lt.petuska.kvdom.domain.node.INode
import lt.petuska.kvdom.domain.node.TextNode

open class ElementNodeStub(
    override val tag: String = "div",
    override val attributes: Map<String, String> = mapOf("id" to "best", "custom" to "really"),
    override val children: List<INode> = listOf(
        TextNode("So good"),
        ElementNode("div", attributes = mapOf("id" to "child"))
    )
) : IElementNode