package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [WindowSessionStorage](https://developer.mozilla.org/en/docs/Web/API/WindowSessionStorage) to Kotlin
 */
expect interface WindowSessionStorage {
  val sessionStorage: Storage
}