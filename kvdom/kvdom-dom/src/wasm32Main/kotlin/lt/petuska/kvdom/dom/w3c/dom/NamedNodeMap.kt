package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [NamedNodeMap](https://developer.mozilla.org/en/docs/Web/API/NamedNodeMap) to Kotlin
 */
actual abstract class NamedNodeMap actual constructor() :
  ItemArrayLike<Attr> {
  actual fun getNamedItemNS(namespace: String?, localName: String): Attr? {
    TODO("Not yet implemented")
  }
  
  actual fun setNamedItem(attr: Attr): Attr? {
    TODO("Not yet implemented")
  }
  
  actual fun setNamedItemNS(attr: Attr): Attr? {
    TODO("Not yet implemented")
  }
  
  actual fun removeNamedItem(qualifiedName: String): Attr {
    TODO("Not yet implemented")
  }
  
  actual fun removeNamedItemNS(namespace: String?, localName: String): Attr {
    TODO("Not yet implemented")
  }
  
  actual override fun item(index: Int): Attr? {
    TODO("Not yet implemented")
  }
  
  actual fun getNamedItem(qualifiedName: String): Attr? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun NamedNodeMap.get(index: Int): Attr? {
  TODO("Not yet implemented")
}

actual inline operator fun NamedNodeMap.get(qualifiedName: String): Attr? {
  TODO("Not yet implemented")
}