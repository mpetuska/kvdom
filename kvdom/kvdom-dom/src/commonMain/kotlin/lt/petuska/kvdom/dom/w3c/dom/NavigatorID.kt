package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NavigatorID](https://developer.mozilla.org/en/docs/Web/API/NavigatorID) to Kotlin
 */
expect interface NavigatorID {
  val appCodeName: String
  val appName: String
  val appVersion: String
  val platform: String
  val product: String
  val productSub: String
  val userAgent: String
  val vendor: String
  val vendorSub: String
  val oscpu: String
  fun taintEnabled(): Boolean
}