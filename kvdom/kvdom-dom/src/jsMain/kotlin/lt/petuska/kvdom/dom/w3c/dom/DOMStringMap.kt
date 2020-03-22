package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get
import org.w3c.dom.set

/**
 * Exposes the JavaScript [DOMStringMap](https://developer.mozilla.org/en/docs/Web/API/DOMStringMap) to Kotlin
 */
actual typealias DOMStringMap = org.w3c.dom.DOMStringMap

actual inline operator fun DOMStringMap.get(name: String): String? = get(name)
actual inline operator fun DOMStringMap.set(name: String, value: String) = set(name, value)