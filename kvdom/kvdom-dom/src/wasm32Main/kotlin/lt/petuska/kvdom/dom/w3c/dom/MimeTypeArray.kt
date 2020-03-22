package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MimeTypeArray](https://developer.mozilla.org/en/docs/Web/API/MimeTypeArray) to Kotlin
 */
actual abstract class MimeTypeArray actual constructor() :
  ItemArrayLike<MimeType> {
  actual override fun item(index: Int): MimeType? {
    TODO("Not yet implemented")
  }
  
  actual fun namedItem(name: String): MimeType? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun MimeTypeArray.get(index: Int): MimeType? {
  TODO("Not yet implemented")
}

actual inline operator fun MimeTypeArray.get(name: String): MimeType? {
  TODO("Not yet implemented")
}