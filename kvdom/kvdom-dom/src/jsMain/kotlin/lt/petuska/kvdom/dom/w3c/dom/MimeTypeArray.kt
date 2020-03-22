package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

/**
 * Exposes the JavaScript [MimeTypeArray](https://developer.mozilla.org/en/docs/Web/API/MimeTypeArray) to Kotlin
 */
actual typealias MimeTypeArray = org.w3c.dom.MimeTypeArray

actual inline operator fun MimeTypeArray.get(index: Int): MimeType? = get(index)
actual inline operator fun MimeTypeArray.get(name: String): MimeType? = get(name)