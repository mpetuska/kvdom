package lt.petuska.kvdom.dom.w3c.dom

expect interface ImageBitmapRenderingContextSettings {
  var alpha: Boolean? /* = true */
}

fun ImageBitmapRenderingContextSettings(alpha: Boolean? = true) = object : ImageBitmapRenderingContextSettings {
  override var alpha: Boolean? = alpha
}