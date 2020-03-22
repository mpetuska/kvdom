package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.Float32Array
import lt.petuska.kvdom.dom.khronos.webgl.Float64Array

/**
 * Exposes the JavaScript [DOMMatrix](https://developer.mozilla.org/en/docs/Web/API/DOMMatrix) to Kotlin
 */
expect open class DOMMatrix() : DOMMatrixReadOnly {
  constructor(transformList: String)
  constructor(other: DOMMatrixReadOnly)
  constructor(array32: Float32Array)
  constructor(array64: Float64Array)
  constructor(numberSequence: Array<Double>)
  
  override var a: Double
  override var b: Double
  override var c: Double
  override var d: Double
  override var e: Double
  override var f: Double
  override var m11: Double
  override var m12: Double
  override var m13: Double
  override var m14: Double
  override var m21: Double
  override var m22: Double
  override var m23: Double
  override var m24: Double
  override var m31: Double
  override var m32: Double
  override var m33: Double
  override var m34: Double
  override var m41: Double
  override var m42: Double
  override var m43: Double
  override var m44: Double
  fun multiplySelf(other: DOMMatrix): DOMMatrix
  fun preMultiplySelf(other: DOMMatrix): DOMMatrix
  fun translateSelf(tx: Double, ty: Double, tz: Double): DOMMatrix
  fun scaleSelf(scale: Double, originX: Double, originY: Double): DOMMatrix
  fun scale3dSelf(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix
  fun scaleNonUniformSelf(
    scaleX: Double,
    scaleY: Double,
    scaleZ: Double,
    originX: Double,
    originY: Double,
    originZ: Double
  ): DOMMatrix
  
  fun rotateSelf(angle: Double, originX: Double, originY: Double): DOMMatrix
  fun rotateFromVectorSelf(x: Double, y: Double): DOMMatrix
  fun rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix
  fun skewXSelf(sx: Double): DOMMatrix
  fun skewYSelf(sy: Double): DOMMatrix
  fun invertSelf(): DOMMatrix
  fun setMatrixValue(transformList: String): DOMMatrix
}