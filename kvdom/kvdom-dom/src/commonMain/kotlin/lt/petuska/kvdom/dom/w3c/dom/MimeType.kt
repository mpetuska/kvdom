package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MimeType](https://developer.mozilla.org/en/docs/Web/API/MimeType) to Kotlin
 */
expect abstract class MimeType() {
  open val type: String
  open val description: String
  open val suffixes: String
  open val enabledPlugin: Plugin
}