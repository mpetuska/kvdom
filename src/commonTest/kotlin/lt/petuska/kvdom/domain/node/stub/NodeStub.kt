package lt.petuska.kvdom.domain.node.stub

import lt.petuska.kvdom.domain.Patch
import lt.petuska.kvdom.domain.node.INode
import lt.petuska.kvdom.jsexternal.Document
import lt.petuska.kvdom.jsexternal.IDNode

open class NodeStub : INode {
    override fun toHtml(): String = throw NotImplementedError()
    override fun render(doc: Document): IDNode = throw NotImplementedError()
    override fun diffExisting(new: INode): Patch = throw NotImplementedError()
}