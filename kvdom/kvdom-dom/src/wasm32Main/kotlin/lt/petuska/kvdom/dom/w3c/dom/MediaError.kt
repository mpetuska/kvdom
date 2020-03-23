package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [MediaError](https://developer.mozilla.org/en/docs/Web/API/MediaError) to Kotlin
 */
@NoWASM
actual abstract class MediaError {
  actual open val code: Short
    get() = TODO("Not yet implemented")
  
  actual companion object {
    actual val MEDIA_ERR_ABORTED: Short
      get() = TODO("Not yet implemented")
    actual val MEDIA_ERR_NETWORK: Short
      get() = TODO("Not yet implemented")
    actual val MEDIA_ERR_DECODE: Short
      get() = TODO("Not yet implemented")
    actual val MEDIA_ERR_SRC_NOT_SUPPORTED: Short
      get() = TODO("Not yet implemented")
  }
  
}