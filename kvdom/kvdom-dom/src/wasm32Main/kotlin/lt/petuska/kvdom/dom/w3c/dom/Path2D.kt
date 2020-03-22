package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Path2D](https://developer.mozilla.org/en/docs/Web/API/Path2D) to Kotlin
 */
actual open class Path2D actual constructor() : CanvasPath {
  actual constructor(path: Path2D) : this() {
    TODO("Not yet implemented")
  }
  
  actual constructor(
    paths: Array<Path2D>,
    fillRule: CanvasFillRule
  ) : this() {
    TODO("Not yet implemented")
  }
  
  actual constructor(d: String) : this() {
    TODO("Not yet implemented")
  }
  
  actual fun addPath(path: Path2D, transform: Any) {
  }
  
  actual override fun closePath() {
  }
  
  actual override fun moveTo(x: Double, y: Double) {
  }
  
  actual override fun lineTo(x: Double, y: Double) {
  }
  
  actual override fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double) {
  }
  
  actual override fun bezierCurveTo(
    cp1x: Double,
    cp1y: Double,
    cp2x: Double,
    cp2y: Double,
    x: Double,
    y: Double
  ) {
  }
  
  actual override fun arcTo(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    radius: Double
  ) {
  }
  
  actual override fun arcTo(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double
  ) {
  }
  
  actual override fun rect(x: Double, y: Double, w: Double, h: Double) {
  }
  
  actual override fun arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean
  ) {
  }
  
  actual override fun ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean
  ) {
  }
}