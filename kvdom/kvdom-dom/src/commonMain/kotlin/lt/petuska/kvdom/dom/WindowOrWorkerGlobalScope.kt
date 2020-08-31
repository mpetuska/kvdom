package lt.petuska.kvdom.dom

public expect interface WindowOrWorkerGlobalScope

public expect fun WindowOrWorkerGlobalScope.setTimeout(timeout: Int, handler: () -> Unit): Int

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
public expect fun WindowOrWorkerGlobalScope.clearTimeout(handle: Int)
public expect fun WindowOrWorkerGlobalScope.setInterval(timeout: Int, handler: () -> Unit): Int

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
public expect fun WindowOrWorkerGlobalScope.clearInterval(handle: Int)
