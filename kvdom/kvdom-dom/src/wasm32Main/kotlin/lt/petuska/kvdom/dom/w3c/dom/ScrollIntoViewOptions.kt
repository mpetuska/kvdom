package lt.petuska.kvdom.dom.w3c.dom

actual interface ScrollIntoViewOptions : ScrollOptions {
  actual var block: ScrollLogicalPosition?
  actual var inline: ScrollLogicalPosition?
}