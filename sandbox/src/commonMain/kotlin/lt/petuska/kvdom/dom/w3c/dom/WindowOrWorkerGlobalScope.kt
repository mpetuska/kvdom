package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.fetch.Promise
import lt.petuska.kvdom.dom.w3c.fetch.RequestInit
import lt.petuska.kvdom.dom.w3c.fetch.Response
import lt.petuska.kvdom.dom.w3c.workers.CacheStorage

/**
 * Exposes the JavaScript [WindowOrWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WindowOrWorkerGlobalScope) to Kotlin
 */
expect interface WindowOrWorkerGlobalScope {
  val origin: String
  val caches: CacheStorage
  fun btoa(data: String): String
  fun atob(data: String): String
  fun setTimeout(handler: Dynamic, timeout: Int = 0, vararg arguments: Any?): Int
  fun clearTimeout(handle: Int)
  fun setInterval(handler: Dynamic, timeout: Int, vararg arguments: Any?): Int
  fun clearInterval(handle: Int)
  
  @NoWASM
  fun createImageBitmap(
    image: ImageBitmapSource,
    options: ImageBitmapOptions = ImageBitmapOptions()
  ): Promise<ImageBitmap>
  
  @NoWASM
  fun createImageBitmap(
    image: ImageBitmapSource,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions = ImageBitmapOptions()
  ): Promise<ImageBitmap>
  
  @NoWASM
  fun fetch(input: Dynamic, init: RequestInit = RequestInit()): Promise<Response>
}