package lt.petuska.kvdom.dom.w3c.dom

actual interface CanvasText {
  actual fun fillText(text: String, x: Double, y: Double, maxWidth: Double?)
  actual fun strokeText(text: String, x: Double, y: Double, maxWidth: Double?)
  actual fun measureText(text: String): TextMetrics
}