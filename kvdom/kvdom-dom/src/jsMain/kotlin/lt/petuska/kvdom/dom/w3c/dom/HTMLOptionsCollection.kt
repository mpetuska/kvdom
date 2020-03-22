package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.set

/**
 * Exposes the JavaScript [HTMLOptionsCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLOptionsCollection) to Kotlin
 */
actual typealias HTMLOptionsCollection = org.w3c.dom.HTMLOptionsCollection

actual inline operator fun HTMLOptionsCollection.set(
  index: Int,
  option: HTMLOptionElement?
) = set(index, option)

