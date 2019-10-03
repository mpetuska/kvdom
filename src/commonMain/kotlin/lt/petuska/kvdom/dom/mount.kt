package lt.petuska.kvdom.dom

import lt.petuska.kvdom.jsexternal.IDNode

fun IDNode.mount(node: IDNode) = node.also {
    replaceWith(node)
}