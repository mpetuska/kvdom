package lt.petuska.kvdom.dom.w3c.dom

expect abstract class TouchList() :
  ItemArrayLike<Touch> {
  override fun item(index: Int): Touch?
}

expect inline operator fun TouchList.get(index: Int): Touch?
