package lt.petuska.kvdom.jsexternal

import kotlinx.wasm.jsinterop.*

actual interface IDNode {
    val arena: Arena
    val index: Object
    actual fun remove()
    actual fun replaceWith(node: IDNode)
    actual val childNodes: Array<IDNode>
    actual fun setAttribute(qualifiedName: String, value: String)
    actual fun removeAttribute(key: String)
    actual fun appendChild(node: IDNode)
}

actual open class DNode(arena: Arena, index: Object) : JsValue(arena, index), IDNode {
    override fun remove() {
        dNode_remove(arena, index)
    }

    override fun replaceWith(node: IDNode) {
        dNode_replaceWith(arena, index, node.arena, node.index)
    }


    override fun appendChild(node: IDNode) {
        dElement_appendChild(
            arena, index,
            node.arena, node.index
        )
    }

    override fun setAttribute(qualifiedName: String, value: String) {
        dElement_setAttribute(
            arena, index,
            stringPointer(qualifiedName), stringLengthBytes(qualifiedName),
            stringPointer(value), stringLengthBytes(value)
        )
    }

    override fun removeAttribute(key: String) {
        dElement_removeAttribute(
            arena, index,
            stringPointer(key), stringLengthBytes(key)
        )
    }

    override val childNodes: Array<IDNode>
        get() = run {
            ArenaManager.currentArena = arena
            getProperty("childNodes").run {
                JsArray(this).let {
                    Array(it.size) { i ->
                        DNode(it[i].arena, it[i].index)
                    }
                }
            }
        }
}

@SymbolName("kvdom_DNode_replaceWith")
external fun dNode_replaceWith(
    arena: Arena,
    index: Object,
    newArena: Arena,
    newIndex: Object
)

@SymbolName("kvdom_DNode_remove")
external fun dNode_remove(
    arena: Arena,
    index: Int
)

@SymbolName("kvdom_DElement_setAttribute")
external fun dElement_setAttribute(
    arena: Arena,
    index: Object,
    attrPtr: Pointer,
    attrLen: Int,
    keyPtr: Pointer,
    keyLen: Int
)

@SymbolName("kvdom_DElement_removeAttribute")
external fun dElement_removeAttribute(
    arena: Arena,
    index: Object,
    attrPtr: Pointer,
    attrLen: Int
)

@SymbolName("kvdom_DElement_childNodes")
external fun dElement_childNodes(
    arena: Arena,
    index: Object
): Object

@SymbolName("kvdom_DElement_appendChild")
external fun dElement_appendChild(
    arena: Arena,
    index: Object,
    childArena: Arena,
    childIndex: Object
)