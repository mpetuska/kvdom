package lt.petuska.kvdom.dom.w3c.dom

actual interface CanvasUserInterface {
  actual fun drawFocusIfNeeded(element: Element)
  actual fun drawFocusIfNeeded(path: Path2D, element: Element)
  actual fun scrollPathIntoView()
  actual fun scrollPathIntoView(path: Path2D)
}