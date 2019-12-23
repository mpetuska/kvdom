package lt.petuska.kvdom.core.node

import lt.petuska.kvdom.core.util.UUID
import lt.petuska.kvdom.dom.document
import lt.petuska.kvdom.dom.node.Node
import lt.petuska.kvdom.dom.node.Text

open class VText internal constructor(uuid: Long = UUID.next(), node: Node? = null, var text: String) :
    VNode(uuid, node) {
    constructor(text: String) : this(UUID.next(), null, text)

    override fun copy(): VText =
        VText(uuid, `$node`, text)

    override fun toHtml(): String = text
    override fun render(): Text = document.createTextNode(text)

    override fun diff(): () -> Node? = if (text == (snapshot as VText).text) {
        { `$node` }
    } else {
        {
            render().also {
                `$node`?.replaceWith(it)
            }
        }
    }
}