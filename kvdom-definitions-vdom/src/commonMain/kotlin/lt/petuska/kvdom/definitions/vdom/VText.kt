package lt.petuska.kvdom.definitions.vdom

import lt.petuska.kvdom.definitions.dom.Document
import lt.petuska.kvdom.definitions.dom.Text

interface VText : VNode {
    val text: String
    override fun render(document: Document): Text
}