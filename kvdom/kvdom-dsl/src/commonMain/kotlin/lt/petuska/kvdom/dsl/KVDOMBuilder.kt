package lt.petuska.kvdom.dsl

import kotlinx.html.Entities
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.Unsafe
import lt.petuska.kvdom.core.domain.VBuilder
import lt.petuska.kvdom.core.domain.VElement
import lt.petuska.kvdom.core.domain.element
import lt.petuska.kvdom.core.module.events.on
import lt.petuska.kvdom.dom.Element
import lt.petuska.kvdom.dom.EventHandler
import lt.petuska.kvdom.dom.html.HTMLDivElement
import org.w3c.dom.events.Event as W3CEvent

inline fun <T : Element> KVDOMBuilder(root: VBuilder<T>, crossinline block: KVDOMBuilder<T>.() -> Unit): VElement<T> {
  val builder = KVDOMBuilder(root)
  builder.apply(block)
  val vBuilder = builder.finalize()
  return vBuilder.build()
}

inline fun KVDOMBuilder(crossinline block: KVDOMBuilder<HTMLDivElement>.() -> Unit) =
  KVDOMBuilder(element("div"), block)

class KVDOMBuilder<T : Element> @PublishedApi internal constructor(private val root: VBuilder<T>) :
  TagConsumer<VBuilder<T>> {
  private val path = arrayListOf<VBuilder<*>>(root)
  
  override fun onTagStart(tag: Tag) {
    val vElement: VBuilder<*> = VBuilder<Element>(
      tag = tag.tagName,
      ns = tag.namespace,
      attrs = tag.attributes,
    )
    
    path.lastOrNull()?.children?.add(vElement)
    path.add(vElement)
  }
  
  override fun onTagAttributeChange(tag: Tag, attribute: String, value: String?) {
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
  
  override fun onTagEvent(tag: Tag, event: String, value: (W3CEvent) -> Unit) {
    when {
      path.isEmpty() -> throw IllegalStateException("No current tag")
      path.last().tag.toLowerCase() != tag.tagName.toLowerCase() -> throw IllegalStateException("Wrong current tag")
      else -> path.last().apply {
        val wrapped: EventHandler = {
          val w = object : W3CEvent {
            override fun initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean) =
              it.initEvent(eventTypeArg, canBubbleArg, cancelableArg)
            
            override fun preventDefault() = it.preventDefault()
            
            override fun stopPropagation() = it.stopPropagation()
          }
          value(w)
        }
        on(event.removePrefix("on"), wrapped)
      }
    }
  }
  
  override fun onTagEnd(tag: Tag) {
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
}
