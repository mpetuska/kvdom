package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.Float32Array
import lt.petuska.kvdom.dom.khronos.webgl.Float64Array

/**
 * Exposes the JavaScript [DOMMatrixReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMMatrixReadOnly) to Kotlin
 */
expect open class DOMMatrixReadOnly(numberSequence: Array<Double>) {
  open val a: Double
  open val b: Double
  open val c: Double
  open val d: Double
  open val e: Double
  open val f: Double
  open val m11: Double
  open val m12: Double
  open val m13: Double
  open val m14: Double
  open val m21: Double
  open val m22: Double
  open val m23: Double
  open val m24: Double
  open val m31: Double
  open val m32: Double
  open val m33: Double
  open val m34: Double
  open val m41: Double
  open val m42: Double
  open val m43: Double
  open val m44: Double
  open val is2D: Boolean
  open val isIdentity: Boolean
  fun translate(tx: Double, ty: Double, tz: Double): DOMMatrix
  fun scale(scale: Double, originX: Double, originY: Double): DOMMatrix
  fun scale3d(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix
  fun scaleNonUniform(
    scaleX: Double,
    scaleY: Double,
    scaleZ: Double,
    originX: Double,
    originY: Double,
    originZ: Double
  ): DOMMatrix
  
  fun rotate(angle: Double, originX: Double, originY: Double): DOMMatrix
  fun rotateFromVector(x: Double, y: Double): DOMMatrix
  fun rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): DOMMatrix
  fun skewX(sx: Double): DOMMatrix
  fun skewY(sy: Double): DOMMatrix
  fun multiply(other: DOMMatrix): DOMMatrix
  fun flipX(): DOMMatrix
  fun flipY(): DOMMatrix
  fun inverse(): DOMMatrix
  fun transformPoint(point: DOMPointInit): DOMPoint
  fun toFloat32Array(): Float32Array
  fun toFloat64Array(): Float64Array
}