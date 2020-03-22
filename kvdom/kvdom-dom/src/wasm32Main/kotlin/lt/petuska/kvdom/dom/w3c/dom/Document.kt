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
actual open class Document actual constructor() : Node(),
  GlobalEventHandlers,
  DocumentAndElementEventHandlers,
  NonElementParentNode,
  DocumentOrShadowRoot,
  ParentNode,
  GeometryUtils {
  actual open val implementation: DOMImplementation
    get() = TODO("Not yet implemented")
  actual open val URL: String
    get() = TODO("Not yet implemented")
  actual open val documentURI: String
    get() = TODO("Not yet implemented")
  actual open val origin: String
    get() = TODO("Not yet implemented")
  actual open val compatMode: String
    get() = TODO("Not yet implemented")
  actual open val characterSet: String
    get() = TODO("Not yet implemented")
  actual open val charset: String
    get() = TODO("Not yet implemented")
  actual open val inputEncoding: String
    get() = TODO("Not yet implemented")
  actual open val contentType: String
    get() = TODO("Not yet implemented")
  actual open val doctype: DocumentType?
    get() = TODO("Not yet implemented")
  actual open val documentElement: Element?
    get() = TODO("Not yet implemented")
  actual open val location: Location?
    get() = TODO("Not yet implemented")
  actual var domain: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val referrer: String
    get() = TODO("Not yet implemented")
  actual var cookie: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val lastModified: String
    get() = TODO("Not yet implemented")
  actual open val readyState: DocumentReadyState
    get() = TODO("Not yet implemented")
  actual var title: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var dir: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var body: HTMLElement?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val head: HTMLHeadElement?
    get() = TODO("Not yet implemented")
  actual open val images: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open val embeds: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open val plugins: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open val links: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open val forms: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open val scripts: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open val currentScript: HTMLOrSVGScriptElement?
    get() = TODO("Not yet implemented")
  actual open val defaultView: Window?
    get() = TODO("Not yet implemented")
  actual open val activeElement: Element?
    get() = TODO("Not yet implemented")
  actual var designMode: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var onreadystatechange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var fgColor: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var linkColor: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var vlinkColor: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var alinkColor: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var bgColor: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val anchors: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open val applets: HTMLCollection
    get() = TODO("Not yet implemented")
  actual open val all: HTMLAllCollection
    get() = TODO("Not yet implemented")
  actual open val scrollingElement: Element?
    get() = TODO("Not yet implemented")
  actual open val styleSheets: StyleSheetList
    get() = TODO("Not yet implemented")
  actual open val rootElement: SVGSVGElement?
    get() = TODO("Not yet implemented")
  actual open val fullscreenEnabled: Boolean
    get() = TODO("Not yet implemented")
  actual open val fullscreen: Boolean
    get() = TODO("Not yet implemented")
  actual var onfullscreenchange: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual var onfullscreenerror: ((Event) -> Any)?
    get() = TODO("Not yet implemented")
    set(value) {}
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
  actual override val fullscreenElement: Element?
    get() = TODO("Not yet implemented")
  actual override val children: HTMLCollection
    get() = TODO("Not yet implemented")
  actual override val firstElementChild: Element?
    get() = TODO("Not yet implemented")
  actual override val lastElementChild: Element?
    get() = TODO("Not yet implemented")
  actual override val childElementCount: Int
    get() = TODO("Not yet implemented")
  
  actual fun getElementsByTagName(qualifiedName: String): HTMLCollection {
    TODO("Not yet implemented")
  }
  
  actual fun getElementsByTagNameNS(
    namespace: String?,
    localName: String
  ): HTMLCollection {
    TODO("Not yet implemented")
  }
  
  actual fun getElementsByClassName(classNames: String): HTMLCollection {
    TODO("Not yet implemented")
  }
  
  actual fun createElement(
    localName: String,
    options: ElementCreationOptions
  ): Element {
    TODO("Not yet implemented")
  }
  
  actual fun createElementNS(
    namespace: String?,
    qualifiedName: String,
    options: ElementCreationOptions
  ): Element {
    TODO("Not yet implemented")
  }
  
  actual fun createDocumentFragment(): DocumentFragment {
    TODO("Not yet implemented")
  }
  
  actual fun createTextNode(data: String): Text {
    TODO("Not yet implemented")
  }
  
  actual fun createCDATASection(data: String): CDATASection {
    TODO("Not yet implemented")
  }
  
  actual fun createComment(data: String): Comment {
    TODO("Not yet implemented")
  }
  
  actual fun createProcessingInstruction(
    target: String,
    data: String
  ): ProcessingInstruction {
    TODO("Not yet implemented")
  }
  
  actual fun importNode(
    node: Node,
    deep: Boolean
  ): Node {
    TODO("Not yet implemented")
  }
  
  actual fun adoptNode(node: Node): Node {
    TODO("Not yet implemented")
  }
  
  actual fun createAttribute(localName: String): Attr {
    TODO("Not yet implemented")
  }
  
  actual fun createAttributeNS(
    namespace: String?,
    qualifiedName: String
  ): Attr {
    TODO("Not yet implemented")
  }
  
  actual fun createEvent(`interface`: String): Event {
    TODO("Not yet implemented")
  }
  
  actual fun createRange(): Range {
    TODO("Not yet implemented")
  }
  
  actual fun createNodeIterator(
    root: Node,
    whatToShow: Int,
    filter: NodeFilter?
  ): NodeIterator {
    TODO("Not yet implemented")
  }
  
  actual fun createNodeIterator(
    root: Node,
    whatToShow: Int,
    filter: ((Node) -> Short)?
  ): NodeIterator {
    TODO("Not yet implemented")
  }
  
  actual fun createTreeWalker(
    root: Node,
    whatToShow: Int,
    filter: NodeFilter?
  ): TreeWalker {
    TODO("Not yet implemented")
  }
  
  actual fun createTreeWalker(
    root: Node,
    whatToShow: Int,
    filter: ((Node) -> Short)?
  ): TreeWalker {
    TODO("Not yet implemented")
  }
  
  actual fun getElementsByName(elementName: String): NodeList {
    TODO("Not yet implemented")
  }
  
  actual fun open(type: String, replace: String): Document {
    TODO("Not yet implemented")
  }
  
  actual fun open(
    url: String,
    name: String,
    features: String
  ): Window {
    TODO("Not yet implemented")
  }
  
  actual fun close() {
  }
  
  actual fun write(vararg text: String) {
  }
  
  actual fun writeln(vararg text: String) {
  }
  
  actual fun hasFocus(): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun execCommand(commandId: String, showUI: Boolean, value: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun queryCommandEnabled(commandId: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun queryCommandIndeterm(commandId: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun queryCommandState(commandId: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun queryCommandSupported(commandId: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun queryCommandValue(commandId: String): String {
    TODO("Not yet implemented")
  }
  
  actual fun clear() {
  }
  
  actual fun captureEvents() {
  }
  
  actual fun releaseEvents() {
  }
  
  actual fun elementFromPoint(x: Double, y: Double): Element? {
    TODO("Not yet implemented")
  }
  
  actual fun elementsFromPoint(x: Double, y: Double): Array<Element> {
    TODO("Not yet implemented")
  }
  
  actual fun caretPositionFromPoint(x: Double, y: Double): CaretPosition? {
    TODO("Not yet implemented")
  }
  
  actual fun createTouch(
    view: Window,
    target: EventTarget,
    identifier: Int,
    pageX: Int,
    pageY: Int,
    screenX: Int,
    screenY: Int
  ): Touch {
    TODO("Not yet implemented")
  }
  
  actual fun createTouchList(vararg touches: Touch): TouchList {
    TODO("Not yet implemented")
  }
  
  actual fun exitFullscreen(): Promise<Unit> {
    TODO("Not yet implemented")
  }
  
  actual override fun getElementById(elementId: String): Element? {
    TODO("Not yet implemented")
  }
  
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

actual inline operator fun Document.get(name: String): Any {
  TODO("Not yet implemented")
}