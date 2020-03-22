package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NavigatorLanguage](https://developer.mozilla.org/en/docs/Web/API/NavigatorLanguage) to Kotlin
 */
expect interface NavigatorLanguage {
  val language: String
  val languages: Array<out String>
}