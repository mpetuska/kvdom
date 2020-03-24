package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource
import lt.petuska.kvdom.dom.khronos.webgl.Uint8ClampedArray

/**
 * Exposes the JavaScript [ImageData](https://developer.mozilla.org/en/docs/Web/API/ImageData) to Kotlin
 */
actual open external class ImageData : ImageBitmapSource, TexImageSource {
  actual constructor(sw: Int, sh: Int)
  actual constructor(data: Uint8ClampedArray, sw: Int)
  actual constructor(data: Uint8ClampedArray, sw: Int, sh: Int)
  
  actual open val width: Int
  actual open val height: Int
  actual open val data: Uint8ClampedArray
}