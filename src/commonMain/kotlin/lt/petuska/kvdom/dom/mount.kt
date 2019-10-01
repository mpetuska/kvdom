package lt.petuska.kvdom.dom

import lt.petuska.kvdom.jsexternal.DElement

fun DElement.mount(node: DElement) = node.also {
    replaceWith(node)
}