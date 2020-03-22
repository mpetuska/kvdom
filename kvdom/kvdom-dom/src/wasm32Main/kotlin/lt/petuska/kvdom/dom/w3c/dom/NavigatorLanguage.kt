package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NavigatorLanguage](https://developer.mozilla.org/en/docs/Web/API/NavigatorLanguage) to Kotlin
 */
actual interface NavigatorLanguage {
  actual val language: String
  actual val languages: Array<out String>
}