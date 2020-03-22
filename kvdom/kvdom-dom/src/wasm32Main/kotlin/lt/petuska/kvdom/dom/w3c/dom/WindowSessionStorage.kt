package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [WindowSessionStorage](https://developer.mozilla.org/en/docs/Web/API/WindowSessionStorage) to Kotlin
 */
actual interface WindowSessionStorage {
  actual val sessionStorage: Storage
}