package lt.petuska.kvdom.core.node

import lt.petuska.kvdom.core.util.UUID
import lt.petuska.kvdom.dom.document
import lt.petuska.kvdom.dom.node.Text

open class VText internal constructor(uuid: Long = UUID.next(), node: Text? = null, var text: String) :
    VNode<Text>(uuid, node) {
    constructor(text: String) : this(UUID.next(), null, text)

    override fun copy(): VText =
        VText(uuid, `$node`, text)

    override fun toHtml(): String = text
    override fun render(): Text = document.createTextNode(text)

    override fun diff(): () -> Text? = if (text == (snapshot as VText).text) {
        { `$node` }
    } else {
        {
            render().also {
                `$node`?.replaceWith(it)
            }
        }
    }
}

fun VElement<*>.text(text: String) = VText(text).also { children.add(it) }