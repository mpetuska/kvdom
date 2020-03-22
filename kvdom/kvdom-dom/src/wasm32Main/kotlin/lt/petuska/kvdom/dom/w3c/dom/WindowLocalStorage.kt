package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [WindowLocalStorage](https://developer.mozilla.org/en/docs/Web/API/WindowLocalStorage) to Kotlin
 */
actual interface WindowLocalStorage {
  actual val localStorage: Storage
}