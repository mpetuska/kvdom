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
actual abstract external class Image actual constructor(width: Int, height: Int) : HTMLImageElement {
  actual override var onabort: ((Event) -> Dynamic)? = TODO()
  actual override var onblur: ((FocusEvent) -> Dynamic)? = TODO()
  actual override var oncancel: ((Event) -> Dynamic)? = TODO()
  actual override var oncanplay: ((Event) -> Dynamic)? = TODO()
  actual override var oncanplaythrough: ((Event) -> Dynamic)? = TODO()
  actual override var onchange: ((Event) -> Dynamic)? = TODO()
  actual override var onclick: ((MouseEvent) -> Dynamic)? = TODO()
  actual override var onclose: ((Event) -> Dynamic)? = TODO()
  actual override var oncontextmenu: ((MouseEvent) -> Dynamic)? = TODO()
  actual override var oncuechange: ((Event) -> Dynamic)? = TODO()
  actual override var ondblclick: ((MouseEvent) -> Dynamic)? = TODO()
  actual override var ondrag: ((DragEvent) -> Dynamic)? = TODO()
  actual override var ondragend: ((DragEvent) -> Dynamic)? = TODO()
  actual override var ondragenter: ((DragEvent) -> Dynamic)? = TODO()
  actual override var ondragexit: ((DragEvent) -> Dynamic)? = TODO()
  actual override var ondragleave: ((DragEvent) -> Dynamic)? = TODO()
  actual override var ondragover: ((DragEvent) -> Dynamic)? = TODO()
  actual override var ondragstart: ((DragEvent) -> Dynamic)? = TODO()
  actual override var ondrop: ((DragEvent) -> Dynamic)? = TODO()
  actual override var ondurationchange: ((Event) -> Dynamic)? = TODO()
  actual override var onemptied: ((Event) -> Dynamic)? = TODO()
  actual override var onended: ((Event) -> Dynamic)? = TODO()
  actual override var onerror: ((Dynamic, String, Int, Int, Any?) -> Dynamic)? = TODO()
  actual override var onfocus: ((FocusEvent) -> Dynamic)? = TODO()
  actual override var oninput: ((InputEvent) -> Dynamic)? = TODO()
  actual override var oninvalid: ((Event) -> Dynamic)? = TODO()
  actual override var onkeydown: ((KeyboardEvent) -> Dynamic)? = TODO()
  actual override var onkeypress: ((KeyboardEvent) -> Dynamic)? = TODO()
  actual override var onkeyup: ((KeyboardEvent) -> Dynamic)? = TODO()
  actual override var onload: ((Event) -> Dynamic)? = TODO()
  actual override var onloadeddata: ((Event) -> Dynamic)? = TODO()
  actual override var onloadedmetadata: ((Event) -> Dynamic)? = TODO()
  actual override var onloadend: ((Event) -> Dynamic)? = TODO()
  actual override var onloadstart: ((ProgressEvent) -> Dynamic)? = TODO()
  actual override var onmousedown: ((MouseEvent) -> Dynamic)? = TODO()
  actual override var onmouseenter: ((MouseEvent) -> Dynamic)? = TODO()
  actual override var onmouseleave: ((MouseEvent) -> Dynamic)? = TODO()
  actual override var onmousemove: ((MouseEvent) -> Dynamic)? = TODO()
  actual override var onmouseout: ((MouseEvent) -> Dynamic)? = TODO()
  actual override var onmouseover: ((MouseEvent) -> Dynamic)? = TODO()
  actual override var onmouseup: ((MouseEvent) -> Dynamic)? = TODO()
  actual override var onwheel: ((WheelEvent) -> Dynamic)? = TODO()
  actual override var onpause: ((Event) -> Dynamic)? = TODO()
  actual override var onplay: ((Event) -> Dynamic)? = TODO()
  actual override var onplaying: ((Event) -> Dynamic)? = TODO()
  actual override var onprogress: ((ProgressEvent) -> Dynamic)? = TODO()
  actual override var onratechange: ((Event) -> Dynamic)? = TODO()
  actual override var onreset: ((Event) -> Dynamic)? = TODO()
  actual override var onresize: ((Event) -> Dynamic)? = TODO()
  actual override var onscroll: ((Event) -> Dynamic)? = TODO()
  actual override var onseeked: ((Event) -> Dynamic)? = TODO()
  actual override var onseeking: ((Event) -> Dynamic)? = TODO()
  actual override var onselect: ((Event) -> Dynamic)? = TODO()
  actual override var onshow: ((Event) -> Dynamic)? = TODO()
  actual override var onstalled: ((Event) -> Dynamic)? = TODO()
  actual override var onsubmit: ((Event) -> Dynamic)? = TODO()
  actual override var onsuspend: ((Event) -> Dynamic)? = TODO()
  actual override var ontimeupdate: ((Event) -> Dynamic)? = TODO()
  actual override var ontoggle: ((Event) -> Dynamic)? = TODO()
  actual override var onvolumechange: ((Event) -> Dynamic)? = TODO()
  actual override var onwaiting: ((Event) -> Dynamic)? = TODO()
  actual override var ongotpointercapture: ((PointerEvent) -> Dynamic)? = TODO()
  actual override var onlostpointercapture: ((PointerEvent) -> Dynamic)? = TODO()
  actual override var onpointerdown: ((PointerEvent) -> Dynamic)? = TODO()
  actual override var onpointermove: ((PointerEvent) -> Dynamic)? = TODO()
  actual override var onpointerup: ((PointerEvent) -> Dynamic)? = TODO()
  actual override var onpointercancel: ((PointerEvent) -> Dynamic)? = TODO()
  actual override var onpointerover: ((PointerEvent) -> Dynamic)? = TODO()
  actual override var onpointerout: ((PointerEvent) -> Dynamic)? = TODO()
  actual override var onpointerenter: ((PointerEvent) -> Dynamic)? = TODO()
  actual override var onpointerleave: ((PointerEvent) -> Dynamic)? = TODO()
  actual override var oncopy: ((ClipboardEvent) -> Dynamic)? = TODO()
  actual override var oncut: ((ClipboardEvent) -> Dynamic)? = TODO()
  actual override var onpaste: ((ClipboardEvent) -> Dynamic)? = TODO()
  actual override var contentEditable: String = TODO()
  actual override val isContentEditable: Boolean = TODO()
  actual override val style: CSSStyleDeclaration = TODO()
  actual override val children: HTMLCollection = TODO()
  actual override val firstElementChild: Element? = TODO()
  actual override val lastElementChild: Element? = TODO()
  actual override val childElementCount: Int = TODO()
  actual override val previousElementSibling: Element? = TODO()
  actual override val nextElementSibling: Element? = TODO()
  actual override val assignedSlot: HTMLSlotElement? = TODO()
  actual override fun prepend(vararg nodes: Dynamic) {
    TODO()
  }
  
  actual override fun append(vararg nodes: Dynamic) {
    TODO()
  }
  
  actual override fun querySelector(selectors: String): Element? {
    TODO()
  }
  
  actual override fun querySelectorAll(selectors: String): NodeList {
    TODO()
  }
  
  actual override fun before(vararg nodes: Dynamic) {
    TODO()
  }
  
  actual override fun after(vararg nodes: Dynamic) {
    TODO()
  }
  
  actual override fun replaceWith(vararg nodes: Dynamic) {
    TODO()
  }
  
  actual override fun remove() {
    TODO()
  }
  
  actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad> {
    TODO()
  }
  
  actual override fun convertQuadFromNode(
    quad: Dynamic,
    from: Dynamic,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMQuad {
    TODO()
  }
  
  actual override fun convertRectFromNode(
    rect: DOMRectReadOnly,
    from: Dynamic,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMQuad {
    TODO()
  }
  
  actual override fun convertPointFromNode(
    point: DOMPointInit,
    from: Dynamic,
    options: ConvertCoordinateOptions /* = definedExternally */
  ): DOMPoint {
    TODO()
  }
  
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