package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

/**
 * Exposes the JavaScript [HTMLOptionsCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLOptionsCollection) to Kotlin
 */
actual abstract external class HTMLOptionsCollection : HTMLCollection {
  actual override var length: Int
  actual open var selectedIndex: Int
  actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Dynamic)
  actual fun remove(index: Int)
}

actual operator fun HTMLOptionsCollection.set(index: Int, option: HTMLOptionElement?) {
  asDynamic()[index] = option
}

