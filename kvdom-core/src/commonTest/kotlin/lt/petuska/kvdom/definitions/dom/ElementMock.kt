package lt.petuska.kvdom.definitions.dom

import lt.petuska.kvdom.definitions.dom.node.Element

interface ElementMock : NodeMock, Element {
    override fun setAttribute(name: String, value: String) {}

    override fun removeAttribute(attrName: String) {}
}