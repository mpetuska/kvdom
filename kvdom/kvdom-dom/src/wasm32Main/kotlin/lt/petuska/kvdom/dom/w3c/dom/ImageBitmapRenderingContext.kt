package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [ImageBitmapRenderingContext](https://developer.mozilla.org/en/docs/Web/API/ImageBitmapRenderingContext) to Kotlin
 */
@NoWASM
actual abstract class ImageBitmapRenderingContext {
  actual open val canvas: HTMLCanvasElement
    get() = TODO("Not yet implemented")
  
  actual fun transferFromImageBitmap(bitmap: ImageBitmap?) {
  }
}