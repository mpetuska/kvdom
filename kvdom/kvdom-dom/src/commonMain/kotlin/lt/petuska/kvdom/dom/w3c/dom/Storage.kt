package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Storage](https://developer.mozilla.org/en/docs/Web/API/Storage) to Kotlin
 */
expect abstract class Storage() {
  open val length: Int
  fun key(index: Int): String?
  fun removeItem(key: String)
  fun clear()
  fun getItem(key: String): String?
  fun setItem(key: String, value: String)
}

expect inline operator fun Storage.get(key: String): String?

expect inline operator fun Storage.set(key: String, value: String)
