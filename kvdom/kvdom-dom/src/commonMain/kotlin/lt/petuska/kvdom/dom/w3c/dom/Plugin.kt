package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Plugin](https://developer.mozilla.org/en/docs/Web/API/Plugin) to Kotlin
 */
expect abstract class Plugin : ItemArrayLike<MimeType> {
  open val name: String
  open val description: String
  open val filename: String
  override fun item(index: Int): MimeType?
  fun namedItem(name: String): MimeType?
}

expect inline operator fun Plugin.get(index: Int): MimeType?

expect inline operator fun Plugin.get(name: String): MimeType?
