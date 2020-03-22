package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.TexImageSource
import lt.petuska.kvdom.dom.khronos.webgl.Uint8ClampedArray

/**
 * Exposes the JavaScript [ImageData](https://developer.mozilla.org/en/docs/Web/API/ImageData) to Kotlin
 */
actual open class ImageData actual constructor() : ImageBitmapSource, TexImageSource {
  actual constructor(sw: Int, sh: Int) : this() {
    TODO("Not yet implemented")
  }
  
  actual constructor(data: Uint8ClampedArray, sw: Int, sh: Int) : this() {
    TODO("Not yet implemented")
  }
  
  actual open val width: Int
    get() = TODO("Not yet implemented")
  actual open val height: Int
    get() = TODO("Not yet implemented")
  actual open val data: Uint8ClampedArray
    get() = TODO("Not yet implemented")
}