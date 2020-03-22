package lt.petuska.kvdom.dom.w3c.dom

actual interface CanvasPathDrawingStyles {
  actual var lineWidth: Double
  actual var lineCap: CanvasLineCap
  actual var lineJoin: CanvasLineJoin
  actual var miterLimit: Double
  actual var lineDashOffset: Double
  actual fun setLineDash(segments: Array<Double>)
  actual fun getLineDash(): Array<Double>
}