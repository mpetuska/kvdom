package lt.petuska.kvdom.domain.node.stub

import lt.petuska.kvdom.definitions.vdom.VText
import lt.petuska.kvdom.domain.node.TextNode

open class TextNodeStub(override val text: String = "Stubbed Text") : VText by TextNode(text)