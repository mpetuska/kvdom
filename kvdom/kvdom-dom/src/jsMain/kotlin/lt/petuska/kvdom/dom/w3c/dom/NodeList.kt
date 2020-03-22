package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

/**
 * Exposes the JavaScript [NodeList](https://developer.mozilla.org/en/docs/Web/API/NodeList) to Kotlin
 */
actual typealias NodeList = org.w3c.dom.NodeList

actual inline operator fun NodeList.get(index: Int): Node? = get(index)
actual inline operator fun HTMLCollection.get(index: Int): Element? = get(index)
actual inline operator fun HTMLCollection.get(name: String): Element? = get(name)