package lt.petuska.kvdom.testutil

import lt.petuska.kvdom.domain.node.ElementNode
import lt.petuska.kvdom.domain.node.Node
import lt.petuska.kvdom.domain.node.TextNode

object ValueProvider {
    fun elementNode(
        tag: String = "h1",
        attributes: Map<String, String> = mapOf("id" to "best", "custom" to "really"),
        children: List<Node> = listOf(
            TextNode("So good"),
            ElementNode("div", attributes = mapOf("id" to "child"))
        )
    ) = ElementNode(tag, attributes, children)

    fun textNode(text: String = "So cool") = TextNode(text)
}