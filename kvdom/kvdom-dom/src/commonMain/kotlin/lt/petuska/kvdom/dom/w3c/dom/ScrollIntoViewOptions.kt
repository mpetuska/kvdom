package lt.petuska.kvdom.dom.w3c.dom

expect interface ScrollIntoViewOptions : ScrollOptions {
  var block: ScrollLogicalPosition? /* = ScrollLogicalPosition.CENTER */
  var inline: ScrollLogicalPosition? /* = ScrollLogicalPosition.CENTER */
}

inline fun ScrollIntoViewOptions(
  block: ScrollLogicalPosition? = ScrollLogicalPosition.CENTER,
  inline: ScrollLogicalPosition? = ScrollLogicalPosition.CENTER,
  behavior: ScrollBehavior? = ScrollBehavior.AUTO
): ScrollIntoViewOptions = object : ScrollIntoViewOptions, ScrollOptions by ScrollOptions(behavior) {
  override var block: ScrollLogicalPosition? = block
  override var inline: ScrollLogicalPosition? = inline
}
