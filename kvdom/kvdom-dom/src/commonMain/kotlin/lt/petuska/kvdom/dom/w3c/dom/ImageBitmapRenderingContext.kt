package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [ImageBitmapRenderingContext](https://developer.mozilla.org/en/docs/Web/API/ImageBitmapRenderingContext) to Kotlin
 */
@NoWASM
expect abstract class ImageBitmapRenderingContext {
  open val canvas: HTMLCanvasElement
  fun transferFromImageBitmap(bitmap: ImageBitmap?)
}