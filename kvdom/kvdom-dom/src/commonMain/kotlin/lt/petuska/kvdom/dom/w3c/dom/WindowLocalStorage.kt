package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [WindowLocalStorage](https://developer.mozilla.org/en/docs/Web/API/WindowLocalStorage) to Kotlin
 */
expect interface WindowLocalStorage {
  val localStorage: Storage
}