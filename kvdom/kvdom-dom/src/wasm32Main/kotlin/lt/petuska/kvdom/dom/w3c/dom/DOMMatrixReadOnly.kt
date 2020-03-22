package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.Float32Array
import lt.petuska.kvdom.dom.khronos.webgl.Float64Array

/**
 * Exposes the JavaScript [DOMMatrixReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMMatrixReadOnly) to Kotlin
 */
actual open class DOMMatrixReadOnly actual constructor(numberSequence: Array<Double>) {
  actual open val a: Double
    get() = TODO("Not yet implemented")
  actual open val b: Double
    get() = TODO("Not yet implemented")
  actual open val c: Double
    get() = TODO("Not yet implemented")
  actual open val d: Double
    get() = TODO("Not yet implemented")
  actual open val e: Double
    get() = TODO("Not yet implemented")
  actual open val f: Double
    get() = TODO("Not yet implemented")
  actual open val m11: Double
    get() = TODO("Not yet implemented")
  actual open val m12: Double
    get() = TODO("Not yet implemented")
  actual open val m13: Double
    get() = TODO("Not yet implemented")
  actual open val m14: Double
    get() = TODO("Not yet implemented")
  actual open val m21: Double
    get() = TODO("Not yet implemented")
  actual open val m22: Double
    get() = TODO("Not yet implemented")
  actual open val m23: Double
    get() = TODO("Not yet implemented")
  actual open val m24: Double
    get() = TODO("Not yet implemented")
  actual open val m31: Double
    get() = TODO("Not yet implemented")
  actual open val m32: Double
    get() = TODO("Not yet implemented")
  actual open val m33: Double
    get() = TODO("Not yet implemented")
  actual open val m34: Double
    get() = TODO("Not yet implemented")
  actual open val m41: Double
    get() = TODO("Not yet implemented")
  actual open val m42: Double
    get() = TODO("Not yet implemented")
  actual open val m43: Double
    get() = TODO("Not yet implemented")
  actual open val m44: Double
    get() = TODO("Not yet implemented")
  actual open val is2D: Boolean
    get() = TODO("Not yet implemented")
  actual open val isIdentity: Boolean
    get() = TODO("Not yet implemented")
  
  actual fun translate(
    tx: Double,
    ty: Double,
    tz: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun scale(
    scale: Double,
    originX: Double,
    originY: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun scale3d(
    scale: Double,
    originX: Double,
    originY: Double,
    originZ: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun scaleNonUniform(
    scaleX: Double,
    scaleY: Double,
    scaleZ: Double,
    originX: Double,
    originY: Double,
    originZ: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun rotate(
    angle: Double,
    originX: Double,
    originY: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun rotateFromVector(x: Double, y: Double): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun rotateAxisAngle(
    x: Double,
    y: Double,
    z: Double,
    angle: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun skewX(sx: Double): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun skewY(sy: Double): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun multiply(other: DOMMatrix): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun flipX(): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun flipY(): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun inverse(): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun transformPoint(point: DOMPointInit): DOMPoint {
    TODO("Not yet implemented")
  }
  
  actual fun toFloat32Array(): Float32Array {
    TODO("Not yet implemented")
  }
  
  actual fun toFloat64Array(): Float64Array {
    TODO("Not yet implemented")
  }
  
}