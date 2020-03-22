package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get
import org.w3c.dom.set

actual typealias HTMLSelectElement = org.w3c.dom.HTMLSelectElement

actual inline operator fun HTMLSelectElement.get(index: Int): Element? = get(index)
actual inline operator fun HTMLSelectElement.set(
  index: Int,
  option: HTMLOptionElement?
) = set(index, option)