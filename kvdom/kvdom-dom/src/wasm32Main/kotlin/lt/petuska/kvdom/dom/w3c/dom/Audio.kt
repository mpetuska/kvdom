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

actual open class Audio actual constructor(src: String) :
  HTMLAudioElement() {
  actual override var onabort: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onblur: ((FocusEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var oncancel: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var oncanplay: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var oncanplaythrough: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onchange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onclick: ((MouseEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onclose: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var oncontextmenu: ((MouseEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var oncuechange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ondblclick: ((MouseEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ondrag: ((DragEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ondragend: ((DragEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ondragenter: ((DragEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ondragexit: ((DragEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ondragleave: ((DragEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ondragover: ((DragEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ondragstart: ((DragEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ondrop: ((DragEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ondurationchange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onemptied: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onended: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onerror: ((Any, String, Int, Int, Any?) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onfocus: ((FocusEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var oninput: ((InputEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var oninvalid: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onkeydown: ((KeyboardEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onkeypress: ((KeyboardEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onkeyup: ((KeyboardEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onload: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onloadeddata: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onloadedmetadata: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onloadend: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onloadstart: ((ProgressEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onmousedown: ((MouseEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onmouseenter: ((MouseEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onmouseleave: ((MouseEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onmousemove: ((MouseEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onmouseout: ((MouseEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onmouseover: ((MouseEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onmouseup: ((MouseEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onwheel: ((WheelEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onpause: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onplay: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onplaying: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onprogress: ((ProgressEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onratechange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onreset: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onresize: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onscroll: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onseeked: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onseeking: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onselect: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onshow: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onstalled: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onsubmit: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onsuspend: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ontimeupdate: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ontoggle: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onvolumechange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onwaiting: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var ongotpointercapture: ((PointerEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onlostpointercapture: ((PointerEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onpointerdown: ((PointerEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onpointermove: ((PointerEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onpointerup: ((PointerEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onpointercancel: ((PointerEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onpointerover: ((PointerEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onpointerout: ((PointerEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onpointerenter: ((PointerEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onpointerleave: ((PointerEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var oncopy: ((ClipboardEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var oncut: ((ClipboardEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var onpaste: ((ClipboardEvent) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override var contentEditable: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual override val isContentEditable: Boolean
    get() = TODO("Not yet implemented")
  actual override val style: CSSStyleDeclaration
    get() = TODO("Not yet implemented")
  actual override val children: HTMLCollection
    get() = TODO("Not yet implemented")
  actual override val firstElementChild: Element?
    get() = TODO("Not yet implemented")
  actual override val lastElementChild: Element?
    get() = TODO("Not yet implemented")
  actual override val childElementCount: Int
    get() = TODO("Not yet implemented")
  actual override val previousElementSibling: Element?
    get() = TODO("Not yet implemented")
  actual override val nextElementSibling: Element?
    get() = TODO("Not yet implemented")
  actual override val assignedSlot: HTMLSlotElement?
    get() = TODO("Not yet implemented")
  
  actual override fun prepend(vararg nodes: Any) {
  }
  
  actual override fun append(vararg nodes: Any) {
  }
  
  actual override fun querySelector(selectors: String): Element? {
    TODO("Not yet implemented")
  }
  
  actual override fun querySelectorAll(selectors: String): NodeList {
    TODO("Not yet implemented")
  }
  
  actual override fun before(vararg nodes: Any) {
  }
  
  actual override fun after(vararg nodes: Any) {
  }
  
  actual override fun replaceWith(vararg nodes: Any) {
  }
  
  actual override fun remove() {
  }
  
  actual override fun getBoxQuads(options: BoxQuadOptions): Array<DOMQuad> {
    TODO("Not yet implemented")
  }
  
  actual override fun convertQuadFromNode(
    quad: Any,
    from: Any,
    options: ConvertCoordinateOptions
  ): DOMQuad {
    TODO("Not yet implemented")
  }
  
  actual override fun convertRectFromNode(
    rect: DOMRectReadOnly,
    from: Any,
    options: ConvertCoordinateOptions
  ): DOMQuad {
    TODO("Not yet implemented")
  }
  
  actual override fun convertPointFromNode(
    point: DOMPointInit,
    from: Any,
    options: ConvertCoordinateOptions
  ): DOMPoint {
    TODO("Not yet implemented")
  }
  
  actual companion object {
    actual val NETWORK_EMPTY: Short
      get() = TODO("Not yet implemented")
    actual val NETWORK_IDLE: Short
      get() = TODO("Not yet implemented")
    actual val NETWORK_LOADING: Short
      get() = TODO("Not yet implemented")
    actual val NETWORK_NO_SOURCE: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_NOTHING: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_METADATA: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_CURRENT_DATA: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_FUTURE_DATA: Short
      get() = TODO("Not yet implemented")
    actual val HAVE_ENOUGH_DATA: Short
      get() = TODO("Not yet implemented")
    actual val ELEMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val ATTRIBUTE_NODE: Short
      get() = TODO("Not yet implemented")
    actual val TEXT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val CDATA_SECTION_NODE: Short
      get() = TODO("Not yet implemented")
    actual val ENTITY_REFERENCE_NODE: Short
      get() = TODO("Not yet implemented")
    actual val ENTITY_NODE: Short
      get() = TODO("Not yet implemented")
    actual val PROCESSING_INSTRUCTION_NODE: Short
      get() = TODO("Not yet implemented")
    actual val COMMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_TYPE_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_FRAGMENT_NODE: Short
      get() = TODO("Not yet implemented")
    actual val NOTATION_NODE: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_DISCONNECTED: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_PRECEDING: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_FOLLOWING: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_CONTAINS: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_CONTAINED_BY: Short
      get() = TODO("Not yet implemented")
    actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
      get() = TODO("Not yet implemented")
  }
  
}