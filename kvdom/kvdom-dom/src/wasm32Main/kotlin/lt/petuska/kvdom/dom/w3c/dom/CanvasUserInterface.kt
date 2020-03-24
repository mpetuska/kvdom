package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

actual interface CanvasUserInterface {
  @NoWASM
  actual fun drawFocusIfNeeded(element: Element)
  
  @NoWASM
  actual fun drawFocusIfNeeded(path: Path2D, element: Element)
  actual fun scrollPathIntoView()
  actual fun scrollPathIntoView(path: Path2D)
}