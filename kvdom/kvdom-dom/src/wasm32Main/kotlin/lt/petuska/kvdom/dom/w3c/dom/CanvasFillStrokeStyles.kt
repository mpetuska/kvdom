package lt.petuska.kvdom.dom.w3c.dom

actual interface CanvasFillStrokeStyles {
  actual var strokeStyle: Any
  actual var fillStyle: Any
  actual fun createLinearGradient(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double
  ): CanvasGradient
  
  actual fun createRadialGradient(
    x0: Double,
    y0: Double,
    r0: Double,
    x1: Double,
    y1: Double,
    r1: Double
  ): CanvasGradient
  
  actual fun createPattern(
    image: CanvasImageSource,
    repetition: String
  ): CanvasPattern?
}