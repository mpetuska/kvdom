package lt.petuska.kvdom.dom.w3c.dom

actual interface CanvasDrawPath {
  actual fun beginPath()
  actual fun fill(fillRule: CanvasFillRule)
  actual fun fill(path: Path2D, fillRule: CanvasFillRule)
  actual fun stroke()
  actual fun stroke(path: Path2D)
  actual fun clip(fillRule: CanvasFillRule)
  actual fun clip(path: Path2D, fillRule: CanvasFillRule)
  actual fun resetClip()
  actual fun isPointInPath(
    x: Double,
    y: Double,
    fillRule: CanvasFillRule
  ): Boolean
  
  actual fun isPointInPath(
    path: Path2D,
    x: Double,
    y: Double,
    fillRule: CanvasFillRule
  ): Boolean
  
  actual fun isPointInStroke(x: Double, y: Double): Boolean
  actual fun isPointInStroke(
    path: Path2D,
    x: Double,
    y: Double
  ): Boolean
}