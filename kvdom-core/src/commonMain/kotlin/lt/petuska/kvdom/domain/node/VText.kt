package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.dom.node.Document
import lt.petuska.kvdom.dom.node.Text

data class VText(var text: String) : VNode() {
    override fun copy(): VText = VText(text)

    override fun toHtml(): String = text
    override fun render(document: Document): Text = document.createTextNode(text)

    fun diff(new: VText): Patch = if (new.text == this.text) {
        passivePatch
    } else {
        new.render().replacePatch
    }
}