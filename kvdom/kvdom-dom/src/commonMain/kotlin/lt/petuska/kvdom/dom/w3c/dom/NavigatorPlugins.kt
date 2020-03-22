package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NavigatorPlugins](https://developer.mozilla.org/en/docs/Web/API/NavigatorPlugins) to Kotlin
 */
expect interface NavigatorPlugins {
  val plugins: PluginArray
  val mimeTypes: MimeTypeArray
  fun javaEnabled(): Boolean
}