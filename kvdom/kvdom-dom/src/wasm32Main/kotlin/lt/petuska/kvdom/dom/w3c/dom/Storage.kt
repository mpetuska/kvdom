package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Storage](https://developer.mozilla.org/en/docs/Web/API/Storage) to Kotlin
 */
actual abstract class Storage actual constructor() {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  
  actual fun key(index: Int): String? {
    TODO("Not yet implemented")
  }
  
  actual fun removeItem(key: String) {
  }
  
  actual fun clear() {
  }
  
  actual fun getItem(key: String): String? {
    TODO("Not yet implemented")
  }
  
  actual fun setItem(key: String, value: String) {
  }
}

actual inline operator fun Storage.get(key: String): String? {
  TODO("Not yet implemented")
}

actual inline operator fun Storage.set(key: String, value: String) {
}