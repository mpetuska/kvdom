package lt.petuska.kvdom.dom

import lt.petuska.kvdom.domain.node.ElementNode
import lt.petuska.kvdom.domain.node.Node
import lt.petuska.kvdom.domain.node.TextNode
import lt.petuska.kvdom.jsexternal.DElement
import lt.petuska.kvdom.jsexternal.DNode
import lt.petuska.kvdom.jsexternal.Document
import lt.petuska.kvdom.jsexternal.document

fun Node.render(doc: Document = document): DNode = when (this) {
    is TextNode -> render(doc)
    is ElementNode -> render(doc)
}

fun TextNode.render(doc: Document = document): DNode = doc.createTextNode(text)

fun ElementNode.render(doc: Document = document): DElement = doc.createElement(tag).also { dElement ->
    attributes.forEach {
        dElement.setAttribute(it.key, it.value)
    }
    children.forEach {
        dElement.appendChild(it.render())
    }
}