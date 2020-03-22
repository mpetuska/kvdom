package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [History](https://developer.mozilla.org/en/docs/Web/API/History) to Kotlin
 */
expect abstract class History() {
  open val length: Int
  open var scrollRestoration: ScrollRestoration
  open val state: Any?
  fun go(delta: Int)
  fun back()
  fun forward()
  fun pushState(data: Any?, title: String, url: String?)
  fun replaceState(data: Any?, title: String, url: String?)
}