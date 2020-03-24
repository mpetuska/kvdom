package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ImageBitmapRenderingContext](https://developer.mozilla.org/en/docs/Web/API/ImageBitmapRenderingContext) to Kotlin
 */
actual abstract external class ImageBitmapRenderingContext {
  actual open val canvas: HTMLCanvasElement
  actual fun transferFromImageBitmap(bitmap: ImageBitmap?)
}