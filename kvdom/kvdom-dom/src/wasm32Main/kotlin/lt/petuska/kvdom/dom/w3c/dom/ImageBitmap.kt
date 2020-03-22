package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource

/**
 * Exposes the JavaScript [ImageBitmap](https://developer.mozilla.org/en/docs/Web/API/ImageBitmap) to Kotlin
 */
actual abstract class ImageBitmap actual constructor() : CanvasImageSource, TexImageSource {
  actual open val width: Int
    get() = TODO("Not yet implemented")
  actual open val height: Int
    get() = TODO("Not yet implemented")
  
  actual fun close() {
  }
}