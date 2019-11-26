package lt.petuska.kvdom.dom.node

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import lt.petuska.kvdom.dom.event.EventTarget
import lt.petuska.kvdom.dom.util.getObjProperty

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Window
 */
actual class Window(arena: Arena, index: Object) : EventTarget(arena, index), WindowOrWorkerGlobalScope {
    override fun setInterval(func: () -> Unit, delay: Int) = exSetInterval(func, delay)
    override fun clearInterval(intervalId: Int) = exClearInterval(intervalId)
    override fun setTimeout(func: () -> Unit, delay: Int) = exSetTimeout(func, delay)
    override fun clearTimeout(timeoutId: Int) = exClearTimeout(timeoutId)
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Window/document
     */
    actual val document: Document
        get() = getObjProperty("document").let {
            Document(it.arena, it.index)
        }
}