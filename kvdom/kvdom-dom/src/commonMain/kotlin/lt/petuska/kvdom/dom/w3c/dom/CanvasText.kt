package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasText {
  fun fillText(text: String, x: Double, y: Double, maxWidth: Double? = null)
  fun strokeText(text: String, x: Double, y: Double, maxWidth: Double? = null)
  fun measureText(text: String): TextMetrics
}