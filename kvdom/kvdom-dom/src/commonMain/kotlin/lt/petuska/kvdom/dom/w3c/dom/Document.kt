package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.clipboard.ClipboardEvent
import lt.petuska.kvdom.dom.w3c.dom.css.StyleSheetList
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.dom.events.FocusEvent
import lt.petuska.kvdom.dom.w3c.dom.events.InputEvent
import lt.petuska.kvdom.dom.w3c.dom.events.KeyboardEvent
import lt.petuska.kvdom.dom.w3c.dom.events.MouseEvent
import lt.petuska.kvdom.dom.w3c.dom.events.WheelEvent
import lt.petuska.kvdom.dom.w3c.dom.pointerevents.PointerEvent
import lt.petuska.kvdom.dom.w3c.dom.svg.SVGSVGElement
import lt.petuska.kvdom.dom.w3c.fetch.Promise
import lt.petuska.kvdom.dom.w3c.xhr.ProgressEvent

/**
 * Exposes the JavaScript [Document](https://developer.mozilla.org/en/docs/Web/API/Document) to Kotlin
 */
expect open class Document() : Node,
  GlobalEventHandlers,
  DocumentAndElementEventHandlers,
  NonElementParentNode,
  DocumentOrShadowRoot,
  ParentNode,
  GeometryUtils {
  open val implementation: DOMImplementation
  open val URL: String
  open val documentURI: String
  open val origin: String
  open val compatMode: String
  open val characterSet: String
  open val charset: String
  open val inputEncoding: String
  open val contentType: String
  open val doctype: DocumentType?
  open val documentElement: Element?
  open val location: Location?
  var domain: String
  open val referrer: String
  var cookie: String
  open val lastModified: String
  open val readyState: DocumentReadyState
  var title: String
  var dir: String
  var body: HTMLElement?
  open val head: HTMLHeadElement?
  open val images: HTMLCollection
  open val embeds: HTMLCollection
  open val plugins: HTMLCollection
  open val links: HTMLCollection
  open val forms: HTMLCollection
  open val scripts: HTMLCollection
  open val currentScript: HTMLOrSVGScriptElement?
  open val defaultView: Window?
  open val activeElement: Element?
  var designMode: String
  var onreadystatechange: ((Event) -> Any)?
  var fgColor: String
  var linkColor: String
  var vlinkColor: String
  var alinkColor: String
  var bgColor: String
  open val anchors: HTMLCollection
  open val applets: HTMLCollection
  open val all: HTMLAllCollection
  open val scrollingElement: Element?
  open val styleSheets: StyleSheetList
  open val rootElement: SVGSVGElement?
  open val fullscreenEnabled: Boolean
  open val fullscreen: Boolean
  var onfullscreenchange: ((Event) -> Any)?
  var onfullscreenerror: ((Event) -> Any)?
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
  override val fullscreenElement: Element?
  override val children: HTMLCollection
  override val firstElementChild: Element?
  override val lastElementChild: Element?
  override val childElementCount: Int
  fun getElementsByTagName(qualifiedName: String): HTMLCollection
  fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection
  fun getElementsByClassName(classNames: String): HTMLCollection
  fun createElement(localName: String, options: ElementCreationOptions): Element
  fun createElementNS(namespace: String?, qualifiedName: String, options: ElementCreationOptions): Element
  fun createDocumentFragment(): DocumentFragment
  fun createTextNode(data: String): Text
  fun createCDATASection(data: String): CDATASection
  fun createComment(data: String): Comment
  fun createProcessingInstruction(target: String, data: String): ProcessingInstruction
  fun importNode(node: Node, deep: Boolean): Node
  fun adoptNode(node: Node): Node
  fun createAttribute(localName: String): Attr
  fun createAttributeNS(namespace: String?, qualifiedName: String): Attr
  fun createEvent(`interface`: String): Event
  fun createRange(): Range
  fun createNodeIterator(root: Node, whatToShow: Int, filter: NodeFilter?): NodeIterator
  fun createNodeIterator(root: Node, whatToShow: Int, filter: ((Node) -> Short)?): NodeIterator
  fun createTreeWalker(root: Node, whatToShow: Int, filter: NodeFilter?): TreeWalker
  fun createTreeWalker(root: Node, whatToShow: Int, filter: ((Node) -> Short)?): TreeWalker
  fun getElementsByName(elementName: String): NodeList
  fun open(type: String, replace: String): Document
  fun open(url: String, name: String, features: String): Window
  fun close()
  fun write(vararg text: String)
  fun writeln(vararg text: String)
  fun hasFocus(): Boolean
  fun execCommand(commandId: String, showUI: Boolean, value: String): Boolean
  fun queryCommandEnabled(commandId: String): Boolean
  fun queryCommandIndeterm(commandId: String): Boolean
  fun queryCommandState(commandId: String): Boolean
  fun queryCommandSupported(commandId: String): Boolean
  fun queryCommandValue(commandId: String): String
  fun clear()
  fun captureEvents()
  fun releaseEvents()
  fun elementFromPoint(x: Double, y: Double): Element?
  fun elementsFromPoint(x: Double, y: Double): Array<Element>
  fun caretPositionFromPoint(x: Double, y: Double): CaretPosition?
  fun createTouch(
    view: Window,
    target: EventTarget,
    identifier: Int,
    pageX: Int,
    pageY: Int,
    screenX: Int,
    screenY: Int
  ): Touch
  
  fun createTouchList(vararg touches: Touch): TouchList
  fun exitFullscreen(): Promise<Unit>
  override fun getElementById(elementId: String): Element?
  override fun prepend(vararg nodes: Any)
  override fun append(vararg nodes: Any)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
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

expect inline operator fun Document.get(name: String): Any
