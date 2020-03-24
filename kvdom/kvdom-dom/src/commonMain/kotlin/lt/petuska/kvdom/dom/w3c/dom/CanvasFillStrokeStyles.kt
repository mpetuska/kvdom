package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

expect interface CanvasFillStrokeStyles {
  var strokeStyle: Dynamic
  var fillStyle: Dynamic
  
  fun createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient
  fun createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient
  fun createPattern(image: CanvasImageSource, repetition: String): CanvasPattern?
}