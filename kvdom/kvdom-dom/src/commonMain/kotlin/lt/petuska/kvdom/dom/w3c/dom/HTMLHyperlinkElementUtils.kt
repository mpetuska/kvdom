package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLHyperlinkElementUtils](https://developer.mozilla.org/en/docs/Web/API/HTMLHyperlinkElementUtils) to Kotlin
 */
expect interface HTMLHyperlinkElementUtils {
  var href: String
  val origin: String
  var protocol: String
  var username: String
  var password: String
  var host: String
  var hostname: String
  var port: String
  var pathname: String
  var search: String
  var hash: String
}