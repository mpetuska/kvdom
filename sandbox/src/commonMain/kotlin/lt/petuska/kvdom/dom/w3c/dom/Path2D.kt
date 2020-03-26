package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

/**
 * Exposes the JavaScript [Path2D](https://developer.mozilla.org/en/docs/Web/API/Path2D) to Kotlin
 */
expect abstract class Path2D() : CanvasPath {
  constructor(path: Path2D)
  constructor(paths: Array<Path2D>, fillRule: CanvasFillRule = CanvasFillRule.NONZERO)
  constructor(d: String)
  
  fun addPath(path: Path2D, transform: Dynamic = object {})
}