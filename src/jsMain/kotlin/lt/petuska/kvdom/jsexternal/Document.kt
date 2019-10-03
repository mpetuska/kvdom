package lt.petuska.kvdom.jsexternal

actual external interface Document {
    actual fun getElementById(elementID: String): DElement?
    actual fun createElement(tag: String): DElement
    actual fun createTextNode(text: String): DElement
}

actual external val document: Document