package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMPoint](https://developer.mozilla.org/en/docs/Web/API/DOMPoint) to Kotlin
 */
actual open class DOMPoint actual constructor() : DOMPointReadOnly(0.0, 0.0, 0.0, 0.0) {
  actual constructor(point: DOMPointInit) : this() {
    TODO("Not yet implemented")
  }
  
  actual constructor(x: Double, y: Double, z: Double, w: Double) : this() {
    TODO("Not yet implemented")
  }
  
  actual override var x: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var y: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var z: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var w: Double
    get() = TODO("Not yet implemented")
    set(value) {}
}