package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ImageBitmapRenderingContext](https://developer.mozilla.org/en/docs/Web/API/ImageBitmapRenderingContext) to Kotlin
 */
expect abstract class ImageBitmapRenderingContext() {
  open val canvas: HTMLCanvasElement
  fun transferFromImageBitmap(bitmap: ImageBitmap?)
}