package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [HTMLObjectElement](https://developer.mozilla.org/en/docs/Web/API/HTMLObjectElement) to Kotlin
 */
actual abstract class HTMLObjectElement actual constructor() : HTMLElement() {
  actual open var data: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var type: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var typeMustMatch: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var name: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var useMap: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val form: HTMLFormElement?
    get() = TODO("Not yet implemented")
  actual open var width: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var height: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val contentDocument: Document?
    get() = TODO("Not yet implemented")
  actual open val contentWindow: Window?
    get() = TODO("Not yet implemented")
  actual open val willValidate: Boolean
    get() = TODO("Not yet implemented")
  actual open val validity: ValidityState
    get() = TODO("Not yet implemented")
  actual open val validationMessage: String
    get() = TODO("Not yet implemented")
  actual open var align: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var archive: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var code: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var declare: Boolean
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var hspace: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var standby: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var vspace: Int
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var codeBase: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var codeType: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var border: String
    get() = TODO("Not yet implemented")
    set(value) {}
  
  actual fun getSVGDocument(): Document? {
    TODO("Not yet implemented")
  }
  
  actual fun checkValidity(): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun reportValidity(): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun setCustomValidity(error: String) {
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