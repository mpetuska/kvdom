package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [PluginArray](https://developer.mozilla.org/en/docs/Web/API/PluginArray) to Kotlin
 */
actual abstract class PluginArray actual constructor() :
  ItemArrayLike<Plugin> {
  actual fun refresh(reload: Boolean) {
  }
  
  actual override fun item(index: Int): Plugin? {
    TODO("Not yet implemented")
  }
  
  actual fun namedItem(name: String): Plugin? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun PluginArray.get(index: Int): Plugin? {
  TODO("Not yet implemented")
}

actual inline operator fun PluginArray.get(name: String): Plugin? {
  TODO("Not yet implemented")
}