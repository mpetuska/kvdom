package lt.petuska.kvdom.dom.w3c.dom

expect interface DOMRectList :
  ItemArrayLike<DOMRect> {
  override fun item(index: Int): DOMRect?
}

expect inline operator fun DOMRectList.get(index: Int): DOMRect?
