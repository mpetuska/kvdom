package lt.petuska.kvdom.jsexternal.stub

import lt.petuska.kvdom.jsexternal.IDNode

interface DNodeMock : IDNode {
    override fun appendChild(node: IDNode) {}

    override fun remove() {}

    override fun replaceWith(node: IDNode) {}

    override fun setAttribute(qualifiedName: String, value: String) {}

    override fun removeAttribute(key: String) {}

    override val childNodes: Array<IDNode>
        get() = arrayOf()
}