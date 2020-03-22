package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

/**
 * Exposes the JavaScript [NamedNodeMap](https://developer.mozilla.org/en/docs/Web/API/NamedNodeMap) to Kotlin
 */
actual typealias NamedNodeMap = org.w3c.dom.NamedNodeMap

actual inline operator fun NamedNodeMap.get(index: Int): Attr? = get(index)
actual inline operator fun NamedNodeMap.get(qualifiedName: String): Attr? = get(qualifiedName)