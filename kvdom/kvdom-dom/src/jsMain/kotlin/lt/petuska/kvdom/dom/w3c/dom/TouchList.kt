package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

actual typealias TouchList = org.w3c.dom.TouchList

actual inline operator fun TouchList.get(index: Int): Touch? = get(index)