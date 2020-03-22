package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Plugin](https://developer.mozilla.org/en/docs/Web/API/Plugin) to Kotlin
 */
actual abstract class Plugin : ItemArrayLike<MimeType> {
  actual open val name: String
    get() = TODO("Not yet implemented")
  actual open val description: String
    get() = TODO("Not yet implemented")
  actual open val filename: String
    get() = TODO("Not yet implemented")
  
  actual override fun item(index: Int): MimeType? {
    TODO("Not yet implemented")
  }
  
  actual fun namedItem(name: String): MimeType? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun Plugin.get(index: Int): MimeType? {
  TODO("Not yet implemented")
}

actual inline operator fun Plugin.get(name: String): MimeType? {
  TODO("Not yet implemented")
}