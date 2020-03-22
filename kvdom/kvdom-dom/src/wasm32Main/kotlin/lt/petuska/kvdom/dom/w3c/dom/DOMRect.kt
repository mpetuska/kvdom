package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMRect](https://developer.mozilla.org/en/docs/Web/API/DOMRect) to Kotlin
 */
actual open class DOMRect actual constructor(
  x: Double,
  y: Double,
  width: Double,
  height: Double
) :
  DOMRectReadOnly() {
  actual override var x: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var y: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var width: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var height: Double
    get() = TODO("Not yet implemented")
    set(value) {}
}