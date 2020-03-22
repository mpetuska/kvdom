package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMTokenList](https://developer.mozilla.org/en/docs/Web/API/DOMTokenList) to Kotlin
 */
expect abstract class DOMTokenList() : ItemArrayLike<String> {
  open var value: String
  fun contains(token: String): Boolean
  fun add(vararg tokens: String)
  fun remove(vararg tokens: String)
  fun toggle(token: String, force: Boolean): Boolean
  fun replace(token: String, newToken: String)
  fun supports(token: String): Boolean
  override fun item(index: Int): String?
}

expect inline operator fun DOMTokenList.get(index: Int): String?
