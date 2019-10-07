package lt.petuska.kvdom.dom

import lt.petuska.kvdom.definitions.dom.Element

fun Element.mount(node: Element) = node.also {
    replaceWith(node)
}