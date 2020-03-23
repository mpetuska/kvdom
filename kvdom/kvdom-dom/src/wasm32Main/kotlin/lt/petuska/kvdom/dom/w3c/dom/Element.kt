package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.css.UnionElementOrProcessingInstruction
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [Element](https://developer.mozilla.org/en/docs/Web/API/Element) to Kotlin
 */
@NoWASM
actual abstract class Element : Node(), ParentNode, NonDocumentTypeChildNode, ChildNode, Slotable, GeometryUtils,
  UnionElementOrHTMLCollection, UnionElementOrRadioNodeList, UnionElementOrMouseEvent,
  UnionElementOrProcessingInstruction {
  
  actual abstract val namespaceURI: String?
  actual abstract val prefix: String?
  actual abstract val localName: String
  actual abstract val tagName: String
  actual abstract var id: String
  actual abstract var className: String
  actual abstract val classList: DOMTokenList
  actual abstract var slot: String
  actual abstract val attributes: NamedNodeMap
  actual abstract val shadowRoot: ShadowRoot?
  actual abstract var scrollTop: Double
  actual abstract var scrollLeft: Double
  actual abstract val scrollWidth: Int
  actual abstract val scrollHeight: Int
  actual abstract val clientTop: Int
  actual abstract val clientLeft: Int
  actual abstract val clientWidth: Int
  actual abstract val clientHeight: Int
  actual abstract var innerHTML: String
  actual abstract var outerHTML: String
  actual abstract fun hasAttributes(): Boolean
  actual abstract fun getAttributeNames(): Array<String>
  actual abstract fun getAttribute(qualifiedName: String): String?
  actual abstract fun getAttributeNS(namespace: String?, localName: String): String?
  actual abstract fun setAttribute(qualifiedName: String, value: String)
  actual abstract fun setAttributeNS(namespace: String?, qualifiedName: String, value: String)
  actual abstract fun removeAttribute(qualifiedName: String)
  actual abstract fun removeAttributeNS(namespace: String?, localName: String)
  actual abstract fun hasAttribute(qualifiedName: String): Boolean
  actual abstract fun hasAttributeNS(namespace: String?, localName: String): Boolean
  actual abstract fun getAttributeNode(qualifiedName: String): Attr?
  actual abstract fun getAttributeNodeNS(namespace: String?, localName: String): Attr?
  actual abstract fun setAttributeNode(attr: Attr): Attr?
  actual abstract fun setAttributeNodeNS(attr: Attr): Attr?
  actual abstract fun removeAttributeNode(attr: Attr): Attr
  actual abstract fun attachShadow(init: ShadowRootInit): ShadowRoot
  actual abstract fun closest(selectors: String): Element?
  actual abstract fun matches(selectors: String): Boolean
  actual abstract fun webkitMatchesSelector(selectors: String): Boolean
  actual abstract fun getElementsByTagName(qualifiedName: String): HTMLCollection
  actual abstract fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection
  actual abstract fun getElementsByClassName(classNames: String): HTMLCollection
  actual abstract fun insertAdjacentElement(where: String, element: Element): Element?
  actual abstract fun insertAdjacentText(where: String, data: String)
  actual abstract fun getClientRects(): Array<DOMRect>
  actual abstract fun getBoundingClientRect(): DOMRect
  actual abstract fun scrollIntoView()
  actual abstract fun scrollIntoView(arg: Dynamic)
  actual abstract fun scroll(options: ScrollToOptions)
  actual abstract fun scroll(x: Double, y: Double)
  actual abstract fun scrollTo(options: ScrollToOptions)
  actual abstract fun scrollTo(x: Double, y: Double)
  actual abstract fun scrollBy(options: ScrollToOptions)
  actual abstract fun scrollBy(x: Double, y: Double)
  actual abstract fun insertAdjacentHTML(position: String, text: String)
  actual abstract fun setPointerCapture(pointerId: Int)
  actual abstract fun releasePointerCapture(pointerId: Int)
  actual abstract fun hasPointerCapture(pointerId: Int): Boolean
  actual abstract fun requestFullscreen(): Promise<Unit>
  
  actual companion object {
    actual val ELEMENT_NODE: Short
      get() {
        TODO()
      }
    actual val ATTRIBUTE_NODE: Short
      get() {
        TODO()
      }
    actual val TEXT_NODE: Short
      get() {
        TODO()
      }
    actual val CDATA_SECTION_NODE: Short
      get() {
        TODO()
      }
    actual val ENTITY_REFERENCE_NODE: Short
      get() {
        TODO()
      }
    actual val ENTITY_NODE: Short
      get() {
        TODO()
      }
    actual val PROCESSING_INSTRUCTION_NODE: Short
      get() {
        TODO()
      }
    actual val COMMENT_NODE: Short
      get() {
        TODO()
      }
    actual val DOCUMENT_NODE: Short
      get() {
        TODO()
      }
    actual val DOCUMENT_TYPE_NODE: Short
      get() {
        TODO()
      }
    actual val DOCUMENT_FRAGMENT_NODE: Short
      get() {
        TODO()
      }
    actual val NOTATION_NODE: Short
      get() {
        TODO()
      }
    actual val DOCUMENT_POSITION_DISCONNECTED: Short
      get() {
        TODO()
      }
    actual val DOCUMENT_POSITION_PRECEDING: Short
      get() {
        TODO()
      }
    actual val DOCUMENT_POSITION_FOLLOWING: Short
      get() {
        TODO()
      }
    actual val DOCUMENT_POSITION_CONTAINS: Short
      get() {
        TODO()
      }
    actual val DOCUMENT_POSITION_CONTAINED_BY: Short
      get() {
        TODO()
      }
    actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
      get() {
        TODO()
      }
  }
}