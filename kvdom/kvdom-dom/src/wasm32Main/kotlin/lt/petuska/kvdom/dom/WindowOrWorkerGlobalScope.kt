package lt.petuska.kvdom.dom

import kotlinx.wasm.jsinterop.*
import lt.petuska.kvdom.dom.WindowOrWorkerGlobalScope.Companion.setIntervalFunctions
import lt.petuska.kvdom.dom.WindowOrWorkerGlobalScope.Companion.setTimeoutFunctions
import kotlin.properties.*

public actual interface WindowOrWorkerGlobalScope {
  public companion object {
    // <IntervalId, Pointer>
    internal val setIntervalFunctions = mutableMapOf<Int, Pointer>()

    // <TimeoutId, Pointer>
    internal val setTimeoutFunctions = mutableMapOf<Int, Pointer>()
  }

  public val arena: Arena
  public val index: Object
}

public actual fun WindowOrWorkerGlobalScope.setTimeout(timeout: Int, handler: () -> Unit): Int {
  val funcPtr = wrapFunction {
    handler()
  }
  return js_setTimeout(arena, index, funcPtr, timeout).also {
    setTimeoutFunctions[it] = funcPtr
  }
}

public actual fun WindowOrWorkerGlobalScope.clearTimeout(handle: Int) {
  js_clearTimeout(arena, index, handle)
  setTimeoutFunctions.remove(handle)
}

public actual fun WindowOrWorkerGlobalScope.setInterval(timeout: Int, handler: () -> Unit): Int {
  var id by Delegates.notNull<Int>()
  val funcPtr = wrapFunction {
    handler()
    setIntervalFunctions.remove(id)
  }
  return js_setInterval(arena, index, funcPtr, timeout).also {
    setIntervalFunctions[it] = funcPtr
    id = it
  }
}

public actual fun WindowOrWorkerGlobalScope.clearInterval(handle: Int) {
  js_clearInterval(arena, index, handle)
  setIntervalFunctions.remove(handle)
}

@SymbolName("kvdom_WindowOrWorkerGlobalScope_setInterval")
private external fun js_setInterval(
  arena: Arena,
  index: Object,
  funcPtr: Pointer,
  delay: Int
): Int

@SymbolName("kvdom_WindowOrWorkerGlobalScope_clearInterval")
private external fun js_clearInterval(
  arena: Arena,
  index: Object,
  intervalId: Int
)

@SymbolName("kvdom_WindowOrWorkerGlobalScope_setTimeout")
private external fun js_setTimeout(
  arena: Arena,
  index: Object,
  funcPtr: Pointer,
  delay: Int
): Int

@SymbolName("kvdom_WindowOrWorkerGlobalScope_clearTimeout")
private external fun js_clearTimeout(
  arena: Arena,
  index: Object,
  timeoutId: Int
)
