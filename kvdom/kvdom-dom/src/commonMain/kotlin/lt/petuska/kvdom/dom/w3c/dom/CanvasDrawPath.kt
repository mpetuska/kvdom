package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasDrawPath {
  fun beginPath()
  fun fill(fillRule: CanvasFillRule)
  fun fill(path: Path2D, fillRule: CanvasFillRule)
  fun stroke()
  fun stroke(path: Path2D)
  fun clip(fillRule: CanvasFillRule)
  fun clip(path: Path2D, fillRule: CanvasFillRule)
  fun resetClip()
  fun isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule): Boolean
  fun isPointInPath(path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule): Boolean
  fun isPointInStroke(x: Double, y: Double): Boolean
  fun isPointInStroke(path: Path2D, x: Double, y: Double): Boolean
}