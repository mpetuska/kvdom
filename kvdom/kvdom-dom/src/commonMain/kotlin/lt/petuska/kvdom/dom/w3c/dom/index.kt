package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.css.UnionElementOrProcessingInstruction


/**
 * Exposes the JavaScript [TimeRanges](https://developer.mozilla.org/en/docs/Web/API/TimeRanges) to Kotlin
 */
expect abstract class TimeRanges {
  open val length: Int
  fun start(index: Int): Double
  fun end(index: Int): Double
}

/**
 * Exposes the JavaScript [TrackEvent](https://developer.mozilla.org/en/docs/Web/API/TrackEvent) to Kotlin
 */
expect open class TrackEvent(type: String, eventInitDict: TrackEventInit = definedExternally) : Event {
  open val track: UnionAudioTrackOrTextTrackOrVideoTrack?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface TrackEventInit : EventInit {
  var track: UnionAudioTrackOrTextTrackOrVideoTrack? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun TrackEventInit(
  track: UnionAudioTrackOrTextTrackOrVideoTrack? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): TrackEventInit {
  val o = js("({})")
  o["track"] = track
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [HTMLMapElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMapElement) to Kotlin
 */
expect abstract class HTMLMapElement : HTMLElement {
  open var name: String
  open val areas: HTMLCollection
  
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

/**
 * Exposes the JavaScript [HTMLAreaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLAreaElement) to Kotlin
 */
expect abstract class HTMLAreaElement : HTMLElement, HTMLHyperlinkElementUtils {
  open var alt: String
  open var coords: String
  open var shape: String
  open var target: String
  open var download: String
  open var ping: String
  open var rel: String
  open val relList: DOMTokenList
  open var referrerPolicy: String
  open var noHref: Boolean
  
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

/**
 * Exposes the JavaScript [HTMLTableElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableElement) to Kotlin
 */
expect abstract class HTMLTableElement : HTMLElement {
  open var caption: HTMLTableCaptionElement?
  open var tHead: HTMLTableSectionElement?
  open var tFoot: HTMLTableSectionElement?
  open val tBodies: HTMLCollection
  open val rows: HTMLCollection
  open var align: String
  open var border: String
  open var frame: String
  open var rules: String
  open var summary: String
  open var width: String
  open var bgColor: String
  open var cellPadding: String
  open var cellSpacing: String
  fun createCaption(): HTMLTableCaptionElement
  fun deleteCaption()
  fun createTHead(): HTMLTableSectionElement
  fun deleteTHead()
  fun createTFoot(): HTMLTableSectionElement
  fun deleteTFoot()
  fun createTBody(): HTMLTableSectionElement
  fun insertRow(index: Int = definedExternally): HTMLTableRowElement
  fun deleteRow(index: Int)
  
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

/**
 * Exposes the JavaScript [HTMLTableCaptionElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableCaptionElement) to Kotlin
 */
expect abstract class HTMLTableCaptionElement : HTMLElement {
  open var align: String
  
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

/**
 * Exposes the JavaScript [HTMLTableColElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableColElement) to Kotlin
 */
expect abstract class HTMLTableColElement : HTMLElement {
  open var span: Int
  open var align: String
  open var ch: String
  open var chOff: String
  open var vAlign: String
  open var width: String
  
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

/**
 * Exposes the JavaScript [HTMLTableSectionElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableSectionElement) to Kotlin
 */
expect abstract class HTMLTableSectionElement : HTMLElement {
  open val rows: HTMLCollection
  open var align: String
  open var ch: String
  open var chOff: String
  open var vAlign: String
  fun insertRow(index: Int = definedExternally): HTMLElement
  fun deleteRow(index: Int)
  
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

/**
 * Exposes the JavaScript [HTMLTableRowElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableRowElement) to Kotlin
 */
expect abstract class HTMLTableRowElement : HTMLElement {
  open val rowIndex: Int
  open val sectionRowIndex: Int
  open val cells: HTMLCollection
  open var align: String
  open var ch: String
  open var chOff: String
  open var vAlign: String
  open var bgColor: String
  fun insertCell(index: Int = definedExternally): HTMLElement
  fun deleteCell(index: Int)
  
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

/**
 * Exposes the JavaScript [HTMLTableCellElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableCellElement) to Kotlin
 */
expect abstract class HTMLTableCellElement : HTMLElement {
  open var colSpan: Int
  open var rowSpan: Int
  open var headers: String
  open val cellIndex: Int
  open var scope: String
  open var abbr: String
  open var align: String
  open var axis: String
  open var height: String
  open var width: String
  open var ch: String
  open var chOff: String
  open var noWrap: Boolean
  open var vAlign: String
  open var bgColor: String
  
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

/**
 * Exposes the JavaScript [HTMLFormElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFormElement) to Kotlin
 */
expect abstract class HTMLFormElement : HTMLElement {
  open var acceptCharset: String
  open var action: String
  open var autocomplete: String
  open var enctype: String
  open var encoding: String
  open var method: String
  open var name: String
  open var noValidate: Boolean
  open var target: String
  open val elements: HTMLFormControlsCollection
  open val length: Int
  fun submit()
  fun reset()
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  
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

@kotlin.internal.InlineOnly
inline operator fun HTMLFormElement.get(index: Int): Element? = asDynamic()[index]

@kotlin.internal.InlineOnly
inline operator fun HTMLFormElement.get(name: String): UnionElementOrRadioNodeList? = asDynamic()[name]

/**
 * Exposes the JavaScript [HTMLLabelElement](https://developer.mozilla.org/en/docs/Web/API/HTMLLabelElement) to Kotlin
 */
expect abstract class HTMLLabelElement : HTMLElement {
  open val form: HTMLFormElement?
  open var htmlFor: String
  open val control: HTMLElement?
  
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

/**
 * Exposes the JavaScript [HTMLInputElement](https://developer.mozilla.org/en/docs/Web/API/HTMLInputElement) to Kotlin
 */
expect abstract class HTMLInputElement : HTMLElement {
  open var accept: String
  open var alt: String
  open var autocomplete: String
  open var autofocus: Boolean
  open var defaultChecked: Boolean
  open var checked: Boolean
  open var dirName: String
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open val files: FileList?
  open var formAction: String
  open var formEnctype: String
  open var formMethod: String
  open var formNoValidate: Boolean
  open var formTarget: String
  open var height: Int
  open var indeterminate: Boolean
  open var inputMode: String
  open val list: HTMLElement?
  open var max: String
  open var maxLength: Int
  open var min: String
  open var minLength: Int
  open var multiple: Boolean
  open var name: String
  open var pattern: String
  open var placeholder: String
  open var readOnly: Boolean
  open var required: Boolean
  open var size: Int
  open var src: String
  open var step: String
  open var type: String
  open var defaultValue: String
  open var value: String
  open var valueAsDate: Dynamic
  open var valueAsNumber: Double
  open var width: Int
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  open val labels: NodeList
  open var selectionStart: Int?
  open var selectionEnd: Int?
  open var selectionDirection: String?
  open var align: String
  open var useMap: String
  fun stepUp(n: Int = definedExternally)
  fun stepDown(n: Int = definedExternally)
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  fun setCustomValidity(error: String)
  fun select()
  fun setRangeText(replacement: String)
  fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode = definedExternally)
  fun setSelectionRange(start: Int, end: Int, direction: String = definedExternally)
  
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

/**
 * Exposes the JavaScript [HTMLButtonElement](https://developer.mozilla.org/en/docs/Web/API/HTMLButtonElement) to Kotlin
 */
expect abstract class HTMLButtonElement : HTMLElement {
  open var autofocus: Boolean
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open var formAction: String
  open var formEnctype: String
  open var formMethod: String
  open var formNoValidate: Boolean
  open var formTarget: String
  open var name: String
  open var type: String
  open var value: String
  open var menu: HTMLMenuElement?
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  open val labels: NodeList
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  fun setCustomValidity(error: String)
  
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

/**
 * Exposes the JavaScript [HTMLSelectElement](https://developer.mozilla.org/en/docs/Web/API/HTMLSelectElement) to Kotlin
 */
expect abstract class HTMLSelectElement : HTMLElement, ItemArrayLike<Element> {
  open var autocomplete: String
  open var autofocus: Boolean
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open var multiple: Boolean
  open var name: String
  open var required: Boolean
  open var size: Int
  open val type: String
  open val options: HTMLOptionsCollection
  override var length: Int
  open val selectedOptions: HTMLCollection
  open var selectedIndex: Int
  open var value: String
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  open val labels: NodeList
  fun namedItem(name: String): HTMLOptionElement?
  fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Dynamic = definedExternally)
  fun remove(index: Int)
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  fun setCustomValidity(error: String)
  override fun item(index: Int): Element?
  
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

@kotlin.internal.InlineOnly
inline operator fun HTMLSelectElement.get(index: Int): Element? = asDynamic()[index]

@kotlin.internal.InlineOnly
inline operator fun HTMLSelectElement.set(index: Int, option: HTMLOptionElement?) {
  asDynamic()[index] = option
}

/**
 * Exposes the JavaScript [HTMLDataListElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDataListElement) to Kotlin
 */
expect abstract class HTMLDataListElement : HTMLElement {
  open val options: HTMLCollection
  
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

/**
 * Exposes the JavaScript [HTMLOptGroupElement](https://developer.mozilla.org/en/docs/Web/API/HTMLOptGroupElement) to Kotlin
 */
expect abstract class HTMLOptGroupElement : HTMLElement, UnionHTMLOptGroupElementOrHTMLOptionElement {
  open var disabled: Boolean
  open var label: String
  
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

/**
 * Exposes the JavaScript [HTMLOptionElement](https://developer.mozilla.org/en/docs/Web/API/HTMLOptionElement) to Kotlin
 */
expect abstract class HTMLOptionElement : HTMLElement, UnionHTMLOptGroupElementOrHTMLOptionElement {
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open var label: String
  open var defaultSelected: Boolean
  open var selected: Boolean
  open var value: String
  open var text: String
  open val index: Int
  
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

/**
 * Exposes the JavaScript [HTMLTextAreaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTextAreaElement) to Kotlin
 */
expect abstract class HTMLTextAreaElement : HTMLElement {
  open var autocomplete: String
  open var autofocus: Boolean
  open var cols: Int
  open var dirName: String
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open var inputMode: String
  open var maxLength: Int
  open var minLength: Int
  open var name: String
  open var placeholder: String
  open var readOnly: Boolean
  open var required: Boolean
  open var rows: Int
  open var wrap: String
  open val type: String
  open var defaultValue: String
  open var value: String
  open val textLength: Int
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  open val labels: NodeList
  open var selectionStart: Int?
  open var selectionEnd: Int?
  open var selectionDirection: String?
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  fun setCustomValidity(error: String)
  fun select()
  fun setRangeText(replacement: String)
  fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode = definedExternally)
  fun setSelectionRange(start: Int, end: Int, direction: String = definedExternally)
  
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

/**
 * Exposes the JavaScript [HTMLKeygenElement](https://developer.mozilla.org/en/docs/Web/API/HTMLKeygenElement) to Kotlin
 */
expect abstract class HTMLKeygenElement : HTMLElement {
  open var autofocus: Boolean
  open var challenge: String
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open var keytype: String
  open var name: String
  open val type: String
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  open val labels: NodeList
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  fun setCustomValidity(error: String)
  
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

/**
 * Exposes the JavaScript [HTMLOutputElement](https://developer.mozilla.org/en/docs/Web/API/HTMLOutputElement) to Kotlin
 */
expect abstract class HTMLOutputElement : HTMLElement {
  open val htmlFor: DOMTokenList
  open val form: HTMLFormElement?
  open var name: String
  open val type: String
  open var defaultValue: String
  open var value: String
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  open val labels: NodeList
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  fun setCustomValidity(error: String)
  
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

/**
 * Exposes the JavaScript [HTMLProgressElement](https://developer.mozilla.org/en/docs/Web/API/HTMLProgressElement) to Kotlin
 */
expect abstract class HTMLProgressElement : HTMLElement {
  open var value: Double
  open var max: Double
  open val position: Double
  open val labels: NodeList
  
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

/**
 * Exposes the JavaScript [HTMLMeterElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMeterElement) to Kotlin
 */
expect abstract class HTMLMeterElement : HTMLElement {
  open var value: Double
  open var min: Double
  open var max: Double
  open var low: Double
  open var high: Double
  open var optimum: Double
  open val labels: NodeList
  
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

/**
 * Exposes the JavaScript [HTMLFieldSetElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFieldSetElement) to Kotlin
 */
expect abstract class HTMLFieldSetElement : HTMLElement {
  open var disabled: Boolean
  open val form: HTMLFormElement?
  open var name: String
  open val type: String
  open val elements: HTMLCollection
  open val willValidate: Boolean
  open val validity: ValidityState
  open val validationMessage: String
  fun checkValidity(): Boolean
  fun reportValidity(): Boolean
  fun setCustomValidity(error: String)
  
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

/**
 * Exposes the JavaScript [HTMLLegendElement](https://developer.mozilla.org/en/docs/Web/API/HTMLLegendElement) to Kotlin
 */
expect abstract class HTMLLegendElement : HTMLElement {
  open val form: HTMLFormElement?
  open var align: String
  
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

/**
 * Exposes the JavaScript [ValidityState](https://developer.mozilla.org/en/docs/Web/API/ValidityState) to Kotlin
 */
expect abstract class ValidityState {
  open val valueMissing: Boolean
  open val typeMismatch: Boolean
  open val patternMismatch: Boolean
  open val tooLong: Boolean
  open val tooShort: Boolean
  open val rangeUnderflow: Boolean
  open val rangeOverflow: Boolean
  open val stepMismatch: Boolean
  open val badInput: Boolean
  open val customError: Boolean
  open val valid: Boolean
}

/**
 * Exposes the JavaScript [HTMLDetailsElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDetailsElement) to Kotlin
 */
expect abstract class HTMLDetailsElement : HTMLElement {
  open var open: Boolean
  
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

expect abstract class HTMLMenuElement : HTMLElement {
  open var type: String
  open var label: String
  open var compact: Boolean
  
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

expect abstract class HTMLMenuItemElement : HTMLElement {
  open var type: String
  open var label: String
  open var icon: String
  open var disabled: Boolean
  open var checked: Boolean
  open var radiogroup: String
  open var default: Boolean
  
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

expect open class RelatedEvent(type: String, eventInitDict: RelatedEventInit = definedExternally) : Event {
  open val relatedTarget: EventTarget?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface RelatedEventInit : EventInit {
  var relatedTarget: EventTarget? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun RelatedEventInit(
  relatedTarget: EventTarget? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): RelatedEventInit {
  val o = js("({})")
  o["relatedTarget"] = relatedTarget
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [HTMLDialogElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDialogElement) to Kotlin
 */
expect abstract class HTMLDialogElement : HTMLElement {
  open var open: Boolean
  open var returnValue: String
  fun show(anchor: UnionElementOrMouseEvent = definedExternally)
  fun showModal(anchor: UnionElementOrMouseEvent = definedExternally)
  fun close(returnValue: String = definedExternally)
  
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

/**
 * Exposes the JavaScript [HTMLScriptElement](https://developer.mozilla.org/en/docs/Web/API/HTMLScriptElement) to Kotlin
 */
expect abstract class HTMLScriptElement : HTMLElement, HTMLOrSVGScriptElement {
  open var src: String
  open var type: String
  open var charset: String
  open var async: Boolean
  open var defer: Boolean
  open var crossOrigin: String?
  open var text: String
  open var nonce: String
  open var event: String
  open var htmlFor: String
  
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

/**
 * Exposes the JavaScript [HTMLTemplateElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTemplateElement) to Kotlin
 */
expect abstract class HTMLTemplateElement : HTMLElement {
  open val content: DocumentFragment
  
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

/**
 * Exposes the JavaScript [HTMLSlotElement](https://developer.mozilla.org/en/docs/Web/API/HTMLSlotElement) to Kotlin
 */
expect abstract class HTMLSlotElement : HTMLElement {
  open var name: String
  fun assignedNodes(options: AssignedNodesOptions = definedExternally): Array<Node>
  
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

expect interface AssignedNodesOptions {
  var flatten: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun AssignedNodesOptions(flatten: Boolean? = false): AssignedNodesOptions {
  val o = js("({})")
  o["flatten"] = flatten
  return o
}

/**
 * Exposes the JavaScript [HTMLCanvasElement](https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement) to Kotlin
 */
expect abstract class HTMLCanvasElement : HTMLElement, CanvasImageSource, TexImageSource {
  open var width: Int
  open var height: Int
  fun getContext(contextId: String, vararg arguments: Any?): RenderingContext?
  fun toDataURL(type: String = definedExternally, quality: Any? = definedExternally): String
  fun toBlob(_callback: (Blob?) -> Unit, type: String = definedExternally, quality: Any? = definedExternally)
  
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

expect interface CanvasRenderingContext2DSettings {
  var alpha: Boolean? /* = true */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun CanvasRenderingContext2DSettings(alpha: Boolean? = true): CanvasRenderingContext2DSettings {
  val o = js("({})")
  o["alpha"] = alpha
  return o
}

/**
 * Exposes the JavaScript [CanvasRenderingContext2D](https://developer.mozilla.org/en/docs/Web/API/CanvasRenderingContext2D) to Kotlin
 */
expect abstract class CanvasRenderingContext2D : CanvasState, CanvasTransform, CanvasCompositing, CanvasImageSmoothing,
  CanvasFillStrokeStyles, CanvasShadowStyles, CanvasFilters, CanvasRect, CanvasDrawPath, CanvasUserInterface,
  CanvasText, CanvasDrawImage, CanvasHitRegion, CanvasImageData, CanvasPathDrawingStyles, CanvasTextDrawingStyles,
  CanvasPath, RenderingContext {
  open val canvas: HTMLCanvasElement
}

expect interface CanvasState {
  fun save()
  fun restore()
}

expect interface CanvasTransform {
  fun scale(x: Double, y: Double)
  fun rotate(angle: Double)
  fun translate(x: Double, y: Double)
  fun transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
  fun getTransform(): DOMMatrix
  fun setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
  fun setTransform(transform: Dynamic = definedExternally)
  fun resetTransform()
}

expect interface CanvasCompositing {
  var globalAlpha: Double
  var globalCompositeOperation: String
}

expect interface CanvasImageSmoothing {
  var imageSmoothingEnabled: Boolean
  var imageSmoothingQuality: ImageSmoothingQuality
}

expect interface CanvasFillStrokeStyles {
  var strokeStyle: Dynamic
    get() = definedExternally
    set(value) = definedExternally
  var fillStyle: Dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  fun createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient
  fun createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient
  fun createPattern(image: CanvasImageSource, repetition: String): CanvasPattern?
}

expect interface CanvasShadowStyles {
  var shadowOffsetX: Double
  var shadowOffsetY: Double
  var shadowBlur: Double
  var shadowColor: String
}

expect interface CanvasFilters {
  var filter: String
}

expect interface CanvasRect {
  fun clearRect(x: Double, y: Double, w: Double, h: Double)
  fun fillRect(x: Double, y: Double, w: Double, h: Double)
  fun strokeRect(x: Double, y: Double, w: Double, h: Double)
}

expect interface CanvasDrawPath {
  fun beginPath()
  fun fill(fillRule: CanvasFillRule = definedExternally)
  fun fill(path: Path2D, fillRule: CanvasFillRule = definedExternally)
  fun stroke()
  fun stroke(path: Path2D)
  fun clip(fillRule: CanvasFillRule = definedExternally)
  fun clip(path: Path2D, fillRule: CanvasFillRule = definedExternally)
  fun resetClip()
  fun isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule = definedExternally): Boolean
  fun isPointInPath(path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule = definedExternally): Boolean
  fun isPointInStroke(x: Double, y: Double): Boolean
  fun isPointInStroke(path: Path2D, x: Double, y: Double): Boolean
}

expect interface CanvasUserInterface {
  fun drawFocusIfNeeded(element: Element)
  fun drawFocusIfNeeded(path: Path2D, element: Element)
  fun scrollPathIntoView()
  fun scrollPathIntoView(path: Path2D)
}

expect interface CanvasText {
  fun fillText(text: String, x: Double, y: Double, maxWidth: Double = definedExternally)
  fun strokeText(text: String, x: Double, y: Double, maxWidth: Double = definedExternally)
  fun measureText(text: String): TextMetrics
}

expect interface CanvasDrawImage {
  fun drawImage(image: CanvasImageSource, dx: Double, dy: Double)
  fun drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double)
  fun drawImage(
    image: CanvasImageSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    dx: Double,
    dy: Double,
    dw: Double,
    dh: Double
  )
}

expect interface CanvasHitRegion {
  fun addHitRegion(options: HitRegionOptions = definedExternally)
  fun removeHitRegion(id: String)
  fun clearHitRegions()
}

expect interface CanvasImageData {
  fun createImageData(sw: Double, sh: Double): ImageData
  fun createImageData(imagedata: ImageData): ImageData
  fun getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData
  fun putImageData(imagedata: ImageData, dx: Double, dy: Double)
  fun putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  )
}

expect interface CanvasPathDrawingStyles {
  var lineWidth: Double
  var lineCap: CanvasLineCap
  var lineJoin: CanvasLineJoin
  var miterLimit: Double
  var lineDashOffset: Double
  fun setLineDash(segments: Array<Double>)
  fun getLineDash(): Array<Double>
}

expect interface CanvasTextDrawingStyles {
  var font: String
  var textAlign: CanvasTextAlign
  var textBaseline: CanvasTextBaseline
  var direction: CanvasDirection
}

expect interface CanvasPath {
  fun closePath()
  fun moveTo(x: Double, y: Double)
  fun lineTo(x: Double, y: Double)
  fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)
  fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)
  fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)
  fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radiusX: Double, radiusY: Double, rotation: Double)
  fun rect(x: Double, y: Double, w: Double, h: Double)
  fun arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean = definedExternally
  )
  
  fun ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean = definedExternally
  )
}

/**
 * Exposes the JavaScript [CanvasGradient](https://developer.mozilla.org/en/docs/Web/API/CanvasGradient) to Kotlin
 */
expect abstract class CanvasGradient {
  fun addColorStop(offset: Double, color: String)
}

/**
 * Exposes the JavaScript [CanvasPattern](https://developer.mozilla.org/en/docs/Web/API/CanvasPattern) to Kotlin
 */
expect abstract class CanvasPattern {
  fun setTransform(transform: Dynamic = definedExternally)
}

/**
 * Exposes the JavaScript [TextMetrics](https://developer.mozilla.org/en/docs/Web/API/TextMetrics) to Kotlin
 */
expect abstract class TextMetrics {
  open val width: Double
  open val actualBoundingBoxLeft: Double
  open val actualBoundingBoxRight: Double
  open val fontBoundingBoxAscent: Double
  open val fontBoundingBoxDescent: Double
  open val actualBoundingBoxAscent: Double
  open val actualBoundingBoxDescent: Double
  open val emHeightAscent: Double
  open val emHeightDescent: Double
  open val hangingBaseline: Double
  open val alphabeticBaseline: Double
  open val ideographicBaseline: Double
}

expect interface HitRegionOptions {
  var path: Path2D? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var fillRule: CanvasFillRule? /* = CanvasFillRule.NONZERO */
    get() = definedExternally
    set(value) = definedExternally
  var id: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var parentID: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var cursor: String? /* = "inherit" */
    get() = definedExternally
    set(value) = definedExternally
  var control: Element? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var label: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var role: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun HitRegionOptions(
  path: Path2D? = null,
  fillRule: CanvasFillRule? = CanvasFillRule.NONZERO,
  id: String? = "",
  parentID: String? = null,
  cursor: String? = "inherit",
  control: Element? = null,
  label: String? = null,
  role: String? = null
): HitRegionOptions {
  val o = js("({})")
  o["path"] = path
  o["fillRule"] = fillRule
  o["id"] = id
  o["parentID"] = parentID
  o["cursor"] = cursor
  o["control"] = control
  o["label"] = label
  o["role"] = role
  return o
}

/**
 * Exposes the JavaScript [ImageData](https://developer.mozilla.org/en/docs/Web/API/ImageData) to Kotlin
 */
expect open class ImageData : ImageBitmapSource, TexImageSource {
  constructor(sw: Int, sh: Int)
  constructor(data: Uint8ClampedArray, sw: Int, sh: Int = definedExternally)
  
  open val width: Int
  open val height: Int
  open val data: Uint8ClampedArray
}

/**
 * Exposes the JavaScript [Path2D](https://developer.mozilla.org/en/docs/Web/API/Path2D) to Kotlin
 */
expect open class Path2D() : CanvasPath {
  constructor(path: Path2D)
  constructor(paths: Array<Path2D>, fillRule: CanvasFillRule = definedExternally)
  constructor(d: String)
  
  fun addPath(path: Path2D, transform: Dynamic = definedExternally)
  override fun closePath()
  override fun moveTo(x: Double, y: Double)
  override fun lineTo(x: Double, y: Double)
  override fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)
  override fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)
  override fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)
  override fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radiusX: Double, radiusY: Double, rotation: Double)
  override fun rect(x: Double, y: Double, w: Double, h: Double)
  override fun arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean /* = definedExternally */
  )
  
  override fun ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean /* = definedExternally */
  )
}

/**
 * Exposes the JavaScript [ImageBitmapRenderingContext](https://developer.mozilla.org/en/docs/Web/API/ImageBitmapRenderingContext) to Kotlin
 */
expect abstract class ImageBitmapRenderingContext {
  open val canvas: HTMLCanvasElement
  fun transferFromImageBitmap(bitmap: ImageBitmap?)
}

expect interface ImageBitmapRenderingContextSettings {
  var alpha: Boolean? /* = true */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ImageBitmapRenderingContextSettings(alpha: Boolean? = true): ImageBitmapRenderingContextSettings {
  val o = js("({})")
  o["alpha"] = alpha
  return o
}

/**
 * Exposes the JavaScript [CustomElementRegistry](https://developer.mozilla.org/en/docs/Web/API/CustomElementRegistry) to Kotlin
 */
expect abstract class CustomElementRegistry {
  fun define(name: String, constructor: () -> Dynamic, options: ElementDefinitionOptions = definedExternally)
  fun get(name: String): Any?
  fun whenDefined(name: String): Promise<Unit>
}

expect interface ElementDefinitionOptions {
  var extends: String?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ElementDefinitionOptions(extends: String? = undefined): ElementDefinitionOptions {
  val o = js("({})")
  o["extends"] = extends
  return o
}

/**
 * Exposes the JavaScript [DataTransfer](https://developer.mozilla.org/en/docs/Web/API/DataTransfer) to Kotlin
 */
expect abstract class DataTransfer {
  open var dropEffect: String
  open var effectAllowed: String
  open val items: DataTransferItemList
  open val types: Array<out String>
  open val files: FileList
  fun setDragImage(image: Element, x: Int, y: Int)
  fun getData(format: String): String
  fun setData(format: String, data: String)
  fun clearData(format: String = definedExternally)
}

/**
 * Exposes the JavaScript [DataTransferItemList](https://developer.mozilla.org/en/docs/Web/API/DataTransferItemList) to Kotlin
 */
expect abstract class DataTransferItemList {
  open val length: Int
  fun add(data: String, type: String): DataTransferItem?
  fun add(data: File): DataTransferItem?
  fun remove(index: Int)
  fun clear()
}

@kotlin.internal.InlineOnly
inline operator fun DataTransferItemList.get(index: Int): DataTransferItem? = asDynamic()[index]

/**
 * Exposes the JavaScript [DataTransferItem](https://developer.mozilla.org/en/docs/Web/API/DataTransferItem) to Kotlin
 */
expect abstract class DataTransferItem {
  open val kind: String
  open val type: String
  fun getAsString(_callback: ((String) -> Unit)?)
  fun getAsFile(): File?
}

/**
 * Exposes the JavaScript [DragEvent](https://developer.mozilla.org/en/docs/Web/API/DragEvent) to Kotlin
 */
expect open class DragEvent(type: String, eventInitDict: DragEventInit = definedExternally) : MouseEvent {
  open val dataTransfer: DataTransfer?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface DragEventInit : MouseEventInit {
  var dataTransfer: DataTransfer? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun DragEventInit(
  dataTransfer: DataTransfer? = null,
  screenX: Int? = 0,
  screenY: Int? = 0,
  clientX: Int? = 0,
  clientY: Int? = 0,
  button: Short? = 0,
  buttons: Short? = 0,
  relatedTarget: EventTarget? = null,
  region: String? = null,
  ctrlKey: Boolean? = false,
  shiftKey: Boolean? = false,
  altKey: Boolean? = false,
  metaKey: Boolean? = false,
  modifierAltGraph: Boolean? = false,
  modifierCapsLock: Boolean? = false,
  modifierFn: Boolean? = false,
  modifierFnLock: Boolean? = false,
  modifierHyper: Boolean? = false,
  modifierNumLock: Boolean? = false,
  modifierScrollLock: Boolean? = false,
  modifierSuper: Boolean? = false,
  modifierSymbol: Boolean? = false,
  modifierSymbolLock: Boolean? = false,
  view: Window? = null,
  detail: Int? = 0,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): DragEventInit {
  val o = js("({})")
  o["dataTransfer"] = dataTransfer
  o["screenX"] = screenX
  o["screenY"] = screenY
  o["clientX"] = clientX
  o["clientY"] = clientY
  o["button"] = button
  o["buttons"] = buttons
  o["relatedTarget"] = relatedTarget
  o["region"] = region
  o["ctrlKey"] = ctrlKey
  o["shiftKey"] = shiftKey
  o["altKey"] = altKey
  o["metaKey"] = metaKey
  o["modifierAltGraph"] = modifierAltGraph
  o["modifierCapsLock"] = modifierCapsLock
  o["modifierFn"] = modifierFn
  o["modifierFnLock"] = modifierFnLock
  o["modifierHyper"] = modifierHyper
  o["modifierNumLock"] = modifierNumLock
  o["modifierScrollLock"] = modifierScrollLock
  o["modifierSuper"] = modifierSuper
  o["modifierSymbol"] = modifierSymbol
  o["modifierSymbolLock"] = modifierSymbolLock
  o["view"] = view
  o["detail"] = detail
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [Window](https://developer.mozilla.org/en/docs/Web/API/Window) to Kotlin
 */
expect abstract class Window : EventTarget, GlobalEventHandlers, WindowEventHandlers, WindowOrWorkerGlobalScope,
  WindowSessionStorage, WindowLocalStorage, GlobalPerformance, UnionMessagePortOrWindowProxy {
  open val window: Window
  open val self: Window
  open val document: Document
  open var name: String
  open val location: Location
  open val history: History
  open val customElements: CustomElementRegistry
  open val locationbar: BarProp
  open val menubar: BarProp
  open val personalbar: BarProp
  open val scrollbars: BarProp
  open val statusbar: BarProp
  open val toolbar: BarProp
  open var status: String
  open val closed: Boolean
  open val frames: Window
  open val length: Int
  open val top: Window
  open var opener: Any?
  open val parent: Window
  open val frameElement: Element?
  open val navigator: Navigator
  open val applicationCache: ApplicationCache
  open val expect: External
  open val screen: Screen
  open val innerWidth: Int
  open val innerHeight: Int
  open val scrollX: Double
  open val pageXOffset: Double
  open val scrollY: Double
  open val pageYOffset: Double
  open val screenX: Int
  open val screenY: Int
  open val outerWidth: Int
  open val outerHeight: Int
  open val devicePixelRatio: Double
  fun close()
  fun stop()
  fun focus()
  fun blur()
  fun open(
    url: String = definedExternally,
    target: String = definedExternally,
    features: String = definedExternally
  ): Window?
  
  fun alert()
  fun alert(message: String)
  fun confirm(message: String = definedExternally): Boolean
  fun prompt(message: String = definedExternally, default: String = definedExternally): String?
  fun print()
  fun requestAnimationFrame(callback: (String) -> Unit): Int
  fun cancelAnimationFrame(handle: Int)
  fun postMessage(message: Any?, targetOrigin: String, transfer: Array<Dynamic> = definedExternally)
  fun captureEvents()
  fun releaseEvents()
  fun matchMedia(query: String): MediaQueryList
  fun moveTo(x: Int, y: Int)
  fun moveBy(x: Int, y: Int)
  fun resizeTo(x: Int, y: Int)
  fun resizeBy(x: Int, y: Int)
  fun scroll(options: ScrollToOptions = definedExternally)
  fun scroll(x: Double, y: Double)
  fun scrollTo(options: ScrollToOptions = definedExternally)
  fun scrollTo(x: Double, y: Double)
  fun scrollBy(options: ScrollToOptions = definedExternally)
  fun scrollBy(x: Double, y: Double)
  fun getComputedStyle(elt: Element, pseudoElt: String? = definedExternally): CSSStyleDeclaration
}

@kotlin.internal.InlineOnly
inline operator fun Window.get(name: String): Dynamic = asDynamic()[name]

expect abstract class BarProp {
  open val visible: Boolean
}

/**
 * Exposes the JavaScript [History](https://developer.mozilla.org/en/docs/Web/API/History) to Kotlin
 */
expect abstract class History {
  open val length: Int
  open var scrollRestoration: ScrollRestoration
  open val state: Any?
  fun go(delta: Int = definedExternally)
  fun back()
  fun forward()
  fun pushState(data: Any?, title: String, url: String? = definedExternally)
  fun replaceState(data: Any?, title: String, url: String? = definedExternally)
}

/**
 * Exposes the JavaScript [Location](https://developer.mozilla.org/en/docs/Web/API/Location) to Kotlin
 */
expect abstract class Location {
  open var href: String
  open val origin: String
  open var protocol: String
  open var host: String
  open var hostname: String
  open var port: String
  open var pathname: String
  open var search: String
  open var hash: String
  open val ancestorOrigins: Array<out String>
  fun assign(url: String)
  fun replace(url: String)
  fun reload()
}

/**
 * Exposes the JavaScript [PopStateEvent](https://developer.mozilla.org/en/docs/Web/API/PopStateEvent) to Kotlin
 */
expect open class PopStateEvent(type: String, eventInitDict: PopStateEventInit = definedExternally) : Event {
  open val state: Any?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface PopStateEventInit : EventInit {
  var state: Any? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun PopStateEventInit(
  state: Any? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): PopStateEventInit {
  val o = js("({})")
  o["state"] = state
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [HashChangeEvent](https://developer.mozilla.org/en/docs/Web/API/HashChangeEvent) to Kotlin
 */
expect open class HashChangeEvent(type: String, eventInitDict: HashChangeEventInit = definedExternally) : Event {
  open val oldURL: String
  open val newURL: String
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface HashChangeEventInit : EventInit {
  var oldURL: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var newURL: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun HashChangeEventInit(
  oldURL: String? = "",
  newURL: String? = "",
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): HashChangeEventInit {
  val o = js("({})")
  o["oldURL"] = oldURL
  o["newURL"] = newURL
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [PageTransitionEvent](https://developer.mozilla.org/en/docs/Web/API/PageTransitionEvent) to Kotlin
 */
expect open class PageTransitionEvent(type: String, eventInitDict: PageTransitionEventInit = definedExternally) :
  Event {
  open val persisted: Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface PageTransitionEventInit : EventInit {
  var persisted: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun PageTransitionEventInit(
  persisted: Boolean? = false,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): PageTransitionEventInit {
  val o = js("({})")
  o["persisted"] = persisted
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [BeforeUnloadEvent](https://developer.mozilla.org/en/docs/Web/API/BeforeUnloadEvent) to Kotlin
 */
expect open class BeforeUnloadEvent : Event {
  var returnValue: String
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect abstract class ApplicationCache : EventTarget {
  open val status: Short
  open var onchecking: ((Event) -> Dynamic)?
  open var onerror: ((Event) -> Dynamic)?
  open var onnoupdate: ((Event) -> Dynamic)?
  open var ondownloading: ((Event) -> Dynamic)?
  open var onprogress: ((ProgressEvent) -> Dynamic)?
  open var onupdateready: ((Event) -> Dynamic)?
  open var oncached: ((Event) -> Dynamic)?
  open var onobsolete: ((Event) -> Dynamic)?
  fun update()
  fun abort()
  fun swapCache()
  
  companion object {
    val UNCACHED: Short
    val IDLE: Short
    val CHECKING: Short
    val DOWNLOADING: Short
    val UPDATEREADY: Short
    val OBSOLETE: Short
  }
}

/**
 * Exposes the JavaScript [NavigatorOnLine](https://developer.mozilla.org/en/docs/Web/API/NavigatorOnLine) to Kotlin
 */
expect interface NavigatorOnLine {
  val onLine: Boolean
}

/**
 * Exposes the JavaScript [ErrorEvent](https://developer.mozilla.org/en/docs/Web/API/ErrorEvent) to Kotlin
 */
expect open class ErrorEvent(type: String, eventInitDict: ErrorEventInit = definedExternally) : Event {
  open val message: String
  open val filename: String
  open val lineno: Int
  open val colno: Int
  open val error: Any?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface ErrorEventInit : EventInit {
  var message: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var filename: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var lineno: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var colno: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var error: Any? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ErrorEventInit(
  message: String? = "",
  filename: String? = "",
  lineno: Int? = 0,
  colno: Int? = 0,
  error: Any? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): ErrorEventInit {
  val o = js("({})")
  o["message"] = message
  o["filename"] = filename
  o["lineno"] = lineno
  o["colno"] = colno
  o["error"] = error
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [PromiseRejectionEvent](https://developer.mozilla.org/en/docs/Web/API/PromiseRejectionEvent) to Kotlin
 */
expect open class PromiseRejectionEvent(type: String, eventInitDict: PromiseRejectionEventInit) : Event {
  open val promise: Promise<Any?>
  open val reason: Any?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface PromiseRejectionEventInit : EventInit {
  var promise: Promise<Any?>?
    get() = definedExternally
    set(value) = definedExternally
  var reason: Any?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun PromiseRejectionEventInit(
  promise: Promise<Any?>?,
  reason: Any? = undefined,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): PromiseRejectionEventInit {
  val o = js("({})")
  o["promise"] = promise
  o["reason"] = reason
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [Navigator](https://developer.mozilla.org/en/docs/Web/API/Navigator) to Kotlin
 */
expect abstract class Navigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorContentUtils,
  NavigatorCookies, NavigatorPlugins, NavigatorConcurrentHardware {
  open val clipboard: Clipboard
  open val mediaDevices: MediaDevices
  open val maxTouchPoints: Int
  open val serviceWorker: ServiceWorkerContainer
  fun getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: (MediaStream) -> Unit,
    errorCallback: (Dynamic) -> Unit
  )
  
  fun vibrate(pattern: Dynamic): Boolean
}

/**
 * Exposes the JavaScript [NavigatorID](https://developer.mozilla.org/en/docs/Web/API/NavigatorID) to Kotlin
 */
expect interface NavigatorID {
  val appCodeName: String
  val appName: String
  val appVersion: String
  val platform: String
  val product: String
  val productSub: String
  val userAgent: String
  val vendor: String
  val vendorSub: String
  val oscpu: String
  fun taintEnabled(): Boolean
}

/**
 * Exposes the JavaScript [NavigatorLanguage](https://developer.mozilla.org/en/docs/Web/API/NavigatorLanguage) to Kotlin
 */
expect interface NavigatorLanguage {
  val language: String
  val languages: Array<out String>
}

expect interface NavigatorContentUtils {
  fun registerProtocolHandler(scheme: String, url: String, title: String)
  fun registerContentHandler(mimeType: String, url: String, title: String)
  fun isProtocolHandlerRegistered(scheme: String, url: String): String
  fun isContentHandlerRegistered(mimeType: String, url: String): String
  fun unregisterProtocolHandler(scheme: String, url: String)
  fun unregisterContentHandler(mimeType: String, url: String)
}

expect interface NavigatorCookies {
  val cookieEnabled: Boolean
}

/**
 * Exposes the JavaScript [NavigatorPlugins](https://developer.mozilla.org/en/docs/Web/API/NavigatorPlugins) to Kotlin
 */
expect interface NavigatorPlugins {
  val plugins: PluginArray
  val mimeTypes: MimeTypeArray
  fun javaEnabled(): Boolean
}

/**
 * Exposes the JavaScript [PluginArray](https://developer.mozilla.org/en/docs/Web/API/PluginArray) to Kotlin
 */
expect abstract class PluginArray : ItemArrayLike<Plugin> {
  fun refresh(reload: Boolean = definedExternally)
  override fun item(index: Int): Plugin?
  fun namedItem(name: String): Plugin?
}

@kotlin.internal.InlineOnly
inline operator fun PluginArray.get(index: Int): Plugin? = asDynamic()[index]

@kotlin.internal.InlineOnly
inline operator fun PluginArray.get(name: String): Plugin? = asDynamic()[name]

/**
 * Exposes the JavaScript [MimeTypeArray](https://developer.mozilla.org/en/docs/Web/API/MimeTypeArray) to Kotlin
 */
expect abstract class MimeTypeArray : ItemArrayLike<MimeType> {
  override fun item(index: Int): MimeType?
  fun namedItem(name: String): MimeType?
}

@kotlin.internal.InlineOnly
inline operator fun MimeTypeArray.get(index: Int): MimeType? = asDynamic()[index]

@kotlin.internal.InlineOnly
inline operator fun MimeTypeArray.get(name: String): MimeType? = asDynamic()[name]

/**
 * Exposes the JavaScript [Plugin](https://developer.mozilla.org/en/docs/Web/API/Plugin) to Kotlin
 */
expect abstract class Plugin : ItemArrayLike<MimeType> {
  open val name: String
  open val description: String
  open val filename: String
  override fun item(index: Int): MimeType?
  fun namedItem(name: String): MimeType?
}

@kotlin.internal.InlineOnly
inline operator fun Plugin.get(index: Int): MimeType? = asDynamic()[index]

@kotlin.internal.InlineOnly
inline operator fun Plugin.get(name: String): MimeType? = asDynamic()[name]

/**
 * Exposes the JavaScript [MimeType](https://developer.mozilla.org/en/docs/Web/API/MimeType) to Kotlin
 */
expect abstract class MimeType {
  open val type: String
  open val description: String
  open val suffixes: String
  open val enabledPlugin: Plugin
}

/**
 * Exposes the JavaScript [ImageBitmap](https://developer.mozilla.org/en/docs/Web/API/ImageBitmap) to Kotlin
 */
expect abstract class ImageBitmap : CanvasImageSource, TexImageSource {
  open val width: Int
  open val height: Int
  fun close()
}

expect interface ImageBitmapOptions {
  var imageOrientation: ImageOrientation? /* = ImageOrientation.NONE */
    get() = definedExternally
    set(value) = definedExternally
  var premultiplyAlpha: PremultiplyAlpha? /* = PremultiplyAlpha.DEFAULT */
    get() = definedExternally
    set(value) = definedExternally
  var colorSpaceConversion: ColorSpaceConversion? /* = ColorSpaceConversion.DEFAULT */
    get() = definedExternally
    set(value) = definedExternally
  var resizeWidth: Int?
    get() = definedExternally
    set(value) = definedExternally
  var resizeHeight: Int?
    get() = definedExternally
    set(value) = definedExternally
  var resizeQuality: ResizeQuality? /* = ResizeQuality.LOW */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ImageBitmapOptions(
  imageOrientation: ImageOrientation? = ImageOrientation.NONE,
  premultiplyAlpha: PremultiplyAlpha? = PremultiplyAlpha.DEFAULT,
  colorSpaceConversion: ColorSpaceConversion? = ColorSpaceConversion.DEFAULT,
  resizeWidth: Int? = undefined,
  resizeHeight: Int? = undefined,
  resizeQuality: ResizeQuality? = ResizeQuality.LOW
): ImageBitmapOptions {
  val o = js("({})")
  o["imageOrientation"] = imageOrientation
  o["premultiplyAlpha"] = premultiplyAlpha
  o["colorSpaceConversion"] = colorSpaceConversion
  o["resizeWidth"] = resizeWidth
  o["resizeHeight"] = resizeHeight
  o["resizeQuality"] = resizeQuality
  return o
}

/**
 * Exposes the JavaScript [MessageEvent](https://developer.mozilla.org/en/docs/Web/API/MessageEvent) to Kotlin
 */
expect open class MessageEvent(type: String, eventInitDict: MessageEventInit = definedExternally) : Event {
  open val data: Any?
  open val origin: String
  open val lastEventId: String
  open val source: UnionMessagePortOrWindowProxy?
  open val ports: Array<out MessagePort>
  fun initMessageEvent(
    type: String,
    bubbles: Boolean,
    cancelable: Boolean,
    data: Any?,
    origin: String,
    lastEventId: String,
    source: UnionMessagePortOrWindowProxy?,
    ports: Array<MessagePort>
  )
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface MessageEventInit : EventInit {
  var data: Any? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var origin: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var lastEventId: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var source: UnionMessagePortOrWindowProxy? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var ports: Array<MessagePort>? /* = arrayOf() */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun MessageEventInit(
  data: Any? = null,
  origin: String? = "",
  lastEventId: String? = "",
  source: UnionMessagePortOrWindowProxy? = null,
  ports: Array<MessagePort>? = arrayOf(),
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): MessageEventInit {
  val o = js("({})")
  o["data"] = data
  o["origin"] = origin
  o["lastEventId"] = lastEventId
  o["source"] = source
  o["ports"] = ports
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [EventSource](https://developer.mozilla.org/en/docs/Web/API/EventSource) to Kotlin
 */
expect open class EventSource(url: String, eventSourceInitDict: EventSourceInit = definedExternally) : EventTarget {
  open val url: String
  open val withCredentials: Boolean
  open val readyState: Short
  var onopen: ((Event) -> Dynamic)?
  var onmessage: ((MessageEvent) -> Dynamic)?
  var onerror: ((Event) -> Dynamic)?
  fun close()
  
  companion object {
    val CONNECTING: Short
    val OPEN: Short
    val CLOSED: Short
  }
}

expect interface EventSourceInit {
  var withCredentials: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun EventSourceInit(withCredentials: Boolean? = false): EventSourceInit {
  val o = js("({})")
  o["withCredentials"] = withCredentials
  return o
}

/**
 * Exposes the JavaScript [WebSocket](https://developer.mozilla.org/en/docs/Web/API/WebSocket) to Kotlin
 */
expect open class WebSocket(url: String, protocols: Dynamic = definedExternally) : EventTarget {
  open val url: String
  open val readyState: Short
  open val bufferedAmount: Number
  var onopen: ((Event) -> Dynamic)?
  var onerror: ((Event) -> Dynamic)?
  var onclose: ((Event) -> Dynamic)?
  open val extensions: String
  open val protocol: String
  var onmessage: ((MessageEvent) -> Dynamic)?
  var binaryType: BinaryType
  fun close(code: Short = definedExternally, reason: String = definedExternally)
  fun send(data: String)
  fun send(data: Blob)
  fun send(data: ArrayBuffer)
  fun send(data: ArrayBufferView)
  
  companion object {
    val CONNECTING: Short
    val OPEN: Short
    val CLOSING: Short
    val CLOSED: Short
  }
}

/**
 * Exposes the JavaScript [CloseEvent](https://developer.mozilla.org/en/docs/Web/API/CloseEvent) to Kotlin
 */
expect open class CloseEvent(type: String, eventInitDict: CloseEventInit = definedExternally) : Event {
  open val wasClean: Boolean
  open val code: Short
  open val reason: String
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface CloseEventInit : EventInit {
  var wasClean: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var code: Short? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var reason: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun CloseEventInit(
  wasClean: Boolean? = false,
  code: Short? = 0,
  reason: String? = "",
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): CloseEventInit {
  val o = js("({})")
  o["wasClean"] = wasClean
  o["code"] = code
  o["reason"] = reason
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [MessageChannel](https://developer.mozilla.org/en/docs/Web/API/MessageChannel) to Kotlin
 */
expect open class MessageChannel {
  open val port1: MessagePort
  open val port2: MessagePort
}

/**
 * Exposes the JavaScript [MessagePort](https://developer.mozilla.org/en/docs/Web/API/MessagePort) to Kotlin
 */
expect abstract class MessagePort : EventTarget, UnionMessagePortOrWindowProxy, UnionMessagePortOrServiceWorker,
  UnionClientOrMessagePortOrServiceWorker {
  open var onmessage: ((MessageEvent) -> Dynamic)?
  fun postMessage(message: Any?, transfer: Array<Dynamic> = definedExternally)
  fun start()
  fun close()
}

/**
 * Exposes the JavaScript [BroadcastChannel](https://developer.mozilla.org/en/docs/Web/API/BroadcastChannel) to Kotlin
 */
expect open class BroadcastChannel(name: String) : EventTarget {
  open val name: String
  var onmessage: ((MessageEvent) -> Dynamic)?
  fun postMessage(message: Any?)
  fun close()
}

/**
 * Exposes the JavaScript [WorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WorkerGlobalScope) to Kotlin
 */
expect abstract class WorkerGlobalScope : EventTarget, WindowOrWorkerGlobalScope, GlobalPerformance {
  open val self: WorkerGlobalScope
  open val location: WorkerLocation
  open val navigator: WorkerNavigator
  open var onerror: ((Dynamic, String, Int, Int, Any?) -> Dynamic)?
  open var onlanguagechange: ((Event) -> Dynamic)?
  open var onoffline: ((Event) -> Dynamic)?
  open var ononline: ((Event) -> Dynamic)?
  open var onrejectionhandled: ((Event) -> Dynamic)?
  open var onunhandledrejection: ((PromiseRejectionEvent) -> Dynamic)?
  fun importScripts(vararg urls: String)
}

/**
 * Exposes the JavaScript [DedicatedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/DedicatedWorkerGlobalScope) to Kotlin
 */
expect abstract class DedicatedWorkerGlobalScope : WorkerGlobalScope {
  open var onmessage: ((MessageEvent) -> Dynamic)?
  fun postMessage(message: Any?, transfer: Array<Dynamic> = definedExternally)
  fun close()
}

/**
 * Exposes the JavaScript [SharedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/SharedWorkerGlobalScope) to Kotlin
 */
expect abstract class SharedWorkerGlobalScope : WorkerGlobalScope {
  open val name: String
  open val applicationCache: ApplicationCache
  open var onconnect: ((Event) -> Dynamic)?
  fun close()
}

/**
 * Exposes the JavaScript [AbstractWorker](https://developer.mozilla.org/en/docs/Web/API/AbstractWorker) to Kotlin
 */
expect interface AbstractWorker {
  var onerror: ((Event) -> Dynamic)?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Exposes the JavaScript [Worker](https://developer.mozilla.org/en/docs/Web/API/Worker) to Kotlin
 */
expect open class Worker(scriptURL: String, options: WorkerOptions = definedExternally) : EventTarget, AbstractWorker {
  var onmessage: ((MessageEvent) -> Dynamic)?
  override var onerror: ((Event) -> Dynamic)?
  fun terminate()
  fun postMessage(message: Any?, transfer: Array<Dynamic> = definedExternally)
}

expect interface WorkerOptions {
  var type: WorkerType? /* = WorkerType.CLASSIC */
    get() = definedExternally
    set(value) = definedExternally
  var credentials: RequestCredentials? /* = RequestCredentials.OMIT */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun WorkerOptions(
  type: WorkerType? = WorkerType.CLASSIC,
  credentials: RequestCredentials? = RequestCredentials.OMIT
): WorkerOptions {
  val o = js("({})")
  o["type"] = type
  o["credentials"] = credentials
  return o
}

/**
 * Exposes the JavaScript [SharedWorker](https://developer.mozilla.org/en/docs/Web/API/SharedWorker) to Kotlin
 */
expect open class SharedWorker(
  scriptURL: String,
  name: String = definedExternally,
  options: WorkerOptions = definedExternally
) : EventTarget, AbstractWorker {
  open val port: MessagePort
  override var onerror: ((Event) -> Dynamic)?
}

/**
 * Exposes the JavaScript [NavigatorConcurrentHardware](https://developer.mozilla.org/en/docs/Web/API/NavigatorConcurrentHardware) to Kotlin
 */
expect interface NavigatorConcurrentHardware {
  val hardwareConcurrency: Number
}

/**
 * Exposes the JavaScript [WorkerNavigator](https://developer.mozilla.org/en/docs/Web/API/WorkerNavigator) to Kotlin
 */
expect abstract class WorkerNavigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorConcurrentHardware {
  open val serviceWorker: ServiceWorkerContainer
}

/**
 * Exposes the JavaScript [WorkerLocation](https://developer.mozilla.org/en/docs/Web/API/WorkerLocation) to Kotlin
 */
expect abstract class WorkerLocation {
  open val href: String
  open val origin: String
  open val protocol: String
  open val host: String
  open val hostname: String
  open val port: String
  open val pathname: String
  open val search: String
  open val hash: String
}

/**
 * Exposes the JavaScript [Storage](https://developer.mozilla.org/en/docs/Web/API/Storage) to Kotlin
 */
expect abstract class Storage {
  open val length: Int
  fun key(index: Int): String?
  fun removeItem(key: String)
  fun clear()
  fun getItem(key: String): String?
  fun setItem(key: String, value: String)
}

@kotlin.internal.InlineOnly
inline operator fun Storage.get(key: String): String? = asDynamic()[key]

@kotlin.internal.InlineOnly
inline operator fun Storage.set(key: String, value: String) {
  asDynamic()[key] = value
}

/**
 * Exposes the JavaScript [WindowSessionStorage](https://developer.mozilla.org/en/docs/Web/API/WindowSessionStorage) to Kotlin
 */
expect interface WindowSessionStorage {
  val sessionStorage: Storage
}

/**
 * Exposes the JavaScript [WindowLocalStorage](https://developer.mozilla.org/en/docs/Web/API/WindowLocalStorage) to Kotlin
 */
expect interface WindowLocalStorage {
  val localStorage: Storage
}

/**
 * Exposes the JavaScript [StorageEvent](https://developer.mozilla.org/en/docs/Web/API/StorageEvent) to Kotlin
 */
expect open class StorageEvent(type: String, eventInitDict: StorageEventInit = definedExternally) : Event {
  open val key: String?
  open val oldValue: String?
  open val newValue: String?
  open val url: String
  open val storageArea: Storage?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface StorageEventInit : EventInit {
  var key: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var oldValue: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var newValue: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var url: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var storageArea: Storage? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun StorageEventInit(
  key: String? = null,
  oldValue: String? = null,
  newValue: String? = null,
  url: String? = "",
  storageArea: Storage? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): StorageEventInit {
  val o = js("({})")
  o["key"] = key
  o["oldValue"] = oldValue
  o["newValue"] = newValue
  o["url"] = url
  o["storageArea"] = storageArea
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

expect abstract class HTMLAppletElement : HTMLElement {
  open var align: String
  open var alt: String
  open var archive: String
  open var code: String
  open var codeBase: String
  open var height: String
  open var hspace: Int
  open var name: String
  open var _object: String
  open var vspace: Int
  open var width: String
  
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

/**
 * Exposes the JavaScript [HTMLMarqueeElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMarqueeElement) to Kotlin
 */
expect abstract class HTMLMarqueeElement : HTMLElement {
  open var behavior: String
  open var bgColor: String
  open var direction: String
  open var height: String
  open var hspace: Int
  open var loop: Int
  open var scrollAmount: Int
  open var scrollDelay: Int
  open var trueSpeed: Boolean
  open var vspace: Int
  open var width: String
  open var onbounce: ((Event) -> Dynamic)?
  open var onfinish: ((Event) -> Dynamic)?
  open var onstart: ((Event) -> Dynamic)?
  fun start()
  fun stop()
  
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

/**
 * Exposes the JavaScript [HTMLFrameSetElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFrameSetElement) to Kotlin
 */
expect abstract class HTMLFrameSetElement : HTMLElement, WindowEventHandlers {
  open var cols: String
  open var rows: String
  
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

expect abstract class HTMLFrameElement : HTMLElement {
  open var name: String
  open var scrolling: String
  open var src: String
  open var frameBorder: String
  open var longDesc: String
  open var noResize: Boolean
  open val contentDocument: Document?
  open val contentWindow: Window?
  open var marginHeight: String
  open var marginWidth: String
  
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

expect abstract class HTMLDirectoryElement : HTMLElement {
  open var compact: Boolean
  
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

/**
 * Exposes the JavaScript [HTMLFontElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFontElement) to Kotlin
 */
expect abstract class HTMLFontElement : HTMLElement {
  open var color: String
  open var face: String
  open var size: String
  
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

expect interface External {
  fun AddSearchProvider()
  fun IsSearchProviderInstalled()
}

expect interface EventInit {
  var bubbles: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var cancelable: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var composed: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun EventInit(bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): EventInit {
  val o = js("({})")
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [CustomEvent](https://developer.mozilla.org/en/docs/Web/API/CustomEvent) to Kotlin
 */
expect open class CustomEvent(type: String, eventInitDict: CustomEventInit = definedExternally) : Event {
  open val detail: Any?
  fun initCustomEvent(type: String, bubbles: Boolean, cancelable: Boolean, detail: Any?)
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface CustomEventInit : EventInit {
  var detail: Any? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun CustomEventInit(
  detail: Any? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): CustomEventInit {
  val o = js("({})")
  o["detail"] = detail
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

expect interface EventListenerOptions {
  var capture: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun EventListenerOptions(capture: Boolean? = false): EventListenerOptions {
  val o = js("({})")
  o["capture"] = capture
  return o
}

expect interface AddEventListenerOptions : EventListenerOptions {
  var passive: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var once: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun AddEventListenerOptions(
  passive: Boolean? = false,
  once: Boolean? = false,
  capture: Boolean? = false
): AddEventListenerOptions {
  val o = js("({})")
  o["passive"] = passive
  o["once"] = once
  o["capture"] = capture
  return o
}

expect interface NonElementParentNode {
  fun getElementById(elementId: String): Element?
}

/**
 * Exposes the JavaScript [DocumentOrShadowRoot](https://developer.mozilla.org/en/docs/Web/API/DocumentOrShadowRoot) to Kotlin
 */
expect interface DocumentOrShadowRoot {
  val fullscreenElement: Element?
    get() = definedExternally
}


/**
 * Exposes the JavaScript [MutationObserver](https://developer.mozilla.org/en/docs/Web/API/MutationObserver) to Kotlin
 */
expect open class MutationObserver(callback: (Array<MutationRecord>, MutationObserver) -> Unit) {
  fun observe(target: Node, options: MutationObserverInit = definedExternally)
  fun disconnect()
  fun takeRecords(): Array<MutationRecord>
}

/**
 * Exposes the JavaScript [MutationObserverInit](https://developer.mozilla.org/en/docs/Web/API/MutationObserverInit) to Kotlin
 */
expect interface MutationObserverInit {
  var childList: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var attributes: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  var characterData: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  var subtree: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var attributeOldValue: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  var characterDataOldValue: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  var attributeFilter: Array<String>?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun MutationObserverInit(
  childList: Boolean? = false,
  attributes: Boolean? = undefined,
  characterData: Boolean? = undefined,
  subtree: Boolean? = false,
  attributeOldValue: Boolean? = undefined,
  characterDataOldValue: Boolean? = undefined,
  attributeFilter: Array<String>? = undefined
): MutationObserverInit {
  val o = js("({})")
  o["childList"] = childList
  o["attributes"] = attributes
  o["characterData"] = characterData
  o["subtree"] = subtree
  o["attributeOldValue"] = attributeOldValue
  o["characterDataOldValue"] = characterDataOldValue
  o["attributeFilter"] = attributeFilter
  return o
}

/**
 * Exposes the JavaScript [MutationRecord](https://developer.mozilla.org/en/docs/Web/API/MutationRecord) to Kotlin
 */
expect abstract class MutationRecord {
  open val type: String
  open val target: Node
  open val addedNodes: NodeList
  open val removedNodes: NodeList
  open val previousSibling: Node?
  open val nextSibling: Node?
  open val attributeName: String?
  open val attributeNamespace: String?
  open val oldValue: String?
}

/**
 * Exposes the JavaScript [Document](https://developer.mozilla.org/en/docs/Web/API/Document) to Kotlin
 */
expect open class Document : Node, GlobalEventHandlers, DocumentAndElementEventHandlers, NonElementParentNode,
  DocumentOrShadowRoot, ParentNode, GeometryUtils {
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
  var onreadystatechange: ((Event) -> Dynamic)?
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
  var onfullscreenchange: ((Event) -> Dynamic)?
  var onfullscreenerror: ((Event) -> Dynamic)?
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
  override val fullscreenElement: Element?
  override val children: HTMLCollection
  override val firstElementChild: Element?
  override val lastElementChild: Element?
  override val childElementCount: Int
  fun getElementsByTagName(qualifiedName: String): HTMLCollection
  fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection
  fun getElementsByClassName(classNames: String): HTMLCollection
  fun createElement(localName: String, options: ElementCreationOptions = definedExternally): Element
  fun createElementNS(
    namespace: String?,
    qualifiedName: String,
    options: ElementCreationOptions = definedExternally
  ): Element
  
  fun createDocumentFragment(): DocumentFragment
  fun createTextNode(data: String): Text
  fun createCDATASection(data: String): CDATASection
  fun createComment(data: String): Comment
  fun createProcessingInstruction(target: String, data: String): ProcessingInstruction
  fun importNode(node: Node, deep: Boolean = definedExternally): Node
  fun adoptNode(node: Node): Node
  fun createAttribute(localName: String): Attr
  fun createAttributeNS(namespace: String?, qualifiedName: String): Attr
  fun createEvent(`interface`: String): Event
  fun createRange(): Range
  fun createNodeIterator(
    root: Node,
    whatToShow: Int = definedExternally,
    filter: NodeFilter? = definedExternally
  ): NodeIterator
  
  fun createNodeIterator(
    root: Node,
    whatToShow: Int = definedExternally,
    filter: ((Node) -> Short)? = definedExternally
  ): NodeIterator
  
  fun createTreeWalker(
    root: Node,
    whatToShow: Int = definedExternally,
    filter: NodeFilter? = definedExternally
  ): TreeWalker
  
  fun createTreeWalker(
    root: Node,
    whatToShow: Int = definedExternally,
    filter: ((Node) -> Short)? = definedExternally
  ): TreeWalker
  
  fun getElementsByName(elementName: String): NodeList
  fun open(type: String = definedExternally, replace: String = definedExternally): Document
  fun open(url: String, name: String, features: String): Window
  fun close()
  fun write(vararg text: String)
  fun writeln(vararg text: String)
  fun hasFocus(): Boolean
  fun execCommand(commandId: String, showUI: Boolean = definedExternally, value: String = definedExternally): Boolean
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
  override fun prepend(vararg nodes: Dynamic)
  override fun append(vararg nodes: Dynamic)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
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

@kotlin.internal.InlineOnly
inline operator fun Document.get(name: String): Dynamic = asDynamic()[name]

/**
 * Exposes the JavaScript [XMLDocument](https://developer.mozilla.org/en/docs/Web/API/XMLDocument) to Kotlin
 */
expect open class XMLDocument : Document {
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

expect interface ElementCreationOptions {
  var `is`: String?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ElementCreationOptions(`is`: String? = undefined): ElementCreationOptions {
  val o = js("({})")
  o["is"] = `is`
  return o
}

/**
 * Exposes the JavaScript [DOMImplementation](https://developer.mozilla.org/en/docs/Web/API/DOMImplementation) to Kotlin
 */
expect abstract class DOMImplementation {
  fun createDocumentType(qualifiedName: String, publicId: String, systemId: String): DocumentType
  fun createDocument(namespace: String?, qualifiedName: String, doctype: DocumentType? = definedExternally): XMLDocument
  fun createHTMLDocument(title: String = definedExternally): Document
  fun hasFeature(): Boolean
}

/**
 * Exposes the JavaScript [DocumentType](https://developer.mozilla.org/en/docs/Web/API/DocumentType) to Kotlin
 */
expect abstract class DocumentType : Node, ChildNode {
  open val name: String
  open val publicId: String
  open val systemId: String
  
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

/**
 * Exposes the JavaScript [DocumentFragment](https://developer.mozilla.org/en/docs/Web/API/DocumentFragment) to Kotlin
 */
expect open class DocumentFragment : Node, NonElementParentNode, ParentNode {
  override val children: HTMLCollection
  override val firstElementChild: Element?
  override val lastElementChild: Element?
  override val childElementCount: Int
  override fun getElementById(elementId: String): Element?
  override fun prepend(vararg nodes: Dynamic)
  override fun append(vararg nodes: Dynamic)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
  
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

/**
 * Exposes the JavaScript [ShadowRoot](https://developer.mozilla.org/en/docs/Web/API/ShadowRoot) to Kotlin
 */
expect open class ShadowRoot : DocumentFragment, DocumentOrShadowRoot {
  open val mode: ShadowRootMode
  open val host: Element
  override val fullscreenElement: Element?
  
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

expect interface ShadowRootInit {
  var mode: ShadowRootMode?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ShadowRootInit(mode: ShadowRootMode?): ShadowRootInit {
  val o = js("({})")
  o["mode"] = mode
  return o
}

/**
 * Exposes the JavaScript [NamedNodeMap](https://developer.mozilla.org/en/docs/Web/API/NamedNodeMap) to Kotlin
 */
expect abstract class NamedNodeMap : ItemArrayLike<Attr> {
  fun getNamedItemNS(namespace: String?, localName: String): Attr?
  fun setNamedItem(attr: Attr): Attr?
  fun setNamedItemNS(attr: Attr): Attr?
  fun removeNamedItem(qualifiedName: String): Attr
  fun removeNamedItemNS(namespace: String?, localName: String): Attr
  override fun item(index: Int): Attr?
  fun getNamedItem(qualifiedName: String): Attr?
}

@kotlin.internal.InlineOnly
inline operator fun NamedNodeMap.get(index: Int): Attr? = asDynamic()[index]

@kotlin.internal.InlineOnly
inline operator fun NamedNodeMap.get(qualifiedName: String): Attr? = asDynamic()[qualifiedName]

/**
 * Exposes the JavaScript [Attr](https://developer.mozilla.org/en/docs/Web/API/Attr) to Kotlin
 */
expect abstract class Attr : Node {
  open val namespaceURI: String?
  open val prefix: String?
  open val localName: String
  open val name: String
  open var value: String
  open val ownerElement: Element?
  open val specified: Boolean
  
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

/**
 * Exposes the JavaScript [CharacterData](https://developer.mozilla.org/en/docs/Web/API/CharacterData) to Kotlin
 */
expect abstract class CharacterData : Node, NonDocumentTypeChildNode, ChildNode {
  open var data: String
  open val length: Int
  fun substringData(offset: Int, count: Int): String
  fun appendData(data: String)
  fun insertData(offset: Int, data: String)
  fun deleteData(offset: Int, count: Int)
  fun replaceData(offset: Int, count: Int, data: String)
  
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

/**
 * Exposes the JavaScript [Text](https://developer.mozilla.org/en/docs/Web/API/Text) to Kotlin
 */
expect open class Text(data: String = definedExternally) : CharacterData, Slotable, GeometryUtils {
  open val wholeText: String
  override val assignedSlot: HTMLSlotElement?
  override val previousElementSibling: Element?
  override val nextElementSibling: Element?
  fun splitText(offset: Int): Text
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
  
  override fun before(vararg nodes: Dynamic)
  override fun after(vararg nodes: Dynamic)
  override fun replaceWith(vararg nodes: Dynamic)
  override fun remove()
  
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

/**
 * Exposes the JavaScript [CDATASection](https://developer.mozilla.org/en/docs/Web/API/CDATASection) to Kotlin
 */
expect open class CDATASection : Text {
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

/**
 * Exposes the JavaScript [ProcessingInstruction](https://developer.mozilla.org/en/docs/Web/API/ProcessingInstruction) to Kotlin
 */
expect abstract class ProcessingInstruction : CharacterData, LinkStyle,
  UnionElementOrProcessingInstruction {
  open val target: String
  
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

/**
 * Exposes the JavaScript [Comment](https://developer.mozilla.org/en/docs/Web/API/Comment) to Kotlin
 */
expect open class Comment(data: String = definedExternally) : CharacterData {
  override val previousElementSibling: Element?
  override val nextElementSibling: Element?
  override fun before(vararg nodes: Dynamic)
  override fun after(vararg nodes: Dynamic)
  override fun replaceWith(vararg nodes: Dynamic)
  override fun remove()
  
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

/**
 * Exposes the JavaScript [Range](https://developer.mozilla.org/en/docs/Web/API/Range) to Kotlin
 */
expect open class Range {
  open val startContainer: Node
  open val startOffset: Int
  open val endContainer: Node
  open val endOffset: Int
  open val collapsed: Boolean
  open val commonAncestorContainer: Node
  fun setStart(node: Node, offset: Int)
  fun setEnd(node: Node, offset: Int)
  fun setStartBefore(node: Node)
  fun setStartAfter(node: Node)
  fun setEndBefore(node: Node)
  fun setEndAfter(node: Node)
  fun collapse(toStart: Boolean = definedExternally)
  fun selectNode(node: Node)
  fun selectNodeContents(node: Node)
  fun compareBoundaryPoints(how: Short, sourceRange: Range): Short
  fun deleteContents()
  fun extractContents(): DocumentFragment
  fun cloneContents(): DocumentFragment
  fun insertNode(node: Node)
  fun surroundContents(newParent: Node)
  fun cloneRange(): Range
  fun detach()
  fun isPointInRange(node: Node, offset: Int): Boolean
  fun comparePoint(node: Node, offset: Int): Short
  fun intersectsNode(node: Node): Boolean
  fun getClientRects(): Array<DOMRect>
  fun getBoundingClientRect(): DOMRect
  fun createContextualFragment(fragment: String): DocumentFragment
  
  companion object {
    val START_TO_START: Short
    val START_TO_END: Short
    val END_TO_END: Short
    val END_TO_START: Short
  }
}

/**
 * Exposes the JavaScript [NodeIterator](https://developer.mozilla.org/en/docs/Web/API/NodeIterator) to Kotlin
 */
expect abstract class NodeIterator {
  open val root: Node
  open val referenceNode: Node
  open val pointerBeforeReferenceNode: Boolean
  open val whatToShow: Int
  open val filter: NodeFilter?
  fun nextNode(): Node?
  fun previousNode(): Node?
  fun detach()
}

/**
 * Exposes the JavaScript [TreeWalker](https://developer.mozilla.org/en/docs/Web/API/TreeWalker) to Kotlin
 */
expect abstract class TreeWalker {
  open val root: Node
  open val whatToShow: Int
  open val filter: NodeFilter?
  open var currentNode: Node
  fun parentNode(): Node?
  fun firstChild(): Node?
  fun lastChild(): Node?
  fun previousSibling(): Node?
  fun nextSibling(): Node?
  fun previousNode(): Node?
  fun nextNode(): Node?
}

/**
 * Exposes the JavaScript [NodeFilter](https://developer.mozilla.org/en/docs/Web/API/NodeFilter) to Kotlin
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface NodeFilter {
  fun acceptNode(node: Node): Short
  
  companion object {
    val FILTER_ACCEPT: Short
    val FILTER_REJECT: Short
    val FILTER_SKIP: Short
    val SHOW_ALL: Int
    val SHOW_ELEMENT: Int
    val SHOW_ATTRIBUTE: Int
    val SHOW_TEXT: Int
    val SHOW_CDATA_SECTION: Int
    val SHOW_ENTITY_REFERENCE: Int
    val SHOW_ENTITY: Int
    val SHOW_PROCESSING_INSTRUCTION: Int
    val SHOW_COMMENT: Int
    val SHOW_DOCUMENT: Int
    val SHOW_DOCUMENT_TYPE: Int
    val SHOW_DOCUMENT_FRAGMENT: Int
    val SHOW_NOTATION: Int
  }
}

/**
 * Exposes the JavaScript [DOMTokenList](https://developer.mozilla.org/en/docs/Web/API/DOMTokenList) to Kotlin
 */
expect abstract class DOMTokenList : ItemArrayLike<String> {
  open var value: String
  fun contains(token: String): Boolean
  fun add(vararg tokens: String)
  fun remove(vararg tokens: String)
  fun toggle(token: String, force: Boolean = definedExternally): Boolean
  fun replace(token: String, newToken: String)
  fun supports(token: String): Boolean
  override fun item(index: Int): String?
}

@kotlin.internal.InlineOnly
inline operator fun DOMTokenList.get(index: Int): String? = asDynamic()[index]

/**
 * Exposes the JavaScript [DOMPointReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMPointReadOnly) to Kotlin
 */
expect open class DOMPointReadOnly(x: Double, y: Double, z: Double, w: Double) {
  open val x: Double
  open val y: Double
  open val z: Double
  open val w: Double
  fun matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint
}

/**
 * Exposes the JavaScript [DOMPoint](https://developer.mozilla.org/en/docs/Web/API/DOMPoint) to Kotlin
 */
expect open class DOMPoint : DOMPointReadOnly {
  constructor(point: DOMPointInit)
  constructor(
    x: Double = definedExternally,
    y: Double = definedExternally,
    z: Double = definedExternally,
    w: Double = definedExternally
  )
  
  override var x: Double
  override var y: Double
  override var z: Double
  override var w: Double
}

/**
 * Exposes the JavaScript [DOMPointInit](https://developer.mozilla.org/en/docs/Web/API/DOMPointInit) to Kotlin
 */
expect interface DOMPointInit {
  var x: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var y: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var z: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var w: Double? /* = 1.0 */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun DOMPointInit(x: Double? = 0.0, y: Double? = 0.0, z: Double? = 0.0, w: Double? = 1.0): DOMPointInit {
  val o = js("({})")
  o["x"] = x
  o["y"] = y
  o["z"] = z
  o["w"] = w
  return o
}

/**
 * Exposes the JavaScript [DOMRect](https://developer.mozilla.org/en/docs/Web/API/DOMRect) to Kotlin
 */
expect open class DOMRect(
  x: Double = definedExternally,
  y: Double = definedExternally,
  width: Double = definedExternally,
  height: Double = definedExternally
) : DOMRectReadOnly {
  override var x: Double
  override var y: Double
  override var width: Double
  override var height: Double
}

/**
 * Exposes the JavaScript [DOMRectReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMRectReadOnly) to Kotlin
 */
expect open class DOMRectReadOnly(x: Double, y: Double, width: Double, height: Double) {
  open val x: Double
  open val y: Double
  open val width: Double
  open val height: Double
  open val top: Double
  open val right: Double
  open val bottom: Double
  open val left: Double
}

expect interface DOMRectInit {
  var x: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var y: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var width: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var height: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun DOMRectInit(x: Double? = 0.0, y: Double? = 0.0, width: Double? = 0.0, height: Double? = 0.0): DOMRectInit {
  val o = js("({})")
  o["x"] = x
  o["y"] = y
  o["width"] = width
  o["height"] = height
  return o
}

expect interface DOMRectList : ItemArrayLike<DOMRect> {
  override fun item(index: Int): DOMRect?
}

@kotlin.internal.InlineOnly
inline operator fun DOMRectList.get(index: Int): DOMRect? = asDynamic()[index]

/**
 * Exposes the JavaScript [DOMQuad](https://developer.mozilla.org/en/docs/Web/API/DOMQuad) to Kotlin
 */
expect open class DOMQuad {
  constructor(
    p1: DOMPointInit = definedExternally,
    p2: DOMPointInit = definedExternally,
    p3: DOMPointInit = definedExternally,
    p4: DOMPointInit = definedExternally
  )
  
  constructor(rect: DOMRectInit)
  
  open val p1: DOMPoint
  open val p2: DOMPoint
  open val p3: DOMPoint
  open val p4: DOMPoint
  open val bounds: DOMRectReadOnly
}

/**
 * Exposes the JavaScript [DOMMatrixReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMMatrixReadOnly) to Kotlin
 */
expect open class DOMMatrixReadOnly(numberSequence: Array<Double>) {
  open val a: Double
  open val b: Double
  open val c: Double
  open val d: Double
  open val e: Double
  open val f: Double
  open val m11: Double
  open val m12: Double
  open val m13: Double
  open val m14: Double
  open val m21: Double
  open val m22: Double
  open val m23: Double
  open val m24: Double
  open val m31: Double
  open val m32: Double
  open val m33: Double
  open val m34: Double
  open val m41: Double
  open val m42: Double
  open val m43: Double
  open val m44: Double
  open val is2D: Boolean
  open val isIdentity: Boolean
  fun translate(tx: Double, ty: Double, tz: Double = definedExternally): DOMMatrix
  fun scale(scale: Double, originX: Double = definedExternally, originY: Double = definedExternally): DOMMatrix
  fun scale3d(
    scale: Double,
    originX: Double = definedExternally,
    originY: Double = definedExternally,
    originZ: Double = definedExternally
  ): DOMMatrix
  
  fun scaleNonUniform(
    scaleX: Double,
    scaleY: Double = definedExternally,
    scaleZ: Double = definedExternally,
    originX: Double = definedExternally,
    originY: Double = definedExternally,
    originZ: Double = definedExternally
  ): DOMMatrix
  
  fun rotate(angle: Double, originX: Double = definedExternally, originY: Double = definedExternally): DOMMatrix
  fun rotateFromVector(x: Double, y: Double): DOMMatrix
  fun rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): DOMMatrix
  fun skewX(sx: Double): DOMMatrix
  fun skewY(sy: Double): DOMMatrix
  fun multiply(other: DOMMatrix): DOMMatrix
  fun flipX(): DOMMatrix
  fun flipY(): DOMMatrix
  fun inverse(): DOMMatrix
  fun transformPoint(point: DOMPointInit = definedExternally): DOMPoint
  fun toFloat32Array(): Float32Array
  fun toFloat64Array(): Float64Array
}

/**
 * Exposes the JavaScript [DOMMatrix](https://developer.mozilla.org/en/docs/Web/API/DOMMatrix) to Kotlin
 */
expect open class DOMMatrix() : DOMMatrixReadOnly {
  constructor(transformList: String)
  constructor(other: DOMMatrixReadOnly)
  constructor(array32: Float32Array)
  constructor(array64: Float64Array)
  constructor(numberSequence: Array<Double>)
  
  override var a: Double
  override var b: Double
  override var c: Double
  override var d: Double
  override var e: Double
  override var f: Double
  override var m11: Double
  override var m12: Double
  override var m13: Double
  override var m14: Double
  override var m21: Double
  override var m22: Double
  override var m23: Double
  override var m24: Double
  override var m31: Double
  override var m32: Double
  override var m33: Double
  override var m34: Double
  override var m41: Double
  override var m42: Double
  override var m43: Double
  override var m44: Double
  fun multiplySelf(other: DOMMatrix): DOMMatrix
  fun preMultiplySelf(other: DOMMatrix): DOMMatrix
  fun translateSelf(tx: Double, ty: Double, tz: Double = definedExternally): DOMMatrix
  fun scaleSelf(scale: Double, originX: Double = definedExternally, originY: Double = definedExternally): DOMMatrix
  fun scale3dSelf(
    scale: Double,
    originX: Double = definedExternally,
    originY: Double = definedExternally,
    originZ: Double = definedExternally
  ): DOMMatrix
  
  fun scaleNonUniformSelf(
    scaleX: Double,
    scaleY: Double = definedExternally,
    scaleZ: Double = definedExternally,
    originX: Double = definedExternally,
    originY: Double = definedExternally,
    originZ: Double = definedExternally
  ): DOMMatrix
  
  fun rotateSelf(angle: Double, originX: Double = definedExternally, originY: Double = definedExternally): DOMMatrix
  fun rotateFromVectorSelf(x: Double, y: Double): DOMMatrix
  fun rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix
  fun skewXSelf(sx: Double): DOMMatrix
  fun skewYSelf(sy: Double): DOMMatrix
  fun invertSelf(): DOMMatrix
  fun setMatrixValue(transformList: String): DOMMatrix
}

expect interface ScrollOptions {
  var behavior: ScrollBehavior? /* = ScrollBehavior.AUTO */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ScrollOptions(behavior: ScrollBehavior? = ScrollBehavior.AUTO): ScrollOptions {
  val o = js("({})")
  o["behavior"] = behavior
  return o
}

/**
 * Exposes the JavaScript [ScrollToOptions](https://developer.mozilla.org/en/docs/Web/API/ScrollToOptions) to Kotlin
 */
expect interface ScrollToOptions : ScrollOptions {
  var left: Double?
    get() = definedExternally
    set(value) = definedExternally
  var top: Double?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ScrollToOptions(
  left: Double? = undefined,
  top: Double? = undefined,
  behavior: ScrollBehavior? = ScrollBehavior.AUTO
): ScrollToOptions {
  val o = js("({})")
  o["left"] = left
  o["top"] = top
  o["behavior"] = behavior
  return o
}

/**
 * Exposes the JavaScript [MediaQueryList](https://developer.mozilla.org/en/docs/Web/API/MediaQueryList) to Kotlin
 */
expect abstract class MediaQueryList : EventTarget {
  open val media: String
  open val matches: Boolean
  open var onchange: ((Event) -> Dynamic)?
  fun addListener(listener: EventListener?)
  fun addListener(listener: ((Event) -> Unit)?)
  fun removeListener(listener: EventListener?)
  fun removeListener(listener: ((Event) -> Unit)?)
}

/**
 * Exposes the JavaScript [MediaQueryListEvent](https://developer.mozilla.org/en/docs/Web/API/MediaQueryListEvent) to Kotlin
 */
expect open class MediaQueryListEvent(type: String, eventInitDict: MediaQueryListEventInit = definedExternally) :
  Event {
  open val media: String
  open val matches: Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface MediaQueryListEventInit : EventInit {
  var media: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var matches: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun MediaQueryListEventInit(
  media: String? = "",
  matches: Boolean? = false,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): MediaQueryListEventInit {
  val o = js("({})")
  o["media"] = media
  o["matches"] = matches
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [Screen](https://developer.mozilla.org/en/docs/Web/API/Screen) to Kotlin
 */
expect abstract class Screen {
  open val availWidth: Int
  open val availHeight: Int
  open val width: Int
  open val height: Int
  open val colorDepth: Int
  open val pixelDepth: Int
}

/**
 * Exposes the JavaScript [CaretPosition](https://developer.mozilla.org/en/docs/Web/API/CaretPosition) to Kotlin
 */
expect abstract class CaretPosition {
  open val offsetNode: Node
  open val offset: Int
  fun getClientRect(): DOMRect?
}

expect interface ScrollIntoViewOptions : ScrollOptions {
  var block: ScrollLogicalPosition? /* = ScrollLogicalPosition.CENTER */
    get() = definedExternally
    set(value) = definedExternally
  var inline: ScrollLogicalPosition? /* = ScrollLogicalPosition.CENTER */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ScrollIntoViewOptions(
  block: ScrollLogicalPosition? = ScrollLogicalPosition.CENTER,
  inline: ScrollLogicalPosition? = ScrollLogicalPosition.CENTER,
  behavior: ScrollBehavior? = ScrollBehavior.AUTO
): ScrollIntoViewOptions {
  val o = js("({})")
  o["block"] = block
  o["inline"] = inline
  o["behavior"] = behavior
  return o
}

expect interface BoxQuadOptions {
  var box: CSSBoxType? /* = CSSBoxType.BORDER */
    get() = definedExternally
    set(value) = definedExternally
  var relativeTo: Dynamic
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun BoxQuadOptions(box: CSSBoxType? = CSSBoxType.BORDER, relativeTo: Dynamic = undefined): BoxQuadOptions {
  val o = js("({})")
  o["box"] = box
  o["relativeTo"] = relativeTo
  return o
}

expect interface ConvertCoordinateOptions {
  var fromBox: CSSBoxType? /* = CSSBoxType.BORDER */
    get() = definedExternally
    set(value) = definedExternally
  var toBox: CSSBoxType? /* = CSSBoxType.BORDER */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun ConvertCoordinateOptions(
  fromBox: CSSBoxType? = CSSBoxType.BORDER,
  toBox: CSSBoxType? = CSSBoxType.BORDER
): ConvertCoordinateOptions {
  val o = js("({})")
  o["fromBox"] = fromBox
  o["toBox"] = toBox
  return o
}

/**
 * Exposes the JavaScript [Touch](https://developer.mozilla.org/en/docs/Web/API/Touch) to Kotlin
 */
expect abstract class Touch {
  open val identifier: Int
  open val target: EventTarget
  open val screenX: Int
  open val screenY: Int
  open val clientX: Int
  open val clientY: Int
  open val pageX: Int
  open val pageY: Int
  open val region: String?
}

expect abstract class TouchList : ItemArrayLike<Touch> {
  override fun item(index: Int): Touch?
}

@kotlin.internal.InlineOnly
inline operator fun TouchList.get(index: Int): Touch? = asDynamic()[index]

expect open class TouchEvent : UIEvent {
  open val touches: TouchList
  open val targetTouches: TouchList
  open val changedTouches: TouchList
  open val altKey: Boolean
  open val metaKey: Boolean
  open val ctrlKey: Boolean
  open val shiftKey: Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

/**
 * Exposes the JavaScript [Image](https://developer.mozilla.org/en/docs/Web/API/Image) to Kotlin
 */
expect open class Image(width: Int = definedExternally, height: Int = definedExternally) : HTMLImageElement {
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

expect open class Audio(src: String = definedExternally) : HTMLAudioElement {
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
    val NETWORK_EMPTY: Short
    val NETWORK_IDLE: Short
    val NETWORK_LOADING: Short
    val NETWORK_NO_SOURCE: Short
    val HAVE_NOTHING: Short
    val HAVE_METADATA: Short
    val HAVE_CURRENT_DATA: Short
    val HAVE_FUTURE_DATA: Short
    val HAVE_ENOUGH_DATA: Short
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

/**
 * Exposes the JavaScript [Option](https://developer.mozilla.org/en/docs/Web/API/Option) to Kotlin
 */
expect open class Option(
  text: String = definedExternally,
  value: String = definedExternally,
  defaultSelected: Boolean = definedExternally,
  selected: Boolean = definedExternally
) : HTMLOptionElement {
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

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface DocumentReadyState {
  companion object
}

inline val DocumentReadyState.Companion.LOADING: DocumentReadyState
  get() = "loading".asDynamic().unsafeCast<DocumentReadyState>()

inline val DocumentReadyState.Companion.INTERACTIVE: DocumentReadyState
  get() = "interactive".asDynamic().unsafeCast<DocumentReadyState>()

inline val DocumentReadyState.Companion.COMPLETE: DocumentReadyState
  get() = "complete".asDynamic().unsafeCast<DocumentReadyState>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface CanPlayTypeResult {
  companion object
}

inline val CanPlayTypeResult.Companion.EMPTY: CanPlayTypeResult get() = "".asDynamic().unsafeCast<CanPlayTypeResult>()

inline val CanPlayTypeResult.Companion.MAYBE: CanPlayTypeResult
  get() = "maybe".asDynamic().unsafeCast<CanPlayTypeResult>()

inline val CanPlayTypeResult.Companion.PROBABLY: CanPlayTypeResult
  get() = "probably".asDynamic().unsafeCast<CanPlayTypeResult>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface TextTrackMode {
  companion object
}

inline val TextTrackMode.Companion.DISABLED: TextTrackMode get() = "disabled".asDynamic().unsafeCast<TextTrackMode>()

inline val TextTrackMode.Companion.HIDDEN: TextTrackMode get() = "hidden".asDynamic().unsafeCast<TextTrackMode>()

inline val TextTrackMode.Companion.SHOWING: TextTrackMode get() = "showing".asDynamic().unsafeCast<TextTrackMode>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface TextTrackKind {
  companion object
}

inline val TextTrackKind.Companion.SUBTITLES: TextTrackKind get() = "subtitles".asDynamic().unsafeCast<TextTrackKind>()

inline val TextTrackKind.Companion.CAPTIONS: TextTrackKind get() = "captions".asDynamic().unsafeCast<TextTrackKind>()

inline val TextTrackKind.Companion.DESCRIPTIONS: TextTrackKind
  get() = "descriptions".asDynamic().unsafeCast<TextTrackKind>()

inline val TextTrackKind.Companion.CHAPTERS: TextTrackKind get() = "chapters".asDynamic().unsafeCast<TextTrackKind>()

inline val TextTrackKind.Companion.METADATA: TextTrackKind get() = "metadata".asDynamic().unsafeCast<TextTrackKind>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface SelectionMode {
  companion object
}

inline val SelectionMode.Companion.SELECT: SelectionMode get() = "select".asDynamic().unsafeCast<SelectionMode>()

inline val SelectionMode.Companion.START: SelectionMode get() = "start".asDynamic().unsafeCast<SelectionMode>()

inline val SelectionMode.Companion.END: SelectionMode get() = "end".asDynamic().unsafeCast<SelectionMode>()

inline val SelectionMode.Companion.PRESERVE: SelectionMode get() = "preserve".asDynamic().unsafeCast<SelectionMode>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface CanvasFillRule {
  companion object
}

inline val CanvasFillRule.Companion.NONZERO: CanvasFillRule get() = "nonzero".asDynamic().unsafeCast<CanvasFillRule>()

inline val CanvasFillRule.Companion.EVENODD: CanvasFillRule get() = "evenodd".asDynamic().unsafeCast<CanvasFillRule>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface ImageSmoothingQuality {
  companion object
}

inline val ImageSmoothingQuality.Companion.LOW: ImageSmoothingQuality
  get() = "low".asDynamic().unsafeCast<ImageSmoothingQuality>()

inline val ImageSmoothingQuality.Companion.MEDIUM: ImageSmoothingQuality
  get() = "medium".asDynamic().unsafeCast<ImageSmoothingQuality>()

inline val ImageSmoothingQuality.Companion.HIGH: ImageSmoothingQuality
  get() = "high".asDynamic().unsafeCast<ImageSmoothingQuality>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface CanvasLineCap {
  companion object
}

inline val CanvasLineCap.Companion.BUTT: CanvasLineCap get() = "butt".asDynamic().unsafeCast<CanvasLineCap>()

inline val CanvasLineCap.Companion.ROUND: CanvasLineCap get() = "round".asDynamic().unsafeCast<CanvasLineCap>()

inline val CanvasLineCap.Companion.SQUARE: CanvasLineCap get() = "square".asDynamic().unsafeCast<CanvasLineCap>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface CanvasLineJoin {
  companion object
}

inline val CanvasLineJoin.Companion.ROUND: CanvasLineJoin get() = "round".asDynamic().unsafeCast<CanvasLineJoin>()

inline val CanvasLineJoin.Companion.BEVEL: CanvasLineJoin get() = "bevel".asDynamic().unsafeCast<CanvasLineJoin>()

inline val CanvasLineJoin.Companion.MITER: CanvasLineJoin get() = "miter".asDynamic().unsafeCast<CanvasLineJoin>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface CanvasTextAlign {
  companion object
}

inline val CanvasTextAlign.Companion.START: CanvasTextAlign get() = "start".asDynamic().unsafeCast<CanvasTextAlign>()

inline val CanvasTextAlign.Companion.END: CanvasTextAlign get() = "end".asDynamic().unsafeCast<CanvasTextAlign>()

inline val CanvasTextAlign.Companion.LEFT: CanvasTextAlign get() = "left".asDynamic().unsafeCast<CanvasTextAlign>()

inline val CanvasTextAlign.Companion.RIGHT: CanvasTextAlign get() = "right".asDynamic().unsafeCast<CanvasTextAlign>()

inline val CanvasTextAlign.Companion.CENTER: CanvasTextAlign get() = "center".asDynamic().unsafeCast<CanvasTextAlign>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface CanvasTextBaseline {
  companion object
}

inline val CanvasTextBaseline.Companion.TOP: CanvasTextBaseline
  get() = "top".asDynamic().unsafeCast<CanvasTextBaseline>()

inline val CanvasTextBaseline.Companion.HANGING: CanvasTextBaseline
  get() = "hanging".asDynamic().unsafeCast<CanvasTextBaseline>()

inline val CanvasTextBaseline.Companion.MIDDLE: CanvasTextBaseline
  get() = "middle".asDynamic().unsafeCast<CanvasTextBaseline>()

inline val CanvasTextBaseline.Companion.ALPHABETIC: CanvasTextBaseline
  get() = "alphabetic".asDynamic().unsafeCast<CanvasTextBaseline>()

inline val CanvasTextBaseline.Companion.IDEOGRAPHIC: CanvasTextBaseline
  get() = "ideographic".asDynamic().unsafeCast<CanvasTextBaseline>()

inline val CanvasTextBaseline.Companion.BOTTOM: CanvasTextBaseline
  get() = "bottom".asDynamic().unsafeCast<CanvasTextBaseline>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface CanvasDirection {
  companion object
}

inline val CanvasDirection.Companion.LTR: CanvasDirection get() = "ltr".asDynamic().unsafeCast<CanvasDirection>()

inline val CanvasDirection.Companion.RTL: CanvasDirection get() = "rtl".asDynamic().unsafeCast<CanvasDirection>()

inline val CanvasDirection.Companion.INHERIT: CanvasDirection
  get() = "inherit".asDynamic().unsafeCast<CanvasDirection>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface ScrollRestoration {
  companion object
}

inline val ScrollRestoration.Companion.AUTO: ScrollRestoration
  get() = "auto".asDynamic().unsafeCast<ScrollRestoration>()

inline val ScrollRestoration.Companion.MANUAL: ScrollRestoration
  get() = "manual".asDynamic().unsafeCast<ScrollRestoration>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface ImageOrientation {
  companion object
}

inline val ImageOrientation.Companion.NONE: ImageOrientation get() = "none".asDynamic().unsafeCast<ImageOrientation>()

inline val ImageOrientation.Companion.FLIPY: ImageOrientation get() = "flipY".asDynamic().unsafeCast<ImageOrientation>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface PremultiplyAlpha {
  companion object
}

inline val PremultiplyAlpha.Companion.NONE: PremultiplyAlpha get() = "none".asDynamic().unsafeCast<PremultiplyAlpha>()

inline val PremultiplyAlpha.Companion.PREMULTIPLY: PremultiplyAlpha
  get() = "premultiply".asDynamic().unsafeCast<PremultiplyAlpha>()

inline val PremultiplyAlpha.Companion.DEFAULT: PremultiplyAlpha
  get() = "default".asDynamic().unsafeCast<PremultiplyAlpha>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface ColorSpaceConversion {
  companion object
}

inline val ColorSpaceConversion.Companion.NONE: ColorSpaceConversion
  get() = "none".asDynamic().unsafeCast<ColorSpaceConversion>()

inline val ColorSpaceConversion.Companion.DEFAULT: ColorSpaceConversion
  get() = "default".asDynamic().unsafeCast<ColorSpaceConversion>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface ResizeQuality {
  companion object
}

inline val ResizeQuality.Companion.PIXELATED: ResizeQuality get() = "pixelated".asDynamic().unsafeCast<ResizeQuality>()

inline val ResizeQuality.Companion.LOW: ResizeQuality get() = "low".asDynamic().unsafeCast<ResizeQuality>()

inline val ResizeQuality.Companion.MEDIUM: ResizeQuality get() = "medium".asDynamic().unsafeCast<ResizeQuality>()

inline val ResizeQuality.Companion.HIGH: ResizeQuality get() = "high".asDynamic().unsafeCast<ResizeQuality>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface BinaryType {
  companion object
}

inline val BinaryType.Companion.BLOB: BinaryType get() = "blob".asDynamic().unsafeCast<BinaryType>()

inline val BinaryType.Companion.ARRAYBUFFER: BinaryType get() = "arraybuffer".asDynamic().unsafeCast<BinaryType>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface WorkerType {
  companion object
}

inline val WorkerType.Companion.CLASSIC: WorkerType get() = "classic".asDynamic().unsafeCast<WorkerType>()

inline val WorkerType.Companion.MODULE: WorkerType get() = "module".asDynamic().unsafeCast<WorkerType>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface ShadowRootMode {
  companion object
}

inline val ShadowRootMode.Companion.OPEN: ShadowRootMode get() = "open".asDynamic().unsafeCast<ShadowRootMode>()

inline val ShadowRootMode.Companion.CLOSED: ShadowRootMode get() = "closed".asDynamic().unsafeCast<ShadowRootMode>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface ScrollBehavior {
  companion object
}

inline val ScrollBehavior.Companion.AUTO: ScrollBehavior get() = "auto".asDynamic().unsafeCast<ScrollBehavior>()

inline val ScrollBehavior.Companion.INSTANT: ScrollBehavior get() = "instant".asDynamic().unsafeCast<ScrollBehavior>()

inline val ScrollBehavior.Companion.SMOOTH: ScrollBehavior get() = "smooth".asDynamic().unsafeCast<ScrollBehavior>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface ScrollLogicalPosition {
  companion object
}

inline val ScrollLogicalPosition.Companion.START: ScrollLogicalPosition
  get() = "start".asDynamic().unsafeCast<ScrollLogicalPosition>()

inline val ScrollLogicalPosition.Companion.CENTER: ScrollLogicalPosition
  get() = "center".asDynamic().unsafeCast<ScrollLogicalPosition>()

inline val ScrollLogicalPosition.Companion.END: ScrollLogicalPosition
  get() = "end".asDynamic().unsafeCast<ScrollLogicalPosition>()

inline val ScrollLogicalPosition.Companion.NEAREST: ScrollLogicalPosition
  get() = "nearest".asDynamic().unsafeCast<ScrollLogicalPosition>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface CSSBoxType {
  companion object
}

inline val CSSBoxType.Companion.MARGIN: CSSBoxType get() = "margin".asDynamic().unsafeCast<CSSBoxType>()

inline val CSSBoxType.Companion.BORDER: CSSBoxType get() = "border".asDynamic().unsafeCast<CSSBoxType>()

inline val CSSBoxType.Companion.PADDING: CSSBoxType get() = "padding".asDynamic().unsafeCast<CSSBoxType>()

inline val CSSBoxType.Companion.CONTENT: CSSBoxType get() = "content".asDynamic().unsafeCast<CSSBoxType>()