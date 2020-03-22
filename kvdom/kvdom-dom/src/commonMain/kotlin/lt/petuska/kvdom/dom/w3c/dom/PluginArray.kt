package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [PluginArray](https://developer.mozilla.org/en/docs/Web/API/PluginArray) to Kotlin
 */
expect abstract class PluginArray() :
  ItemArrayLike<Plugin> {
  fun refresh(reload: Boolean)
  override fun item(index: Int): Plugin?
  fun namedItem(name: String): Plugin?
}

expect inline operator fun PluginArray.get(index: Int): Plugin?

expect inline operator fun PluginArray.get(name: String): Plugin?
