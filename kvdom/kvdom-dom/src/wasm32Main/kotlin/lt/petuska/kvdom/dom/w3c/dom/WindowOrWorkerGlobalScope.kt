package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.fetch.Promise
import lt.petuska.kvdom.dom.w3c.fetch.RequestInit
import lt.petuska.kvdom.dom.w3c.fetch.Response
import lt.petuska.kvdom.dom.w3c.workers.CacheStorage

/**
 * Exposes the JavaScript [WindowOrWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WindowOrWorkerGlobalScope) to Kotlin
 */
actual interface WindowOrWorkerGlobalScope {
  actual val origin: String
  actual val caches: CacheStorage
  actual fun btoa(data: String): String
  actual fun atob(data: String): String
  actual fun setTimeout(handler: Any, timeout: Int, vararg arguments: Any?): Int
  actual fun clearTimeout(handle: Int)
  actual fun setInterval(handler: Any, timeout: Int, vararg arguments: Any?): Int
  actual fun clearInterval(handle: Int)
  actual fun createImageBitmap(
    image: ImageBitmapSource,
    options: ImageBitmapOptions
  ): Promise<ImageBitmap>
  
  actual fun createImageBitmap(
    image: ImageBitmapSource,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions
  ): Promise<ImageBitmap>
  
  actual fun fetch(
    input: Any,
    init: RequestInit
  ): Promise<Response>
}