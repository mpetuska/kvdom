package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

/**
 * Exposes the JavaScript [PluginArray](https://developer.mozilla.org/en/docs/Web/API/PluginArray) to Kotlin
 */
actual typealias PluginArray = org.w3c.dom.PluginArray

actual inline operator fun PluginArray.get(index: Int): Plugin? = get(index)
actual inline operator fun PluginArray.get(name: String): Plugin? = get(name)