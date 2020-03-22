package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ScrollToOptions](https://developer.mozilla.org/en/docs/Web/API/ScrollToOptions) to Kotlin
 */
expect interface ScrollToOptions : ScrollOptions {
  var left: Double?
  var top: Double?
}

inline fun ScrollToOptions(
  left: Double? = null,
  top: Double? = null,
  behavior: ScrollBehavior? = ScrollBehavior.AUTO
): ScrollToOptions = object : ScrollToOptions, ScrollOptions by ScrollOptions(behavior) {
  override var left: Double? = left
  override var top: Double? = top
}
