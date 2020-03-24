package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

expect interface CanvasUserInterface {
  @NoWASM
  fun drawFocusIfNeeded(element: Element)
  
  @NoWASM
  fun drawFocusIfNeeded(path: Path2D, element: Element)
  fun scrollPathIntoView()
  fun scrollPathIntoView(path: Path2D)
}