package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [ParentNode](https://developer.mozilla.org/en/docs/Web/API/ParentNode) to Kotlin
 */
@NoWASM
expect interface ParentNode {
  val children: HTMLCollection
  val firstElementChild: Element?
  
  //    get() = definedExternally
  val lastElementChild: Element?
  
  //    get() = definedExternally
  val childElementCount: Int
  fun prepend(vararg nodes: Dynamic)
  fun append(vararg nodes: Dynamic)
  fun querySelector(selectors: String): Element?
  fun querySelectorAll(selectors: String): NodeList
}