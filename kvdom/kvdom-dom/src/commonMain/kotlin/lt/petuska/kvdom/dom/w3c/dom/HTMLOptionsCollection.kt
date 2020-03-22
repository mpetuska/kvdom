package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLOptionsCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLOptionsCollection) to Kotlin
 */
expect abstract class HTMLOptionsCollection() : HTMLCollection {
  open var selectedIndex: Int
  fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Any)
  fun remove(index: Int)
}

expect inline operator fun HTMLOptionsCollection.set(index: Int, option: HTMLOptionElement?)