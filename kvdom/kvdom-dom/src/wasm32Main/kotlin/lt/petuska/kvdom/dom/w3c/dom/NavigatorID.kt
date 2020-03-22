package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NavigatorID](https://developer.mozilla.org/en/docs/Web/API/NavigatorID) to Kotlin
 */
actual interface NavigatorID {
  actual val appCodeName: String
  actual val appName: String
  actual val appVersion: String
  actual val platform: String
  actual val product: String
  actual val productSub: String
  actual val userAgent: String
  actual val vendor: String
  actual val vendorSub: String
  actual val oscpu: String
  actual fun taintEnabled(): Boolean
}