package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MimeTypeArray](https://developer.mozilla.org/en/docs/Web/API/MimeTypeArray) to Kotlin
 */
expect abstract class MimeTypeArray() :
  ItemArrayLike<MimeType> {
  override fun item(index: Int): MimeType?
  fun namedItem(name: String): MimeType?
}

expect inline operator fun MimeTypeArray.get(index: Int): MimeType?

expect inline operator fun MimeTypeArray.get(name: String): MimeType?
