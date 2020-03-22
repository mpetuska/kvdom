package lt.petuska.kvdom.dom.w3c.dom

expect  interface CanvasFillStrokeStyles {
  var strokeStyle: Any
  var fillStyle: Any
  fun createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient
  fun createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient
  fun createPattern(image: CanvasImageSource, repetition: String): CanvasPattern?
}