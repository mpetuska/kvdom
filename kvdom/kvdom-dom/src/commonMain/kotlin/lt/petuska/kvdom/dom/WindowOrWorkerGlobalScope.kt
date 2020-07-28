package lt.petuska.kvdom.dom

expect interface WindowOrWorkerGlobalScope

expect fun WindowOrWorkerGlobalScope.setTimeout(timeout: Int, handler: () -> Unit): Int

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
expect fun WindowOrWorkerGlobalScope.clearTimeout(handle: Int)
expect fun WindowOrWorkerGlobalScope.setInterval(timeout: Int, handler: () -> Unit): Int

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
expect fun WindowOrWorkerGlobalScope.clearInterval(handle: Int)
