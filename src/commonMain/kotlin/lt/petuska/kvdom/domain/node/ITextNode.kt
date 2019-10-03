package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.domain.Patch
import lt.petuska.kvdom.jsexternal.DNode
import lt.petuska.kvdom.jsexternal.Document

interface ITextNode : INode {
    val text: String
    override fun toHtml(): String = text
    override fun render(doc: Document): DNode = doc.createTextNode(text)
    override fun diffExisting(new: INode): Patch = when {
        this == new -> { dNode -> dNode }
        else -> { dNode ->
            new.render().also {
                dNode.replaceWith(it)
            }
        }
    }
}