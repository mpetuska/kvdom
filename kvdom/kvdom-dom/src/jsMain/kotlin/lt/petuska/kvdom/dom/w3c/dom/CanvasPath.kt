package lt.petuska.kvdom.dom.w3c.dom

actual external interface CanvasPath {
  actual fun closePath()
  actual fun moveTo(x: Double, y: Double)
  actual fun lineTo(x: Double, y: Double)
  actual fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)
  actual fun bezierCurveTo(
    cp1x: Double,
    cp1y: Double,
    cp2x: Double,
    cp2y: Double,
    x: Double,
    y: Double
  )
  
  actual fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)
  actual fun arcTo(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double
  )
  
  actual fun rect(x: Double, y: Double, w: Double, h: Double)
  actual fun arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean
  )
  
  actual fun ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean
  )
  
}