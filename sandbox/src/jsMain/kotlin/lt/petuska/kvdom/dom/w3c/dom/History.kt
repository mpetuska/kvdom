package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [History](https://developer.mozilla.org/en/docs/Web/API/History) to Kotlin
 */
actual abstract external class History {
  actual open val length: Int
  actual open var scrollRestoration: ScrollRestoration
  actual open val state: Any?
  actual fun go(delta: Int)
  actual fun back()
  actual fun forward()
  actual fun pushState(data: Any?, title: String, url: String?)
  actual fun replaceState(data: Any?, title: String, url: String?)
}