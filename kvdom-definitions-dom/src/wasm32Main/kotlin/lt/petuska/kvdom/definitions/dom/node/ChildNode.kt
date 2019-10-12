package lt.petuska.kvdom.definitions.dom.node

import kotlinx.wasm.jsinterop.*

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/ChildNode
 */
actual interface ChildNode {
    val arena: Arena
    val index: Object
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/remove
     */
    actual fun remove()

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/replaceWith
     */
    actual fun replaceWith(vararg nodes: Node)
}

internal fun ChildNode.exRemove() {
    js_ChildNode_remove(arena, index)
}

internal fun ChildNode.exReplaceWith(vararg nodes: Node) {
    val tmpArenasArena = allocateArena()
    val tmpIndexesArena = allocateArena()
    nodes.forEach {
        pushIntToArena(tmpArenasArena, it.arena)
        pushIntToArena(tmpIndexesArena, it.index)
    }
    js_ChildNode_replaceWith(arena, index, tmpArenasArena, tmpIndexesArena)
    freeArena(tmpArenasArena)
    freeArena(tmpIndexesArena)
}

@SymbolName("kvdom_ChildNode_replaceWith")
private external fun js_ChildNode_replaceWith(
    arena: Arena,
    index: Object,
    arenasArena: Arena,
    indexesArena: Arena
)

@SymbolName("kvdom_ChildNode_remove")
private external fun js_ChildNode_remove(
    arena: Arena,
    index: Int
)