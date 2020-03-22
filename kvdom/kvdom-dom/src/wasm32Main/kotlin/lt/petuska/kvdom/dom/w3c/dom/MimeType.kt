package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MimeType](https://developer.mozilla.org/en/docs/Web/API/MimeType) to Kotlin
 */
actual abstract class MimeType actual constructor() {
  actual open val type: String
    get() = TODO("Not yet implemented")
  actual open val description: String
    get() = TODO("Not yet implemented")
  actual open val suffixes: String
    get() = TODO("Not yet implemented")
  actual open val enabledPlugin: Plugin
    get() = TODO("Not yet implemented")
}