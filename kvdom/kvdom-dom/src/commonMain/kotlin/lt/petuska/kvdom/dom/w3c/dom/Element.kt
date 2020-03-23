package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.css.UnionElementOrProcessingInstruction
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [Element](https://developer.mozilla.org/en/docs/Web/API/Element) to Kotlin
 */
@NoWASM
expect abstract class Element : Node, ParentNode, NonDocumentTypeChildNode, ChildNode, Slotable, GeometryUtils,
  UnionElementOrHTMLCollection, UnionElementOrRadioNodeList, UnionElementOrMouseEvent,
  UnionElementOrProcessingInstruction {
  
  abstract val namespaceURI: String?
  abstract val prefix: String?
  abstract val localName: String
  abstract val tagName: String
  abstract var id: String
  abstract var className: String
  abstract val classList: DOMTokenList
  abstract var slot: String
  abstract val attributes: NamedNodeMap
  abstract val shadowRoot: ShadowRoot?
  abstract var scrollTop: Double
  abstract var scrollLeft: Double
  abstract val scrollWidth: Int
  abstract val scrollHeight: Int
  abstract val clientTop: Int
  abstract val clientLeft: Int
  abstract val clientWidth: Int
  abstract val clientHeight: Int
  abstract var innerHTML: String
  abstract var outerHTML: String
  abstract fun hasAttributes(): Boolean
  abstract fun getAttributeNames(): Array<String>
  abstract fun getAttribute(qualifiedName: String): String?
  abstract fun getAttributeNS(namespace: String?, localName: String): String?
  abstract fun setAttribute(qualifiedName: String, value: String)
  abstract fun setAttributeNS(namespace: String?, qualifiedName: String, value: String)
  abstract fun removeAttribute(qualifiedName: String)
  abstract fun removeAttributeNS(namespace: String?, localName: String)
  abstract fun hasAttribute(qualifiedName: String): Boolean
  abstract fun hasAttributeNS(namespace: String?, localName: String): Boolean
  abstract fun getAttributeNode(qualifiedName: String): Attr?
  abstract fun getAttributeNodeNS(namespace: String?, localName: String): Attr?
  abstract fun setAttributeNode(attr: Attr): Attr?
  abstract fun setAttributeNodeNS(attr: Attr): Attr?
  abstract fun removeAttributeNode(attr: Attr): Attr
  abstract fun attachShadow(init: ShadowRootInit): ShadowRoot
  abstract fun closest(selectors: String): Element?
  abstract fun matches(selectors: String): Boolean
  abstract fun webkitMatchesSelector(selectors: String): Boolean
  abstract fun getElementsByTagName(qualifiedName: String): HTMLCollection
  abstract fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection
  abstract fun getElementsByClassName(classNames: String): HTMLCollection
  abstract fun insertAdjacentElement(where: String, element: Element): Element?
  abstract fun insertAdjacentText(where: String, data: String)
  abstract fun getClientRects(): Array<DOMRect>
  abstract fun getBoundingClientRect(): DOMRect
  abstract fun scrollIntoView()
  abstract fun scrollIntoView(arg: Dynamic)
  abstract fun scroll(options: ScrollToOptions)
  abstract fun scroll(x: Double, y: Double)
  abstract fun scrollTo(options: ScrollToOptions)
  abstract fun scrollTo(x: Double, y: Double)
  abstract fun scrollBy(options: ScrollToOptions)
  abstract fun scrollBy(x: Double, y: Double)
  abstract fun insertAdjacentHTML(position: String, text: String)
  abstract fun setPointerCapture(pointerId: Int)
  abstract fun releasePointerCapture(pointerId: Int)
  abstract fun hasPointerCapture(pointerId: Int): Boolean
  abstract fun requestFullscreen(): Promise<Unit>
  
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