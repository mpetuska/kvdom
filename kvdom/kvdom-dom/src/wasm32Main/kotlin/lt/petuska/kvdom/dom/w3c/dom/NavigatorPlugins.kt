package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NavigatorPlugins](https://developer.mozilla.org/en/docs/Web/API/NavigatorPlugins) to Kotlin
 */
actual interface NavigatorPlugins {
  actual val plugins: PluginArray
  actual val mimeTypes: MimeTypeArray
  actual fun javaEnabled(): Boolean
}