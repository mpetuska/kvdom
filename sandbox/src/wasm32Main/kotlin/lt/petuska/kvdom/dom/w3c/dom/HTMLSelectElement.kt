package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [HTMLSelectElement](https://developer.mozilla.org/en/docs/Web/API/HTMLSelectElement) to Kotlin
 */
@NoWASM
actual abstract class HTMLSelectElement : HTMLElement(), ItemArrayLike<Element> {
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
  actual open var disabled: Boolean
    get() {
      TODO()
    }
    set(value) {}
  actual open val form: HTMLFormElement?
    get() {
      TODO()
    }
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
  actual open val type: String
    get() {
      TODO()
    }
  actual open val options: HTMLOptionsCollection
    get() {
      TODO()
    }
  actual override var length: Int
    get() {
      TODO()
    }
    set(value) {}
  actual open val selectedOptions: HTMLCollection
    get() {
      TODO()
    }
  actual open var selectedIndex: Int
    get() {
      TODO()
    }
    set(value) {}
  actual open var value: String
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
  
  actual fun namedItem(name: String): HTMLOptionElement? {
    TODO()
  }
  
  actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Dynamic) {
    TODO()
  }
  
  actual fun remove(index: Int) {
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
  
  actual override fun item(index: Int): Element? {
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

@NoWASM
actual operator fun HTMLSelectElement.get(index: Int): Element? {
  TODO("Not yet implemented")
}

@NoWASM
actual operator fun HTMLSelectElement.set(
  index: Int,
  option: HTMLOptionElement?
) {
}