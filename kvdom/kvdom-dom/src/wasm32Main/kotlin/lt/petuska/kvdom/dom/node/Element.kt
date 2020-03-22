package lt.petuska.kvdom.dom.node

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import kotlinx.wasm.jsinterop.Pointer
import kotlinx.wasm.jsinterop.stringLengthBytes
import kotlinx.wasm.jsinterop.stringPointer
import lt.petuska.kvdom.dom.util.getStringProperty

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Element
 */
actual open class Element(arena: Arena, index: Object) : Node(arena, index) {
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute
   */
  actual fun setAttribute(name: String, value: String) {
    js_Element_setAttribute(
      arena, index,
      stringPointer(name), stringLengthBytes(name),
      stringPointer(value), stringLengthBytes(value)
    )
  }
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute
   */
  actual fun removeAttribute(attrName: String) {
    js_Element_removeAttribute(
      arena, index,
      stringPointer(attrName), stringLengthBytes(attrName)
    )
  }
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttribute
   */
  actual fun getAttribute(attributeName: String): String? {
    val namePtr = stringPointer(attributeName)
    val nameLen = stringLengthBytes(attributeName)
    val attrLen = js_Element_getAttribute_length(
      arena, index,
      nameLen, namePtr
    )
    return if (attrLen < 0) {
      null
    } else {
      return Array(attrLen) {
        js_Element_getAttribute_char(arena, index, namePtr, nameLen, it).toChar()
      }.joinToString("")
    }
  }
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Element/tagName
   */
  actual val tagName: String
    get() = getStringProperty("tagName")!!
}

@SymbolName("kvdom_Element_setAttribute")
private external fun js_Element_setAttribute(
  arena: Arena,
  index: Object,
  attrPtr: Pointer,
  attrLen: Int,
  keyPtr: Pointer,
  keyLen: Int
)

@SymbolName("kvdom_Element_removeAttribute")
private external fun js_Element_removeAttribute(
  arena: Arena,
  index: Object,
  attrPtr: Pointer,
  attrLen: Int
)

@SymbolName("kvdom_Element_getAttribute_length")
private external fun js_Element_getAttribute_length(
  arena: Arena,
  index: Object,
  attrPtr: Pointer,
  attrLen: Int
): Int

@SymbolName("kvdom_Element_getAttribute_char")
private external fun js_Element_getAttribute_char(
  arena: Arena,
  index: Object,
  attrPtr: Pointer,
  attrLen: Int,
  charIndex: Int
): Int