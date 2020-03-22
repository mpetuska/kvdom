package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMQuad](https://developer.mozilla.org/en/docs/Web/API/DOMQuad) to Kotlin
 */
actual open class DOMQuad actual constructor() {
  actual constructor(
    p1: DOMPointInit,
    p2: DOMPointInit,
    p3: DOMPointInit,
    p4: DOMPointInit
  ) : this() {
    TODO("Not yet implemented")
  }
  
  actual constructor(rect: DOMRectInit) : this() {
    TODO("Not yet implemented")
  }
  
  actual open val p1: DOMPoint
    get() = TODO("Not yet implemented")
  actual open val p2: DOMPoint
    get() = TODO("Not yet implemented")
  actual open val p3: DOMPoint
    get() = TODO("Not yet implemented")
  actual open val p4: DOMPoint
    get() = TODO("Not yet implemented")
  actual open val bounds: DOMRectReadOnly
    get() = TODO("Not yet implemented")
}