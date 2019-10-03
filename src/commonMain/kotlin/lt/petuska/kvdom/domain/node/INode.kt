package lt.petuska.kvdom.domain.node

import lt.petuska.kvdom.domain.Patch
import lt.petuska.kvdom.jsexternal.DNode
import lt.petuska.kvdom.jsexternal.Document
import lt.petuska.kvdom.jsexternal.document


interface INode {
    fun toHtml(): String
    fun render(doc: Document = document): DNode
    fun diffExisting(new: INode): Patch
    fun diff(new: INode?): Patch = when (new) {
        null -> { dNode: DNode ->
            dNode.remove().let { null }
        }
        else -> diffExisting(new)
    }
}

