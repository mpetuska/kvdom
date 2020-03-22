package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ImageBitmapRenderingContext](https://developer.mozilla.org/en/docs/Web/API/ImageBitmapRenderingContext) to Kotlin
 */
actual abstract class ImageBitmapRenderingContext actual constructor() {
  actual open val canvas: HTMLCanvasElement
    get() = TODO("Not yet implemented")
  
  actual fun transferFromImageBitmap(bitmap: ImageBitmap?) {
  }
}