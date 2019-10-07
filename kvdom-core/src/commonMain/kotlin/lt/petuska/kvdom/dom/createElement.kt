package lt.petuska.kvdom.dom

import lt.petuska.kvdom.definitions.vdom.VNode
import lt.petuska.kvdom.domain.node.ElementNode

fun createElement(
    tag: String,
    attributes: Map<String, String> = mapOf(),
    children: List<VNode> = listOf()
): ElementNode = ElementNode(tag, attributes, children)