package lt.petuska.kvdom.definitions.dom.node

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.JsArray
import kotlinx.wasm.jsinterop.Object
import lt.petuska.kvdom.definitions.dom.event.EventTarget
import lt.petuska.kvdom.definitions.dom.event.EventTargetImpl


actual interface Node : EventTarget, ChildNode {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Node/appendChild
     */
    actual fun appendChild(node: Node)

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Node/childNodes
     */
    actual val childNodes: Array<Node>
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Node/nodeType
     */
    actual val nodeType: Int
}

actual open class NodeImpl(arena: Arena, index: Object) : EventTargetImpl(arena, index), Node {
    override fun remove() = exRemove()
    override fun replaceWith(vararg nodes: Node) = exReplaceWith(*nodes)

    override fun appendChild(node: Node) {
        dElement_appendChild(
            arena, index,
            node.arena, node.index
        )
    }

    override val childNodes: Array<Node>
        get() = run {
            getObjProperty("childNodes").run {
                JsArray(this).let {
                    Array(it.size) { i ->
                        val node = NodeImpl(it[i].arena, it[i].index)
                        when (NodeType.valueOf(node.nodeType)) {
                            NodeType.ELEMENT_NODE -> ElementImpl(
                                node.arena,
                                node.index
                            )
                            NodeType.TEXT_NODE -> TextImpl(node.arena, node.index)
                            else -> node
                        }
                    }
                }
            }
        }

    override val nodeType: Int
        get() = run {
            getIntProperty("nodeType")
        }
}

@SymbolName("kvdom_Node_appendChild")
private external fun dElement_appendChild(
    arena: Arena,
    index: Object,
    childArena: Arena,
    childIndex: Object
)