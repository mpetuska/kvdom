package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get
import org.w3c.dom.set

/**
 * Exposes the JavaScript [Storage](https://developer.mozilla.org/en/docs/Web/API/Storage) to Kotlin
 */
actual typealias Storage = org.w3c.dom.Storage

actual inline operator fun Storage.get(key: String): String? = get(key)
actual inline operator fun Storage.set(key: String, value: String) = set(key, value)