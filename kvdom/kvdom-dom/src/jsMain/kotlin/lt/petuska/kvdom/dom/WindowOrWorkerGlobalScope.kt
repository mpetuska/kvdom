package lt.petuska.kvdom.dom

public actual typealias WindowOrWorkerGlobalScope = org.w3c.dom.WindowOrWorkerGlobalScope

public actual fun WindowOrWorkerGlobalScope.setTimeout(timeout: Int, handler: () -> Unit): Int = setTimeout(handler, timeout)

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
public actual fun WindowOrWorkerGlobalScope.clearTimeout(handle: Int): Unit = clearTimeout(handle)
public actual fun WindowOrWorkerGlobalScope.setInterval(timeout: Int, handler: () -> Unit): Int = setInterval(handler, timeout)

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
public actual fun WindowOrWorkerGlobalScope.clearInterval(handle: Int): Unit = clearInterval(handle)
