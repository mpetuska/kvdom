package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [History](https://developer.mozilla.org/en/docs/Web/API/History) to Kotlin
 */
actual abstract class History actual constructor() {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  actual open var scrollRestoration: ScrollRestoration
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val state: Any?
    get() = TODO("Not yet implemented")
  
  actual fun go(delta: Int) {
  }
  
  actual fun back() {
  }
  
  actual fun forward() {
  }
  
  actual fun pushState(data: Any?, title: String, url: String?) {
  }
  
  actual fun replaceState(data: Any?, title: String, url: String?) {
  }
}