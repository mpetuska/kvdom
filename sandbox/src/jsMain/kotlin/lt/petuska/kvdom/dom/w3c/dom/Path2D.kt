package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

/**
 * Exposes the JavaScript [Path2D](https://developer.mozilla.org/en/docs/Web/API/Path2D) to Kotlin
 */
actual abstract external class Path2D actual constructor() : CanvasPath {
  actual constructor(path: Path2D)
  actual constructor(paths: Array<Path2D>, fillRule: CanvasFillRule)
  actual constructor(d: String)
  
  actual fun addPath(path: Path2D, transform: Dynamic)
}