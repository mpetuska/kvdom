package lt.petuska.kvdom.dom.w3c.dom

actual external interface ItemArrayLike<out T> {
  actual val length: Int
  actual fun item(index: Int): T?
}