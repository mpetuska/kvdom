package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMTokenList](https://developer.mozilla.org/en/docs/Web/API/DOMTokenList) to Kotlin
 */
actual abstract class DOMTokenList actual constructor() : ItemArrayLike<String> {
  actual open var value: String
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun contains(token: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun add(vararg tokens: String) {
  }
  
  actual fun remove(vararg tokens: String) {
  }
  
  actual fun toggle(token: String, force: Boolean): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun replace(token: String, newToken: String) {
  }
  
  actual fun supports(token: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual override fun item(index: Int): String? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun DOMTokenList.get(index: Int): String? {
  TODO("Not yet implemented")
}