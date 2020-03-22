package lt.petuska.kvdom.dom.w3c.dom

expect interface ImageBitmapRenderingContextSettings {
  var alpha: Boolean? /* = true */
}

inline fun ImageBitmapRenderingContextSettings(alpha: Boolean? = true): ImageBitmapRenderingContextSettings =
  object : ImageBitmapRenderingContextSettings {
    override var alpha: Boolean? = alpha
  }
