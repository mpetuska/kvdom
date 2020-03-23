package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.files.FileList

/**
 * Exposes the JavaScript [HTMLInputElement](https://developer.mozilla.org/en/docs/Web/API/HTMLInputElement) to Kotlin
 */
@NoWASM
actual abstract class HTMLInputElement : HTMLElement() {
  actual open var accept: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var alt: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var autocomplete: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var autofocus: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var defaultChecked: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var checked: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var dirName: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var disabled: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open val form: HTMLFormElement?
    get() {
      TODO()
    }
  actual open val files: FileList?
    get() {
      TODO()
    }
  actual open var formAction: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var formEnctype: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var formMethod: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var formNoValidate: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var formTarget: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var height: Int
    get() {
      TODO()
    }
    set(value) {}
  actual open var indeterminate: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var inputMode: String
    get() {
      TODO()
    }
    set(value) {}
  actual open val list: HTMLElement?
    get() {
      TODO()
    }
  actual open var max: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var maxLength: Int
    get() {
      TODO()
    }
    set(value) {}
  actual open var min: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var minLength: Int
    get() {
      TODO()
    }
    set(value) {}
  actual open var multiple: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var name: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var pattern: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var placeholder: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var readOnly: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var required: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open var size: Int
    get() {
      TODO()
    }
    set(value) {}
  actual open var src: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var step: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var type: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var defaultValue: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var value: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var valueAsDate: Dynamic
    get() {
      TODO()
    }
    set(value) {}
  actual open var valueAsNumber: Double
    get() {
      TODO()
    }
    set(value) {}
  actual open var width: Int
    get() {
      TODO()
    }
    set(value) {}
  actual open val willValidate: Boolean
    get() {
      TODO()
    }
  actual open val validity: ValidityState
    get() {
      TODO()
    }
  actual open val validationMessage: String
    get() {
      TODO()
    }
  actual open val labels: NodeList
    get() {
      TODO()
    }
  actual open var selectionStart: Int?
    get() {
      TODO()
    }
    set(value) {}
  actual open var selectionEnd: Int?
    get() {
      TODO()
    }
    set(value) {}
  actual open var selectionDirection: String?
    get() {
      TODO()
    }
    set(value) {}
  actual open var align: String
    get() {
      TODO()
    }
    set(value) {}
  actual open var useMap: String
    get() {
      TODO()
    }
    set(value) {}
  
  actual fun stepUp(n: Int) {
    TODO()
  }
  
  actual fun stepDown(n: Int) {
    TODO()
  }
  
  actual fun checkValidity(): Boolean {
    TODO()
  }
  
  actual fun reportValidity(): Boolean {
    TODO()
  }
  
  actual fun setCustomValidity(error: String) {
    TODO()
  }
  
  actual fun select() {
    TODO()
  }
  
  actual fun setRangeText(replacement: String) {
    TODO()
  }
  
  actual fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode) {
    TODO()
  }
  
  actual fun setSelectionRange(start: Int, end: Int, direction: String) {
    TODO()
  }
  
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