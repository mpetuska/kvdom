package lt.petuska.kvdom.dom.w3c.dom

actual abstract class TouchList actual constructor() :
  ItemArrayLike<Touch> {
  actual override fun item(index: Int): Touch? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun TouchList.get(index: Int): Touch? {
  TODO("Not yet implemented")
}