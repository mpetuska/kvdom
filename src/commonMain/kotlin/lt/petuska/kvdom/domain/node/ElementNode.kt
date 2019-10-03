package lt.petuska.kvdom.domain.node

data class ElementNode(
    override val tag: String,
    override val attributes: Map<String, String> = mapOf(),
    override val children: List<INode> = listOf()
) : IElementNode