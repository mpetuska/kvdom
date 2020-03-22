package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

actual typealias DOMRectList = org.w3c.dom.DOMRectList

actual inline operator fun DOMRectList.get(index: Int): DOMRect? = get(index)