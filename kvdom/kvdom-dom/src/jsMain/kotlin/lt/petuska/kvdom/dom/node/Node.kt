package lt.petuska.kvdom.dom.node

import org.w3c.dom.Node as DOMNode

actual open external class Node

val Node.ref: DOMNode; get() = unsafeCast<DOMNode>()
