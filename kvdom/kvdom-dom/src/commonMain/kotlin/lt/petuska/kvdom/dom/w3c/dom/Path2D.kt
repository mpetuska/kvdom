package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Path2D](https://developer.mozilla.org/en/docs/Web/API/Path2D) to Kotlin
 */
expect open class Path2D() : CanvasPath {
  constructor(path: Path2D)
  constructor(paths: Array<Path2D>, fillRule: CanvasFillRule)
  constructor(d: String)
  
  fun addPath(path: Path2D, transform: Any)
  override fun closePath()
  override fun moveTo(x: Double, y: Double)
  override fun lineTo(x: Double, y: Double)
  override fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)
  override fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)
  override fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)
  override fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radiusX: Double, radiusY: Double, rotation: Double)
  override fun rect(x: Double, y: Double, w: Double, h: Double)
  override fun arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean /* = definedExternally */
  )
  
  override fun ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean /* = definedExternally */
  )
}