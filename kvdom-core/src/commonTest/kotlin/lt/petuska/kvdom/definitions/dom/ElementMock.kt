package lt.petuska.kvdom.definitions.dom

interface ElementMock : NodeMock, Element {
    override fun setAttribute(name: String, value: String) {}

    override fun removeAttribute(attrName: String) {}
}