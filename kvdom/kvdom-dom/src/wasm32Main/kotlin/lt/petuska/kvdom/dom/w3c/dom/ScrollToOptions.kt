package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ScrollToOptions](https://developer.mozilla.org/en/docs/Web/API/ScrollToOptions) to Kotlin
 */
actual interface ScrollToOptions : ScrollOptions {
  actual var left: Double?
  actual var top: Double?
}