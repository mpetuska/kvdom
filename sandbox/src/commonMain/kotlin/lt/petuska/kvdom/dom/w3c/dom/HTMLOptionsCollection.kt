package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [HTMLOptionsCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLOptionsCollection) to Kotlin
 */
@NoWASM
expect abstract class HTMLOptionsCollection : HTMLCollection {
  override var length: Int
  open var selectedIndex: Int
  fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Dynamic = null)
  fun remove(index: Int)
}

@NoWASM
expect operator fun HTMLOptionsCollection.set(index: Int, option: HTMLOptionElement?)
