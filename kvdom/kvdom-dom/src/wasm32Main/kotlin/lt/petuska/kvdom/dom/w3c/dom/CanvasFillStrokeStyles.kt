package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

actual interface CanvasFillStrokeStyles {
  actual var strokeStyle: Dynamic
  actual var fillStyle: Dynamic
  
  actual fun createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient
  actual fun createRadialGradient(
    x0: Double,
    y0: Double,
    r0: Double,
    x1: Double,
    y1: Double,
    r1: Double
  ): CanvasGradient
  
  actual fun createPattern(image: CanvasImageSource, repetition: String): CanvasPattern?
}