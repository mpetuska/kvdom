package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasPathDrawingStyles {
  var lineWidth: Double
  var lineCap: CanvasLineCap
  var lineJoin: CanvasLineJoin
  var miterLimit: Double
  var lineDashOffset: Double
  fun setLineDash(segments: Array<Double>)
  fun getLineDash(): Array<Double>
}