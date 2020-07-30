//package kotlinx.html
//
//import lt.petuska.kvdom.dom.Event
//
//interface CommonAttributeGroupFacade : Tag
//
//interface TagConsumer<out R> {
//  fun onTagStart(tag: Tag)
//  fun onTagAttributeChange(tag: Tag, attribute: String, value: String?)
//  fun onTagEvent(tag: Tag, event: String, value: (Event) -> Unit)
//  fun onTagEnd(tag: Tag)
//  fun onTagContent(content: CharSequence)
//  fun onTagContentEntity(entity: Entities)
//  fun onTagContentUnsafe(block: Unsafe.() -> Unit)
//  fun onTagComment(content: CharSequence)
//  fun onTagError(tag: Tag, exception: Throwable): Unit = throw exception
//  fun finalize(): R
//}
//
//@HtmlTagMarker
//interface Tag {
//  val tagName: String
//  val consumer: TagConsumer<*>
//  val namespace: String?
//
//  val attributes: MutableMap<String, String>
//  val attributesEntries: Collection<Map.Entry<String, String>>
//
//  val inlineTag: Boolean
//  val emptyTag: Boolean
//
//  operator fun Entities.unaryPlus() {
//    entity(this)
//  }
//
//  operator fun String.unaryPlus() {
//    text(this)
//  }
//
//  fun text(s: String) {
//    consumer.onTagContent(s)
//  }
//
//  fun text(n: Number) {
//    text(n.toString())
//  }
//
//  fun entity(e: Entities) {
//    consumer.onTagContentEntity(e)
//  }
//
//  fun comment(s: String) {
//    consumer.onTagComment(s)
//  }
//}
