package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasTransform {
  fun scale(x: Double, y: Double)
  fun rotate(angle: Double)
  fun translate(x: Double, y: Double)
  fun transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
  fun getTransform(): DOMMatrix
  fun setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
  fun setTransform(transform: Any)
  fun resetTransform()
}