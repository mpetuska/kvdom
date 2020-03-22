package lt.petuska.kvdom.dom.w3c.dom

actual interface DOMRectList :
  ItemArrayLike<DOMRect> {
  actual override fun item(index: Int): DOMRect?
}

actual inline operator fun DOMRectList.get(index: Int): DOMRect? {
  TODO("Not yet implemented")
}