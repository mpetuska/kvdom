package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMQuad](https://developer.mozilla.org/en/docs/Web/API/DOMQuad) to Kotlin
 */
expect open class DOMQuad() {
  constructor(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit)
  constructor(rect: DOMRectInit)
  
  open val p1: DOMPoint
  open val p2: DOMPoint
  open val p3: DOMPoint
  open val p4: DOMPoint
  open val bounds: DOMRectReadOnly
}