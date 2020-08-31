@file:Suppress("FunctionName")

package lt.petuska.kvdom.dsl

import kotlinx.html.*
import lt.petuska.kvdom.core.domain.*
import lt.petuska.kvdom.core.module.events.*
import lt.petuska.kvdom.dom.*
import lt.petuska.kvdom.dom.Event
import lt.petuska.kvdom.dom.html.*

public typealias KBuilder = KVDOMBuilder<*>

public inline fun <T : Element> KVDOMBuilder(root: VBuilder<T>, crossinline block: KVDOMBuilder<T>.() -> Unit): VElement<T> {
  val builder = KVDOMBuilder(root)
  builder.apply(block)
  val vBuilder = builder.finalize()
  return vBuilder.build()
}

public inline fun KVDOMBuilder(crossinline block: KVDOMBuilder<HTMLDivElement>.() -> Unit): VElement<HTMLDivElement> =
  KVDOMBuilder(element("div"), block)

public class KVDOMBuilder<T : Element> @PublishedApi internal constructor(private val root: VBuilder<T>) :
  TagConsumer<VBuilder<T>, Event> {
  private val path = arrayListOf<VBuilder<*>>(root)

  override fun onTagStart(tag: Tag<Event>) {
    val vElement: VBuilder<*> = VBuilder<Element>(
      tag = tag.tagName,
      ns = tag.namespace,
      attrs = tag.attributes,
    )

    path.lastOrNull()?.children?.add(vElement)
    path.add(vElement)
  }

  override fun onTagAttributeChange(tag: Tag<Event>, attribute: String, value: String?) {
    when {
      path.isEmpty() -> throw IllegalStateException("No current tag")
      path.last().tag.toLowerCase() != tag.tagName.toLowerCase() -> throw IllegalStateException("Wrong current tag")
      else -> path.last().let { node ->
        if (value == null) {
          node.attrs.remove(attribute)
        } else {
          node.attrs[attribute] = value
        }
      }
    }
  }

  override fun onTagEvent(tag: Tag<Event>, event: String, value: (Event) -> Unit) {
    when {
      path.isEmpty() -> throw IllegalStateException("No current tag")
      path.last().tag.toLowerCase() != tag.tagName.toLowerCase() -> throw IllegalStateException("Wrong current tag")
      else -> path.last().apply {
        on(event.removePrefix("on"), value)
      }
    }
  }

  override fun onTagEnd(tag: Tag<Event>) {
    if (path.isEmpty() || path.last().tag.toLowerCase() != tag.tagName.toLowerCase()) {
      throw IllegalStateException("We haven't entered tag ${tag.tagName} but trying to leave")
    }

    path.removeAt(path.lastIndex)
  }

  override fun onTagContent(content: CharSequence) {
    if (path.isEmpty()) {
      throw IllegalStateException("No current DOM node")
    }

    path.last().textContent = content.toString()
  }

  override fun onTagContentEntity(entity: Entities) {
    throw UnsupportedOperationException("innerHTML manipulation not supported")
//    if (path.isEmpty()) {
//      throw IllegalStateException("No current DOM node")
//    }
//
//    // stupid hack as browsers doesn't support createEntityReference
//    val s = document.createElement("span") as HTMLElement
//    s.innerHTML = entity.text
//    path.last().appendChild(s.childNodes.asList().filter { it.nodeType == Node.TEXT_NODE }.first())

    // other solution would be
//        pathLast().innerHTML += entity.text
  }

  override fun onTagContentUnsafe(block: Unsafe.() -> Unit) {
    throw UnsupportedOperationException("innerHTML manipulation not supported")
//    with(DefaultUnsafe()) {
//      block()
//
//      path.last().innerHTML += toString()
//    }
  }

  override fun onTagComment(content: CharSequence) {
    throw UnsupportedOperationException("comments not supported")
//    if (path.isEmpty()) {
//      throw IllegalStateException("No current DOM node")
//    }
//
//    path.last().appendChild(document.createComment(content.toString()))
  }

  override fun finalize(): VBuilder<T> {
    return if (path.size != 1 || path.last() != root) {
      throw IllegalStateException("Unclosed tags detected!")
    } else {
      root
    }
  }

  override fun onTagError(tag: Tag<Event>, exception: Throwable): Unit = throw exception
}
