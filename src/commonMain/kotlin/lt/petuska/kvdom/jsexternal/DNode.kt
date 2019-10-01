package lt.petuska.kvdom.jsexternal

external interface DNode {
    fun appendChild(node: DNode): DNode
    fun remove()
    fun replaceWith(vararg nodes: DNode)
    fun setAttribute(qualifiedName: String, value: String)
    fun removeAttribute(key: String)

    val childNodes: Array<DNode>
}