package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource

/**
 * Exposes the JavaScript [ImageBitmap](https://developer.mozilla.org/en/docs/Web/API/ImageBitmap) to Kotlin
 */
expect abstract class ImageBitmap() : CanvasImageSource, TexImageSource {
  open val width: Int
  open val height: Int
  fun close()
}