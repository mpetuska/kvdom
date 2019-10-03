package lt.petuska.kvdom.jsexternal

expect interface IDNode {
    fun remove()
    fun replaceWith(node: IDNode)

    val childNodes: Array<IDNode>

    fun setAttribute(qualifiedName: String, value: String)
    fun removeAttribute(key: String)
    fun appendChild(node: IDNode)
}

expect open class DNode : IDNode