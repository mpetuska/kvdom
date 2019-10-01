package lt.petuska.kvdom.jsexternal

interface StubDocument : Document {
    override fun getElementById(elementID: String): DElement? = throw NotImplementedError()

    override fun createElement(tag: String): DElement = throw NotImplementedError()

    override fun createTextNode(text: String): DElement = throw NotImplementedError()
}