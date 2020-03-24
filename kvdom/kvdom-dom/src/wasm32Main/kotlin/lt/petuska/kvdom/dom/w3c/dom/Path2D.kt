package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [Path2D](https://developer.mozilla.org/en/docs/Web/API/Path2D) to Kotlin
 */
@NoWASM
actual abstract class Path2D actual constructor() : CanvasPath {
  actual constructor(path: Path2D) : this() {
    TODO()
  }
  
  actual constructor(paths: Array<Path2D>, fillRule: CanvasFillRule) : this() {
    TODO()
  }
  
  actual constructor(d: String) : this() {
    TODO()
  }
  
  actual fun addPath(path: Path2D, transform: Dynamic) {
    TODO()
  }
}