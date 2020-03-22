package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

/**
 * Exposes the JavaScript [Plugin](https://developer.mozilla.org/en/docs/Web/API/Plugin) to Kotlin
 */
actual typealias Plugin = org.w3c.dom.Plugin

actual inline operator fun Plugin.get(index: Int): MimeType? = get(index)
actual inline operator fun Plugin.get(name: String): MimeType? = get(name)