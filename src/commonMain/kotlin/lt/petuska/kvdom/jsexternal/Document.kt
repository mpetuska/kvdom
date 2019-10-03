package lt.petuska.kvdom.jsexternal

external interface Document {
    fun getElementById(elementID: String): IDNode?
    fun createElement(tag: String): IDNode
    fun createTextNode(text: String): IDNode
}

expect val document: Document