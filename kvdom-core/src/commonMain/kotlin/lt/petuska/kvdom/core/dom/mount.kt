package lt.petuska.kvdom.core.dom

import lt.petuska.kvdom.dom.node.Element

fun Element.mount(node: Element) = node.also {
    replaceWith(node)
}