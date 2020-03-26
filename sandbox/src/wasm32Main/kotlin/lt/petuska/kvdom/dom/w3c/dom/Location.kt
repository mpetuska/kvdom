package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [Location](https://developer.mozilla.org/en/docs/Web/API/Location) to Kotlin
 */
@NoWASM
actual abstract class Location {
  actual open var href: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val origin: String
    get() = TODO("Not yet implemented")
  actual open var protocol: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var host: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var hostname: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var port: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var pathname: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var search: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var hash: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val ancestorOrigins: Array<out String>
    get() = TODO("Not yet implemented")
  
  actual fun assign(url: String) {
  }
  
  actual fun replace(url: String) {
  }
  
  actual fun reload() {
  }
}