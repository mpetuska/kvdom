package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NamedNodeMap](https://developer.mozilla.org/en/docs/Web/API/NamedNodeMap) to Kotlin
 */
expect abstract class NamedNodeMap() :
  ItemArrayLike<Attr> {
  fun getNamedItemNS(namespace: String?, localName: String): Attr?
  fun setNamedItem(attr: Attr): Attr?
  fun setNamedItemNS(attr: Attr): Attr?
  fun removeNamedItem(qualifiedName: String): Attr
  fun removeNamedItemNS(namespace: String?, localName: String): Attr
  override fun item(index: Int): Attr?
  fun getNamedItem(qualifiedName: String): Attr?
}

expect inline operator fun NamedNodeMap.get(index: Int): Attr?

expect inline operator fun NamedNodeMap.get(qualifiedName: String): Attr?
