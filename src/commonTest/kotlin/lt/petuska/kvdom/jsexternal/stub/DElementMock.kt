package lt.petuska.kvdom.jsexternal.stub

import lt.petuska.kvdom.jsexternal.DElement
import lt.petuska.kvdom.jsexternal.DNode

interface DElementMock : DElement {
    override fun appendChild(node: DNode) = this

    override fun remove() {}

    override fun replaceWith(vararg nodes: DNode) {}

    override fun setAttribute(qualifiedName: String, value: String) {}

    override fun removeAttribute(key: String) {}

    override val childNodes: Array<DNode>
        get() = arrayOf()
}