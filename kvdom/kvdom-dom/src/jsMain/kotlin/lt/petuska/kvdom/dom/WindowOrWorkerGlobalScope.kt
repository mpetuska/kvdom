package lt.petuska.kvdom.dom

actual typealias WindowOrWorkerGlobalScope = org.w3c.dom.WindowOrWorkerGlobalScope

actual fun WindowOrWorkerGlobalScope.setTimeout(timeout: Int, handler: () -> Unit): Int = setTimeout(handler, timeout)

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
actual fun WindowOrWorkerGlobalScope.clearTimeout(handle: Int) = clearTimeout(handle)
actual fun WindowOrWorkerGlobalScope.setInterval(timeout: Int, handler: () -> Unit): Int = setInterval(handler, timeout)

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
actual fun WindowOrWorkerGlobalScope.clearInterval(handle: Int) = clearInterval(handle)
