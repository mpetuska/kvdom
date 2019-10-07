package lt.petuska.kvdom.definitions.vdom

import lt.petuska.kvdom.definitions.dom.Document
import lt.petuska.kvdom.definitions.dom.Node

typealias Patch = (node: Node) -> Node?

interface VNode {
    fun toHtml(): String
    fun render(document: Document = lt.petuska.kvdom.definitions.dom.document): Node
    fun diff(new: VNode?): Patch
}

