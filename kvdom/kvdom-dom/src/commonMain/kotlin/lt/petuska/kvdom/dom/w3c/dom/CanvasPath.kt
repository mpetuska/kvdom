package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasPath {
  fun closePath()
  fun moveTo(x: Double, y: Double)
  fun lineTo(x: Double, y: Double)
  fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)
  fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)
  fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)
  fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radiusX: Double, radiusY: Double, rotation: Double)
  fun rect(x: Double, y: Double, w: Double, h: Double)
  fun arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean)
  fun ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean)
}