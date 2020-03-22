package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.clipboard.ClipboardEvent
import lt.petuska.kvdom.dom.w3c.dom.css.CSSStyleDeclaration
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.FocusEvent
import lt.petuska.kvdom.dom.w3c.dom.events.InputEvent
import lt.petuska.kvdom.dom.w3c.dom.events.KeyboardEvent
import lt.petuska.kvdom.dom.w3c.dom.events.MouseEvent
import lt.petuska.kvdom.dom.w3c.dom.events.WheelEvent
import lt.petuska.kvdom.dom.w3c.dom.pointerevents.PointerEvent
import lt.petuska.kvdom.dom.w3c.xhr.ProgressEvent

/**
 * Exposes the JavaScript [Option](https://developer.mozilla.org/en/docs/Web/API/Option) to Kotlin
 */
expect open class Option(text: String, value: String, defaultSelected: Boolean, selected: Boolean) :
  HTMLOptionElement {
  override var onabort: ((Event) -> Any)?
  override var onblur: ((FocusEvent) -> Any)?
  override var oncancel: ((Event) -> Any)?
  override var oncanplay: ((Event) -> Any)?
  override var oncanplaythrough: ((Event) -> Any)?
  override var onchange: ((Event) -> Any)?
  override var onclick: ((MouseEvent) -> Any)?
  override var onclose: ((Event) -> Any)?
  override var oncontextmenu: ((MouseEvent) -> Any)?
  override var oncuechange: ((Event) -> Any)?
  override var ondblclick: ((MouseEvent) -> Any)?
  override var ondrag: ((DragEvent) -> Any)?
  override var ondragend: ((DragEvent) -> Any)?
  override var ondragenter: ((DragEvent) -> Any)?
  override var ondragexit: ((DragEvent) -> Any)?
  override var ondragleave: ((DragEvent) -> Any)?
  override var ondragover: ((DragEvent) -> Any)?
  override var ondragstart: ((DragEvent) -> Any)?
  override var ondrop: ((DragEvent) -> Any)?
  override var ondurationchange: ((Event) -> Any)?
  override var onemptied: ((Event) -> Any)?
  override var onended: ((Event) -> Any)?
  override var onerror: ((Any, String, Int, Int, Any?) -> Any)?
  override var onfocus: ((FocusEvent) -> Any)?
  override var oninput: ((InputEvent) -> Any)?
  override var oninvalid: ((Event) -> Any)?
  override var onkeydown: ((KeyboardEvent) -> Any)?
  override var onkeypress: ((KeyboardEvent) -> Any)?
  override var onkeyup: ((KeyboardEvent) -> Any)?
  override var onload: ((Event) -> Any)?
  override var onloadeddata: ((Event) -> Any)?
  override var onloadedmetadata: ((Event) -> Any)?
  override var onloadend: ((Event) -> Any)?
  override var onloadstart: ((ProgressEvent) -> Any)?
  override var onmousedown: ((MouseEvent) -> Any)?
  override var onmouseenter: ((MouseEvent) -> Any)?
  override var onmouseleave: ((MouseEvent) -> Any)?
  override var onmousemove: ((MouseEvent) -> Any)?
  override var onmouseout: ((MouseEvent) -> Any)?
  override var onmouseover: ((MouseEvent) -> Any)?
  override var onmouseup: ((MouseEvent) -> Any)?
  override var onwheel: ((WheelEvent) -> Any)?
  override var onpause: ((Event) -> Any)?
  override var onplay: ((Event) -> Any)?
  override var onplaying: ((Event) -> Any)?
  override var onprogress: ((ProgressEvent) -> Any)?
  override var onratechange: ((Event) -> Any)?
  override var onreset: ((Event) -> Any)?
  override var onresize: ((Event) -> Any)?
  override var onscroll: ((Event) -> Any)?
  override var onseeked: ((Event) -> Any)?
  override var onseeking: ((Event) -> Any)?
  override var onselect: ((Event) -> Any)?
  override var onshow: ((Event) -> Any)?
  override var onstalled: ((Event) -> Any)?
  override var onsubmit: ((Event) -> Any)?
  override var onsuspend: ((Event) -> Any)?
  override var ontimeupdate: ((Event) -> Any)?
  override var ontoggle: ((Event) -> Any)?
  override var onvolumechange: ((Event) -> Any)?
  override var onwaiting: ((Event) -> Any)?
  override var ongotpointercapture: ((PointerEvent) -> Any)?
  override var onlostpointercapture: ((PointerEvent) -> Any)?
  override var onpointerdown: ((PointerEvent) -> Any)?
  override var onpointermove: ((PointerEvent) -> Any)?
  override var onpointerup: ((PointerEvent) -> Any)?
  override var onpointercancel: ((PointerEvent) -> Any)?
  override var onpointerover: ((PointerEvent) -> Any)?
  override var onpointerout: ((PointerEvent) -> Any)?
  override var onpointerenter: ((PointerEvent) -> Any)?
  override var onpointerleave: ((PointerEvent) -> Any)?
  override var oncopy: ((ClipboardEvent) -> Any)?
  override var oncut: ((ClipboardEvent) -> Any)?
  override var onpaste: ((ClipboardEvent) -> Any)?
  override var contentEditable: String
  override val isContentEditable: Boolean
  override val style: CSSStyleDeclaration
  override val children: HTMLCollection
  override val firstElementChild: Element?
  override val lastElementChild: Element?
  override val childElementCount: Int
  override val previousElementSibling: Element?
  override val nextElementSibling: Element?
  override val assignedSlot: HTMLSlotElement?
  override fun prepend(vararg nodes: Any)
  override fun append(vararg nodes: Any)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
  override fun before(vararg nodes: Any)
  override fun after(vararg nodes: Any)
  override fun replaceWith(vararg nodes: Any)
  override fun remove()
  override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
  override fun convertQuadFromNode(
    quad: Any,
    from: Any,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMQuad
  
  override fun convertRectFromNode(
    rect: DOMRectReadOnly,
    from: Any,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMQuad
  
  override fun convertPointFromNode(
    point: DOMPointInit,
    from: Any,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMPoint
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}