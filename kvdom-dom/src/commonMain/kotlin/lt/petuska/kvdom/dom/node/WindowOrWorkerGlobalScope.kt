package lt.petuska.kvdom.dom.node

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope
 */
expect interface WindowOrWorkerGlobalScope {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval
     */
    fun setInterval(func: () -> Unit, delay: Int): Int

    /**
     * expect fun setInterval(ms: Int, action: () -> Unit)
     */
    fun clearInterval(intervalId: Int)

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout
     */
    fun setTimeout(func: () -> Unit, delay: Int): Int

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/clearTimeout
     */
    fun clearTimeout(timeoutId: Int)
}

fun WindowOrWorkerGlobalScope.setInterval(delay: Int, func: () -> Unit) = setInterval(func, delay)
fun WindowOrWorkerGlobalScope.setTimeout(delay: Int, func: () -> Unit) = setTimeout(func, delay)