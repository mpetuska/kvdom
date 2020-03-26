package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
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
actual abstract external class Image actual constructor(width: Int, height: Int) : HTMLImageElement {
  actual override var onabort: ((Event) -> Dynamic)?
  actual override var onblur: ((FocusEvent) -> Dynamic)?
  actual override var oncancel: ((Event) -> Dynamic)?
  actual override var oncanplay: ((Event) -> Dynamic)?
  actual override var oncanplaythrough: ((Event) -> Dynamic)?
  actual override var onchange: ((Event) -> Dynamic)?
  actual override var onclick: ((MouseEvent) -> Dynamic)?
  actual override var onclose: ((Event) -> Dynamic)?
  actual override var oncontextmenu: ((MouseEvent) -> Dynamic)?
  actual override var oncuechange: ((Event) -> Dynamic)?
  actual override var ondblclick: ((MouseEvent) -> Dynamic)?
  actual override var ondrag: ((DragEvent) -> Dynamic)?
  actual override var ondragend: ((DragEvent) -> Dynamic)?
  actual override var ondragenter: ((DragEvent) -> Dynamic)?
  actual override var ondragexit: ((DragEvent) -> Dynamic)?
  actual override var ondragleave: ((DragEvent) -> Dynamic)?
  actual override var ondragover: ((DragEvent) -> Dynamic)?
  actual override var ondragstart: ((DragEvent) -> Dynamic)?
  actual override var ondrop: ((DragEvent) -> Dynamic)?
  actual override var ondurationchange: ((Event) -> Dynamic)?
  actual override var onemptied: ((Event) -> Dynamic)?
  actual override var onended: ((Event) -> Dynamic)?
  actual override var onerror: ((Dynamic, String, Int, Int, Any?) -> Dynamic)?
  actual override var onfocus: ((FocusEvent) -> Dynamic)?
  actual override var oninput: ((InputEvent) -> Dynamic)?
  actual override var oninvalid: ((Event) -> Dynamic)?
  actual override var onkeydown: ((KeyboardEvent) -> Dynamic)?
  actual override var onkeypress: ((KeyboardEvent) -> Dynamic)?
  actual override var onkeyup: ((KeyboardEvent) -> Dynamic)?
  actual override var onload: ((Event) -> Dynamic)?
  actual override var onloadeddata: ((Event) -> Dynamic)?
  actual override var onloadedmetadata: ((Event) -> Dynamic)?
  actual override var onloadend: ((Event) -> Dynamic)?
  actual override var onloadstart: ((ProgressEvent) -> Dynamic)?
  actual override var onmousedown: ((MouseEvent) -> Dynamic)?
  actual override var onmouseenter: ((MouseEvent) -> Dynamic)?
  actual override var onmouseleave: ((MouseEvent) -> Dynamic)?
  actual override var onmousemove: ((MouseEvent) -> Dynamic)?
  actual override var onmouseout: ((MouseEvent) -> Dynamic)?
  actual override var onmouseover: ((MouseEvent) -> Dynamic)?
  actual override var onmouseup: ((MouseEvent) -> Dynamic)?
  actual override var onwheel: ((WheelEvent) -> Dynamic)?
  actual override var onpause: ((Event) -> Dynamic)?
  actual override var onplay: ((Event) -> Dynamic)?
  actual override var onplaying: ((Event) -> Dynamic)?
  actual override var onprogress: ((ProgressEvent) -> Dynamic)?
  actual override var onratechange: ((Event) -> Dynamic)?
  actual override var onreset: ((Event) -> Dynamic)?
  actual override var onresize: ((Event) -> Dynamic)?
  actual override var onscroll: ((Event) -> Dynamic)?
  actual override var onseeked: ((Event) -> Dynamic)?
  actual override var onseeking: ((Event) -> Dynamic)?
  actual override var onselect: ((Event) -> Dynamic)?
  actual override var onshow: ((Event) -> Dynamic)?
  actual override var onstalled: ((Event) -> Dynamic)?
  actual override var onsubmit: ((Event) -> Dynamic)?
  actual override var onsuspend: ((Event) -> Dynamic)?
  actual override var ontimeupdate: ((Event) -> Dynamic)?
  actual override var ontoggle: ((Event) -> Dynamic)?
  actual override var onvolumechange: ((Event) -> Dynamic)?
  actual override var onwaiting: ((Event) -> Dynamic)?
  actual override var ongotpointercapture: ((PointerEvent) -> Dynamic)?
  actual override var onlostpointercapture: ((PointerEvent) -> Dynamic)?
  actual override var onpointerdown: ((PointerEvent) -> Dynamic)?
  actual override var onpointermove: ((PointerEvent) -> Dynamic)?
  actual override var onpointerup: ((PointerEvent) -> Dynamic)?
  actual override var onpointercancel: ((PointerEvent) -> Dynamic)?
  actual override var onpointerover: ((PointerEvent) -> Dynamic)?
  actual override var onpointerout: ((PointerEvent) -> Dynamic)?
  actual override var onpointerenter: ((PointerEvent) -> Dynamic)?
  actual override var onpointerleave: ((PointerEvent) -> Dynamic)?
  actual override var oncopy: ((ClipboardEvent) -> Dynamic)?
  actual override var oncut: ((ClipboardEvent) -> Dynamic)?
  actual override var onpaste: ((ClipboardEvent) -> Dynamic)?
  actual override var contentEditable: String
  actual override val isContentEditable: Boolean
  actual override val style: CSSStyleDeclaration
  actual override val children: HTMLCollection
  actual override val firstElementChild: Element?
  actual override val lastElementChild: Element?
  actual override val childElementCount: Int
  actual override val previousElementSibling: Element?
  actual override val nextElementSibling: Element?
  actual override val assignedSlot: HTMLSlotElement?
  actual override fun prepend(vararg nodes: Dynamic)
  actual override fun append(vararg nodes: Dynamic)
  actual override fun querySelector(selectors: String): Element?
  actual override fun querySelectorAll(selectors: String): NodeList
  actual override fun before(vararg nodes: Dynamic)
  actual override fun after(vararg nodes: Dynamic)
  actual override fun replaceWith(vararg nodes: Dynamic)
  actual override fun remove()
  actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
  actual override fun convertQuadFromNode(
    quad: Dynamic,
    from: Dynamic,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMQuad
  
  actual override fun convertRectFromNode(
    rect: DOMRectReadOnly,
    from: Dynamic,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMQuad
  
  actual override fun convertPointFromNode(
    point: DOMPointInit,
    from: Dynamic,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMPoint
  
  actual companion object {
    actual val ELEMENT_NODE: Short
    actual val ATTRIBUTE_NODE: Short
    actual val TEXT_NODE: Short
    actual val CDATA_SECTION_NODE: Short
    actual val ENTITY_REFERENCE_NODE: Short
    actual val ENTITY_NODE: Short
    actual val PROCESSING_INSTRUCTION_NODE: Short
    actual val COMMENT_NODE: Short
    actual val DOCUMENT_NODE: Short
    actual val DOCUMENT_TYPE_NODE: Short
    actual val DOCUMENT_FRAGMENT_NODE: Short
    actual val NOTATION_NODE: Short
    actual val DOCUMENT_POSITION_DISCONNECTED: Short
    actual val DOCUMENT_POSITION_PRECEDING: Short
    actual val DOCUMENT_POSITION_FOLLOWING: Short
    actual val DOCUMENT_POSITION_CONTAINS: Short
    actual val DOCUMENT_POSITION_CONTAINED_BY: Short
    actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}