package lt.petuska.kvdom.definitions.vdom

import lt.petuska.kvdom.definitions.dom.node.Document
import lt.petuska.kvdom.definitions.dom.node.Element


interface VElement : VNode {
    val tag: String
    val attributes: Map<String, String>
    val children: List<VNode>

    override fun render(document: Document): Element
}