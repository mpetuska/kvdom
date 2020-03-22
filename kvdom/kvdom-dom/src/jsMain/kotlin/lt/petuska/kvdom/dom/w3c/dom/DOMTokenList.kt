package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

/**
 * Exposes the JavaScript [DOMTokenList](https://developer.mozilla.org/en/docs/Web/API/DOMTokenList) to Kotlin
 */
actual typealias DOMTokenList = org.w3c.dom.DOMTokenList

actual inline operator fun DOMTokenList.get(index: Int): String? = get(index)