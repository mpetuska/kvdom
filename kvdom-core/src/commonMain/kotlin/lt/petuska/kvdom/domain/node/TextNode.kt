package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.definitions.dom.Document
import lt.petuska.kvdom.definitions.dom.Text
import lt.petuska.kvdom.definitions.vdom.Patch
import lt.petuska.kvdom.definitions.vdom.VText

data class TextNode(override val text: String) : BaseNode(), VText {
    override fun toHtml(): String = text
    override fun render(document: Document): Text = document.createTextNode(text)

    fun diff(new: VText): Patch = if (new.text == this.text)
        passivePatch
    else new.render().replacePatch
}