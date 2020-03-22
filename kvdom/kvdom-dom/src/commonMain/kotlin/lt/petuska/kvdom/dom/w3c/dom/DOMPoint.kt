package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMPoint](https://developer.mozilla.org/en/docs/Web/API/DOMPoint) to Kotlin
 */
expect open class DOMPoint() : DOMPointReadOnly {
  constructor(point: DOMPointInit)
  constructor(x: Double, y: Double, z: Double, w: Double)
  
  override var x: Double
  override var y: Double
  override var z: Double
  override var w: Double
}