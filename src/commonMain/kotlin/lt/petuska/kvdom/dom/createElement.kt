package lt.petuska.kvdom.dom

import lt.petuska.kvdom.domain.node.ElementNode
import lt.petuska.kvdom.domain.node.Node

fun createElement(
    tag: String,
    attributes: Map<String, String> = mapOf(),
    children: List<Node> = listOf()
): ElementNode =
    ElementNode(tag, attributes, children)