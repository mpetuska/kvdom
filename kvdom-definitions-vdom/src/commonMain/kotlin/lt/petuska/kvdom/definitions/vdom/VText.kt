package lt.petuska.kvdom.definitions.vdom

import lt.petuska.kvdom.definitions.dom.node.Document
import lt.petuska.kvdom.definitions.dom.node.Text

interface VText : VNode {
    var text: String
    override fun render(document: Document): Text
    override fun copy(): VText
}