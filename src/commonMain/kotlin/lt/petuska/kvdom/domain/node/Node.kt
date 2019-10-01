package lt.petuska.kvdom.domain.node

sealed class Node {
    abstract fun toHtml(): String
}

data class TextNode(val text: String) : Node() {
    override fun toHtml(): String = text
}

class ElementNode(
    val tag: String,
    val attributes: Map<String, String> = mapOf(),
    val children: List<Node> = listOf()
) : Node() {
    override fun toHtml(): String = StringBuilder().run {
        append("<$tag")
        attributes.forEach {
            append(" ${it.key}=\"${it.value}\"")
        }
        append(">")
        children.forEach {
            append(it.toHtml())
        }

        append("</$tag>")
        toString()
    }
}