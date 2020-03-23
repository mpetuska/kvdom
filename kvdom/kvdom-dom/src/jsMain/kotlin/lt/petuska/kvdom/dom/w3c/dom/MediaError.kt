package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MediaError](https://developer.mozilla.org/en/docs/Web/API/MediaError) to Kotlin
 */
actual abstract external class MediaError {
  actual open val code: Short
  
  actual companion object {
    actual val MEDIA_ERR_ABORTED: Short
    actual val MEDIA_ERR_NETWORK: Short
    actual val MEDIA_ERR_DECODE: Short
    actual val MEDIA_ERR_SRC_NOT_SUPPORTED: Short
  }
}