package lt.petuska.kvdom.dom.node

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope
 */
actual external interface WindowOrWorkerGlobalScope {
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