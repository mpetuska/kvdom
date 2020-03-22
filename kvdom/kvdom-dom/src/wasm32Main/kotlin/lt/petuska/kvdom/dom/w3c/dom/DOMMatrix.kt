package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.khronos.webgl.Float32Array
import lt.petuska.kvdom.dom.khronos.webgl.Float64Array

/**
 * Exposes the JavaScript [DOMMatrix](https://developer.mozilla.org/en/docs/Web/API/DOMMatrix) to Kotlin
 */
actual open class DOMMatrix actual constructor() : DOMMatrixReadOnly(arrayOf()) {
  actual constructor(transformList: String) : this() {
    TODO("Not yet implemented")
  }
  
  actual constructor(other: DOMMatrixReadOnly) : this() {
    TODO("Not yet implemented")
  }
  
  actual constructor(array32: Float32Array) : this() {
    TODO("Not yet implemented")
  }
  
  actual constructor(array64: Float64Array) : this() {
    TODO("Not yet implemented")
  }
  
  actual constructor(numberSequence: Array<Double>) : this() {
    TODO("Not yet implemented")
  }
  
  actual override var a: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var b: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var c: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var d: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var e: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var f: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m11: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m12: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m13: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m14: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m21: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m22: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m23: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m24: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m31: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m32: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m33: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m34: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m41: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m42: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m43: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var m44: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun multiplySelf(other: DOMMatrix): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun preMultiplySelf(other: DOMMatrix): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun translateSelf(
    tx: Double,
    ty: Double,
    tz: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun scaleSelf(
    scale: Double,
    originX: Double,
    originY: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun scale3dSelf(
    scale: Double,
    originX: Double,
    originY: Double,
    originZ: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun scaleNonUniformSelf(
    scaleX: Double,
    scaleY: Double,
    scaleZ: Double,
    originX: Double,
    originY: Double,
    originZ: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun rotateSelf(
    angle: Double,
    originX: Double,
    originY: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun rotateFromVectorSelf(x: Double, y: Double): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun rotateAxisAngleSelf(
    x: Double,
    y: Double,
    z: Double,
    angle: Double
  ): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun skewXSelf(sx: Double): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun skewYSelf(sy: Double): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun invertSelf(): DOMMatrix {
    TODO("Not yet implemented")
  }
  
  actual fun setMatrixValue(transformList: String): DOMMatrix {
    TODO("Not yet implemented")
  }
}