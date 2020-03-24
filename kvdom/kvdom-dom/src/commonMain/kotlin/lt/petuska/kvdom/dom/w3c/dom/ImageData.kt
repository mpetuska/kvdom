package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource
import lt.petuska.kvdom.dom.khronos.webgl.Uint8ClampedArray

/**
 * Exposes the JavaScript [ImageData](https://developer.mozilla.org/en/docs/Web/API/ImageData) to Kotlin
 */
@NoWASM
expect open class ImageData : ImageBitmapSource, TexImageSource {
  constructor(sw: Int, sh: Int)
  constructor(data: Uint8ClampedArray, sw: Int)
  constructor(data: Uint8ClampedArray, sw: Int, sh: Int)
  
  open val width: Int
  open val height: Int
  open val data: Uint8ClampedArray
}