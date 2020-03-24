package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

actual external interface CanvasTransform {
  actual fun scale(x: Double, y: Double)
  actual fun rotate(angle: Double)
  actual fun translate(x: Double, y: Double)
  actual fun transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
  actual fun getTransform(): DOMMatrix
  actual fun setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
  actual fun setTransform(transform: Dynamic)
  actual fun resetTransform()
}