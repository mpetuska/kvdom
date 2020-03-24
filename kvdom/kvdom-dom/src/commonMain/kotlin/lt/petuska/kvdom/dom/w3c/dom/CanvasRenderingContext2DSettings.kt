package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasRenderingContext2DSettings {
  var alpha: Boolean? /* = true */
}

fun CanvasRenderingContext2DSettings(alpha: Boolean? = true): CanvasRenderingContext2DSettings =
  object : CanvasRenderingContext2DSettings {
    override var alpha: Boolean? = alpha
  }