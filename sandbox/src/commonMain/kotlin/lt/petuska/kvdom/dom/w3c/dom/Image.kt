package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
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
 * Exposes the JavaScript [Image](https://developer.mozilla.org/en/docs/Web/API/Image) to Kotlin
 */
@NoWASM
expect abstract class Image(width: Int, height: Int) : HTMLImageElement {
  override var onabort: ((Event) -> Dynamic)?
  override var onblur: ((FocusEvent) -> Dynamic)?
  override var oncancel: ((Event) -> Dynamic)?
  override var oncanplay: ((Event) -> Dynamic)?
  override var oncanplaythrough: ((Event) -> Dynamic)?
  override var onchange: ((Event) -> Dynamic)?
  override var onclick: ((MouseEvent) -> Dynamic)?
  override var onclose: ((Event) -> Dynamic)?
  override var oncontextmenu: ((MouseEvent) -> Dynamic)?
  override var oncuechange: ((Event) -> Dynamic)?
  override var ondblclick: ((MouseEvent) -> Dynamic)?
  override var ondrag: ((DragEvent) -> Dynamic)?
  override var ondragend: ((DragEvent) -> Dynamic)?
  override var ondragenter: ((DragEvent) -> Dynamic)?
  override var ondragexit: ((DragEvent) -> Dynamic)?
  override var ondragleave: ((DragEvent) -> Dynamic)?
  override var ondragover: ((DragEvent) -> Dynamic)?
  override var ondragstart: ((DragEvent) -> Dynamic)?
  override var ondrop: ((DragEvent) -> Dynamic)?
  override var ondurationchange: ((Event) -> Dynamic)?
  override var onemptied: ((Event) -> Dynamic)?
  override var onended: ((Event) -> Dynamic)?
  override var onerror: ((Dynamic, String, Int, Int, Any?) -> Dynamic)?
  override var onfocus: ((FocusEvent) -> Dynamic)?
  override var oninput: ((InputEvent) -> Dynamic)?
  override var oninvalid: ((Event) -> Dynamic)?
  override var onkeydown: ((KeyboardEvent) -> Dynamic)?
  override var onkeypress: ((KeyboardEvent) -> Dynamic)?
  override var onkeyup: ((KeyboardEvent) -> Dynamic)?
  override var onload: ((Event) -> Dynamic)?
  override var onloadeddata: ((Event) -> Dynamic)?
  override var onloadedmetadata: ((Event) -> Dynamic)?
  override var onloadend: ((Event) -> Dynamic)?
  override var onloadstart: ((ProgressEvent) -> Dynamic)?
  override var onmousedown: ((MouseEvent) -> Dynamic)?
  override var onmouseenter: ((MouseEvent) -> Dynamic)?
  override var onmouseleave: ((MouseEvent) -> Dynamic)?
  override var onmousemove: ((MouseEvent) -> Dynamic)?
  override var onmouseout: ((MouseEvent) -> Dynamic)?
  override var onmouseover: ((MouseEvent) -> Dynamic)?
  override var onmouseup: ((MouseEvent) -> Dynamic)?
  override var onwheel: ((WheelEvent) -> Dynamic)?
  override var onpause: ((Event) -> Dynamic)?
  override var onplay: ((Event) -> Dynamic)?
  override var onplaying: ((Event) -> Dynamic)?
  override var onprogress: ((ProgressEvent) -> Dynamic)?
  override var onratechange: ((Event) -> Dynamic)?
  override var onreset: ((Event) -> Dynamic)?
  override var onresize: ((Event) -> Dynamic)?
  override var onscroll: ((Event) -> Dynamic)?
  override var onseeked: ((Event) -> Dynamic)?
  override var onseeking: ((Event) -> Dynamic)?
  override var onselect: ((Event) -> Dynamic)?
  override var onshow: ((Event) -> Dynamic)?
  override var onstalled: ((Event) -> Dynamic)?
  override var onsubmit: ((Event) -> Dynamic)?
  override var onsuspend: ((Event) -> Dynamic)?
  override var ontimeupdate: ((Event) -> Dynamic)?
  override var ontoggle: ((Event) -> Dynamic)?
  override var onvolumechange: ((Event) -> Dynamic)?
  override var onwaiting: ((Event) -> Dynamic)?
  override var ongotpointercapture: ((PointerEvent) -> Dynamic)?
  override var onlostpointercapture: ((PointerEvent) -> Dynamic)?
  override var onpointerdown: ((PointerEvent) -> Dynamic)?
  override var onpointermove: ((PointerEvent) -> Dynamic)?
  override var onpointerup: ((PointerEvent) -> Dynamic)?
  override var onpointercancel: ((PointerEvent) -> Dynamic)?
  override var onpointerover: ((PointerEvent) -> Dynamic)?
  override var onpointerout: ((PointerEvent) -> Dynamic)?
  override var onpointerenter: ((PointerEvent) -> Dynamic)?
  override var onpointerleave: ((PointerEvent) -> Dynamic)?
  override var oncopy: ((ClipboardEvent) -> Dynamic)?
  override var oncut: ((ClipboardEvent) -> Dynamic)?
  override var onpaste: ((ClipboardEvent) -> Dynamic)?
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
  override fun prepend(vararg nodes: Dynamic)
  override fun append(vararg nodes: Dynamic)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
  override fun before(vararg nodes: Dynamic)
  override fun after(vararg nodes: Dynamic)
  override fun replaceWith(vararg nodes: Dynamic)
  override fun remove()
  override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
  override fun convertQuadFromNode(
    quad: Dynamic,
    from: Dynamic,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMQuad
  
  override fun convertRectFromNode(
    rect: DOMRectReadOnly,
    from: Dynamic,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMQuad
  
  override fun convertPointFromNode(
    point: DOMPointInit,
    from: Dynamic,
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