package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.domain.Patch
import lt.petuska.kvdom.jsexternal.Document
import lt.petuska.kvdom.jsexternal.IDNode

interface ITextNode : INode {
    val text: String
    override fun toHtml(): String = text
    override fun render(doc: Document): IDNode = doc.createTextNode(text)
    override fun diffExisting(new: INode): Patch = when (new) {
        this -> { dNode -> dNode }
        else -> { dNode ->
            new.render().also {
                dNode.replaceWith(it)
            }
        }
    }
}