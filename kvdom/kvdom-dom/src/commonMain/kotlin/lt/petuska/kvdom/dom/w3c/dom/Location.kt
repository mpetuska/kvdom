package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Location](https://developer.mozilla.org/en/docs/Web/API/Location) to Kotlin
 */
expect abstract class Location() {
  open var href: String
  open val origin: String
  open var protocol: String
  open var host: String
  open var hostname: String
  open var port: String
  open var pathname: String
  open var search: String
  open var hash: String
  open val ancestorOrigins: Array<out String>
  fun assign(url: String)
  fun replace(url: String)
  fun reload()
}