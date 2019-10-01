package lt.petuska.kvdom.jsexternal

interface Document {
    fun getElementById(elementID: String): DElement?
    fun createElement(tag: String): DElement
    fun createTextNode(text: String): DElement
}

expect val document: Document