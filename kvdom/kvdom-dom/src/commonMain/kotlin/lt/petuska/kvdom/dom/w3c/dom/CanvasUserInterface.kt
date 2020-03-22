package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasUserInterface {
  fun drawFocusIfNeeded(element: Element)
  fun drawFocusIfNeeded(path: Path2D, element: Element)
  fun scrollPathIntoView()
  fun scrollPathIntoView(path: Path2D)
}