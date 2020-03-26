package lt.petuska.kvdom.dom.w3c.dom

expect interface ItemArrayLike<out T> {
  val length: Int
  fun item(index: Int): T?
}

/**
 * Returns the view of this `ItemArrayLike<T>` collection as `List<T>`
 */
fun <T> ItemArrayLike<T>.asList(): List<T> = object : AbstractList<T>() {
  override val size: Int get() = this@asList.length
  
  @Suppress("UNCHECKED_CAST")
  override fun get(index: Int): T = when (index) {
    in 0..lastIndex -> this@asList.item(index) as T
    else -> throw IndexOutOfBoundsException("index $index is not in range [0..$lastIndex]")
  }
}