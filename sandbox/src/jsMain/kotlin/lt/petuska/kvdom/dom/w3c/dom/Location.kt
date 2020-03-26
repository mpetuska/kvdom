package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Location](https://developer.mozilla.org/en/docs/Web/API/Location) to Kotlin
 */
actual abstract external class Location {
  actual open var href: String
  actual open val origin: String
  actual open var protocol: String
  actual open var host: String
  actual open var hostname: String
  actual open var port: String
  actual open var pathname: String
  actual open var search: String
  actual open var hash: String
  actual open val ancestorOrigins: Array<out String>
  actual fun assign(url: String)
  actual fun replace(url: String)
  actual fun reload()
}