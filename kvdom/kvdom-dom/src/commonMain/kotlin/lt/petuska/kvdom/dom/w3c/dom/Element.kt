package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.css.UnionElementOrProcessingInstruction
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [Element](https://developer.mozilla.org/en/docs/Web/API/Element) to Kotlin
 */
expect abstract class Element() : Node,
  ParentNode,
  NonDocumentTypeChildNode,
  ChildNode, Slotable,
  GeometryUtils,
  UnionElementOrHTMLCollection,
  UnionElementOrRadioNodeList,
  UnionElementOrMouseEvent, UnionElementOrProcessingInstruction {
  open val namespaceURI: String?
  open val prefix: String?
  open val localName: String
  open val tagName: String
  open var id: String
  open var className: String
  open val classList: DOMTokenList
  open var slot: String
  open val attributes: NamedNodeMap
  open val shadowRoot: ShadowRoot?
  open var scrollTop: Double
  open var scrollLeft: Double
  open val scrollWidth: Int
  open val scrollHeight: Int
  open val clientTop: Int
  open val clientLeft: Int
  open val clientWidth: Int
  open val clientHeight: Int
  open var innerHTML: String
  open var outerHTML: String
  fun hasAttributes(): Boolean
  fun getAttributeNames(): Array<String>
  fun getAttribute(qualifiedName: String): String?
  fun getAttributeNS(namespace: String?, localName: String): String?
  fun setAttribute(qualifiedName: String, value: String)
  fun setAttributeNS(namespace: String?, qualifiedName: String, value: String)
  fun removeAttribute(qualifiedName: String)
  fun removeAttributeNS(namespace: String?, localName: String)
  fun hasAttribute(qualifiedName: String): Boolean
  fun hasAttributeNS(namespace: String?, localName: String): Boolean
  fun getAttributeNode(qualifiedName: String): Attr?
  fun getAttributeNodeNS(namespace: String?, localName: String): Attr?
  fun setAttributeNode(attr: Attr): Attr?
  fun setAttributeNodeNS(attr: Attr): Attr?
  fun removeAttributeNode(attr: Attr): Attr
  fun attachShadow(init: ShadowRootInit): ShadowRoot
  fun closest(selectors: String): Element?
  fun matches(selectors: String): Boolean
  fun webkitMatchesSelector(selectors: String): Boolean
  fun getElementsByTagName(qualifiedName: String): HTMLCollection
  fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection
  fun getElementsByClassName(classNames: String): HTMLCollection
  fun insertAdjacentElement(where: String, element: Element): Element?
  fun insertAdjacentText(where: String, data: String)
  fun getClientRects(): Array<DOMRect>
  fun getBoundingClientRect(): DOMRect
  fun scrollIntoView()
  fun scrollIntoView(arg: Any)
  fun scroll(options: ScrollToOptions)
  fun scroll(x: Double, y: Double)
  fun scrollTo(options: ScrollToOptions)
  fun scrollTo(x: Double, y: Double)
  fun scrollBy(options: ScrollToOptions)
  fun scrollBy(x: Double, y: Double)
  fun insertAdjacentHTML(position: String, text: String)
  fun setPointerCapture(pointerId: Int)
  fun releasePointerCapture(pointerId: Int)
  fun hasPointerCapture(pointerId: Int): Boolean
  fun requestFullscreen(): Promise<Unit>
  
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