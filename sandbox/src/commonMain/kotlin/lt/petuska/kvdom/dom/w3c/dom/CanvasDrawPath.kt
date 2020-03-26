package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasDrawPath {
  fun beginPath()
  fun fill(fillRule: CanvasFillRule = CanvasFillRule.NONZERO)
  fun fill(path: Path2D, fillRule: CanvasFillRule = CanvasFillRule.NONZERO)
  fun stroke()
  fun stroke(path: Path2D)
  fun clip(fillRule: CanvasFillRule = CanvasFillRule.NONZERO)
  fun clip(path: Path2D, fillRule: CanvasFillRule = CanvasFillRule.NONZERO)
  fun resetClip()
  fun isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule = CanvasFillRule.NONZERO): Boolean
  fun isPointInPath(path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule = CanvasFillRule.NONZERO): Boolean
  fun isPointInStroke(x: Double, y: Double): Boolean
  fun isPointInStroke(path: Path2D, x: Double, y: Double): Boolean
}