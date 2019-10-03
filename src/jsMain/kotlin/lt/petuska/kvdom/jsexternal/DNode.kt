package lt.petuska.kvdom.jsexternal

actual open external class DNode : IDNode {
    override fun remove()

    override fun replaceWith(node: IDNode)

    override val childNodes: Array<IDNode>

    override fun setAttribute(qualifiedName: String, value: String)

    override fun removeAttribute(key: String)

    override fun appendChild(node: IDNode)
}

actual external interface IDNode {
    actual fun remove()
    actual fun replaceWith(node: IDNode)
    actual val childNodes: Array<IDNode>
    actual fun setAttribute(qualifiedName: String, value: String)
    actual fun removeAttribute(key: String)
    actual fun appendChild(node: IDNode)

}