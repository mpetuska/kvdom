package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLHyperlinkElementUtils](https://developer.mozilla.org/en/docs/Web/API/HTMLHyperlinkElementUtils) to Kotlin
 */
actual interface HTMLHyperlinkElementUtils {
  actual var href: String
  actual val origin: String
  actual var protocol: String
  actual var username: String
  actual var password: String
  actual var host: String
  actual var hostname: String
  actual var port: String
  actual var pathname: String
  actual var search: String
  actual var hash: String
}