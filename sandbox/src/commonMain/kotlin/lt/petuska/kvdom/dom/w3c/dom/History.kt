package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [History](https://developer.mozilla.org/en/docs/Web/API/History) to Kotlin
 */
@NoWASM
expect abstract class History {
  open val length: Int
  open var scrollRestoration: ScrollRestoration
  open val state: Any?
  fun go(delta: Int = 0)
  fun back()
  fun forward()
  fun pushState(data: Any?, title: String, url: String? = null)
  fun replaceState(data: Any?, title: String, url: String? = null)
}