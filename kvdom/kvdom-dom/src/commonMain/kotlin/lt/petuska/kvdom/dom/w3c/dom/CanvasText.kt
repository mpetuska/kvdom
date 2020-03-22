package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasText {
  fun fillText(text: String, x: Double, y: Double, maxWidth: Double)
  fun strokeText(text: String, x: Double, y: Double, maxWidth: Double)
  fun measureText(text: String): TextMetrics
}