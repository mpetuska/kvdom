package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

/**
 * Exposes the JavaScript [HTMLFormElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFormElement) to Kotlin
 */
actual typealias HTMLFormElement = org.w3c.dom.HTMLFormElement

actual inline operator fun HTMLFormElement.get(index: Int): Element? = get(index)
actual inline operator fun HTMLFormElement.get(name: String): UnionElementOrRadioNodeList? = get(name)