package lt.petuska.kvdom.domain.node.stub

import lt.petuska.kvdom.domain.Patch
import lt.petuska.kvdom.domain.node.INode
import lt.petuska.kvdom.jsexternal.DNode
import lt.petuska.kvdom.jsexternal.Document

open class NodeStub : INode {
    override fun toHtml(): String = throw NotImplementedError()
    override fun render(doc: Document): DNode = throw NotImplementedError()
    override fun diffExisting(new: INode): Patch = throw NotImplementedError()
}