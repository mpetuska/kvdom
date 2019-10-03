package lt.petuska.kvdom.dom

import lt.petuska.kvdom.domain.node.ElementNode
import lt.petuska.kvdom.domain.node.IElementNode
import lt.petuska.kvdom.domain.node.INode

fun createElement(
    tag: String,
    attributes: Map<String, String> = mapOf(),
    children: List<INode> = listOf()
): IElementNode = ElementNode(tag, attributes, children)