package lt.petuska.kvdom.dom.node

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import kotlinx.wasm.jsinterop.Pointer
import kotlinx.wasm.jsinterop.wrapFunction
import lt.petuska.kvdom.dom.node.WindowOrWorkerGlobalScope.Companion.setIntervalFunctions
import lt.petuska.kvdom.dom.node.WindowOrWorkerGlobalScope.Companion.setTimeoutFunctions
import kotlin.properties.Delegates

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope
 */
actual interface WindowOrWorkerGlobalScope {
    companion object {
        // <IntervalId, Pointer>
        internal val setIntervalFunctions = mutableMapOf<Int, Int>()
        // <TimeoutId, Pointer>
        internal val setTimeoutFunctions = mutableMapOf<Int, Int>()
    }

    val arena: Arena
    val index: Object
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval
     */
    actual fun setInterval(func: () -> Unit, delay: Int): Int

    /**
     * expect fun setInterval(ms: Int, action: () -> Unit)
     */
    actual fun clearInterval(intervalId: Int)

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout
     */
    actual fun setTimeout(func: () -> Unit, delay: Int): Int

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/clearTimeout
     */
    actual fun clearTimeout(timeoutId: Int)
}

internal fun WindowOrWorkerGlobalScope.exSetInterval(func: () -> Unit, delay: Int): Int {
    var id by Delegates.notNull<Int>()
    val funcPtr = wrapFunction {
        func()
        setIntervalFunctions.remove(id)
    }
    return js_WindowOrWorkerGlobalScope_setInterval(arena, index, funcPtr, delay).also {
        setIntervalFunctions[it] = funcPtr
        id = it
    }
}

internal fun WindowOrWorkerGlobalScope.exClearInterval(intervalId: Int) {
    js_WindowOrWorkerGlobalScope_clearInterval(arena, index, intervalId)
    setIntervalFunctions.remove(intervalId)
}

internal fun WindowOrWorkerGlobalScope.exSetTimeout(func: () -> Unit, delay: Int): Int {
    val funcPtr = wrapFunction {
        func()
    }
    return js_WindowOrWorkerGlobalScope_setTimeout(arena, index, funcPtr, delay).also {
        setTimeoutFunctions[it] = funcPtr
    }
}

internal fun WindowOrWorkerGlobalScope.exClearTimeout(timeoutId: Int) {
    js_WindowOrWorkerGlobalScope_clearTimeout(arena, index, timeoutId)
    setTimeoutFunctions.remove(timeoutId)
}

@SymbolName("kvdom_WindowOrWorkerGlobalScope_setInterval")
private external fun js_WindowOrWorkerGlobalScope_setInterval(
    arena: Arena,
    index: Object,
    funcPtr: Pointer,
    delay: Int
): Int

@SymbolName("kvdom_WindowOrWorkerGlobalScope_clearInterval")
private external fun js_WindowOrWorkerGlobalScope_clearInterval(
    arena: Arena,
    index: Object,
    intervalId: Int
)

@SymbolName("kvdom_WindowOrWorkerGlobalScope_setTimeout")
private external fun js_WindowOrWorkerGlobalScope_setTimeout(
    arena: Arena,
    index: Object,
    funcPtr: Pointer,
    delay: Int
): Int

@SymbolName("kvdom_WindowOrWorkerGlobalScope_clearTimeout")
private external fun js_WindowOrWorkerGlobalScope_clearTimeout(
    arena: Arena,
    index: Object,
    timeoutId: Int
)