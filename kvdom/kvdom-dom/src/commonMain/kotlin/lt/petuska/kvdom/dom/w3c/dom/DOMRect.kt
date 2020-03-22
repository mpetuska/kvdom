package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMRect](https://developer.mozilla.org/en/docs/Web/API/DOMRect) to Kotlin
 */
expect open class DOMRect(x: Double, y: Double, width: Double, height: Double) :
  DOMRectReadOnly {
  override var x: Double
  override var y: Double
  override var width: Double
  override var height: Double
}