package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM

@NoWASM
actual abstract class HTMLOptionsCollection : HTMLCollection() {
  actual override var length: Int
    get() {
      TODO("Not yet implemented")
    }
    set(value) {}
  actual open var selectedIndex: Int
    get() {
      TODO("Not yet implemented")
    }
    set(value) {
      TODO("Not yet implemented")
    }
  
  actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Dynamic) {
    TODO("Not yet implemented")
  }
  
  actual fun remove(index: Int) {
    TODO("Not yet implemented")
  }
}

@NoWASM
actual operator fun HTMLOptionsCollection.set(index: Int, option: HTMLOptionElement?) {
  TODO("Not yet implemented")
}

