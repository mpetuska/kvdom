package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.css.UnionElementOrProcessingInstruction
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [Element](https://developer.mozilla.org/en/docs/Web/API/Element) to Kotlin
 */
actual abstract class Element actual constructor() : Node(),
  ParentNode,
  NonDocumentTypeChildNode,
  ChildNode, Slotable,
  GeometryUtils,
  UnionElementOrHTMLCollection,
  UnionElementOrRadioNodeList,
  UnionElementOrMouseEvent, UnionElementOrProcessingInstruction {
  actual open val namespaceURI: String?
    get() = TODO("Not yet implemented")
  actual open val prefix: String?
    get() = TODO("Not yet implemented")
  actual open val localName: String
    get() = TODO("Not yet implemented")
  actual open val tagName: String
    get() = TODO("Not yet implemented")
  actual open var id: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var className: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val classList: DOMTokenList
    get() = TODO("Not yet implemented")
  actual open var slot: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val attributes: NamedNodeMap
    get() = TODO("Not yet implemented")
  actual open val shadowRoot: ShadowRoot?
    get() = TODO("Not yet implemented")
  actual open var scrollTop: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var scrollLeft: Double
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val scrollWidth: Int
    get() = TODO("Not yet implemented")
  actual open val scrollHeight: Int
    get() = TODO("Not yet implemented")
  actual open val clientTop: Int
    get() = TODO("Not yet implemented")
  actual open val clientLeft: Int
    get() = TODO("Not yet implemented")
  actual open val clientWidth: Int
    get() = TODO("Not yet implemented")
  actual open val clientHeight: Int
    get() = TODO("Not yet implemented")
  actual open var innerHTML: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var outerHTML: String
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun hasAttributes(): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun getAttributeNames(): Array<String> {
    TODO("Not yet implemented")
  }
  
  actual fun getAttribute(qualifiedName: String): String? {
    TODO("Not yet implemented")
  }
  
  actual fun getAttributeNS(namespace: String?, localName: String): String? {
    TODO("Not yet implemented")
  }
  
  actual fun setAttribute(qualifiedName: String, value: String) {
  }
  
  actual fun setAttributeNS(namespace: String?, qualifiedName: String, value: String) {
  }
  
  actual fun removeAttribute(qualifiedName: String) {
  }
  
  actual fun removeAttributeNS(namespace: String?, localName: String) {
  }
  
  actual fun hasAttribute(qualifiedName: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun hasAttributeNS(namespace: String?, localName: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun getAttributeNode(qualifiedName: String): Attr? {
    TODO("Not yet implemented")
  }
  
  actual fun getAttributeNodeNS(
    namespace: String?,
    localName: String
  ): Attr? {
    TODO("Not yet implemented")
  }
  
  actual fun setAttributeNode(attr: Attr): Attr? {
    TODO("Not yet implemented")
  }
  
  actual fun setAttributeNodeNS(attr: Attr): Attr? {
    TODO("Not yet implemented")
  }
  
  actual fun removeAttributeNode(attr: Attr): Attr {
    TODO("Not yet implemented")
  }
  
  actual fun attachShadow(init: ShadowRootInit): ShadowRoot {
    TODO("Not yet implemented")
  }
  
  actual fun closest(selectors: String): Element? {
    TODO("Not yet implemented")
  }
  
  actual fun matches(selectors: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun webkitMatchesSelector(selectors: String): Boolean {
    TODO("Not yet implemented")
  }
  
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
  
  actual fun insertAdjacentElement(
    where: String,
    element: Element
  ): Element? {
    TODO("Not yet implemented")
  }
  
  actual fun insertAdjacentText(where: String, data: String) {
  }
  
  actual fun getClientRects(): Array<DOMRect> {
    TODO("Not yet implemented")
  }
  
  actual fun getBoundingClientRect(): DOMRect {
    TODO("Not yet implemented")
  }
  
  actual fun scrollIntoView() {
  }
  
  actual fun scrollIntoView(arg: Any) {
  }
  
  actual fun scroll(options: ScrollToOptions) {
  }
  
  actual fun scroll(x: Double, y: Double) {
  }
  
  actual fun scrollTo(options: ScrollToOptions) {
  }
  
  actual fun scrollTo(x: Double, y: Double) {
  }
  
  actual fun scrollBy(options: ScrollToOptions) {
  }
  
  actual fun scrollBy(x: Double, y: Double) {
  }
  
  actual fun insertAdjacentHTML(position: String, text: String) {
  }
  
  actual fun setPointerCapture(pointerId: Int) {
  }
  
  actual fun releasePointerCapture(pointerId: Int) {
  }
  
  actual fun hasPointerCapture(pointerId: Int): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun requestFullscreen(): Promise<Unit> {
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