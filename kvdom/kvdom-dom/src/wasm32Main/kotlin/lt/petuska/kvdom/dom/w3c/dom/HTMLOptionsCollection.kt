package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLOptionsCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLOptionsCollection) to Kotlin
 */
actual abstract class HTMLOptionsCollection actual constructor() : HTMLCollection() {
  actual open var selectedIndex: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun add(
    element: UnionHTMLOptGroupElementOrHTMLOptionElement,
    before: Any
  ) {
  }
  
  actual fun remove(index: Int) {
  }
}

actual inline operator fun HTMLOptionsCollection.set(
  index: Int,
  option: HTMLOptionElement?
) {
}

