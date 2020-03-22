package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MediaError](https://developer.mozilla.org/en/docs/Web/API/MediaError) to Kotlin
 */
expect abstract class MediaError() {
  open val code: Short
  
  companion object {
    val MEDIA_ERR_ABORTED: Short
    val MEDIA_ERR_NETWORK: Short
    val MEDIA_ERR_DECODE: Short
    val MEDIA_ERR_SRC_NOT_SUPPORTED: Short
  }
}