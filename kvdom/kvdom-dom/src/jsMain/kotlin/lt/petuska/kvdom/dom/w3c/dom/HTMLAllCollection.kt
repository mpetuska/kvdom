package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

actual typealias HTMLAllCollection = org.w3c.dom.HTMLAllCollection

actual inline operator fun HTMLAllCollection.get(index: Int): Element? = get(index)
actual inline operator fun HTMLAllCollection.get(name: String): UnionElementOrHTMLCollection? = get(name)