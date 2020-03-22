package lt.petuska.kvdom.dom.node

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object
import kotlinx.wasm.jsinterop.Pointer
import kotlinx.wasm.jsinterop.allocateArena
import kotlinx.wasm.jsinterop.freeArena
import kotlinx.wasm.jsinterop.stringLengthBytes
import kotlinx.wasm.jsinterop.stringPointer
import lt.petuska.kvdom.dom.node.html.HTMLAnchorElement
import lt.petuska.kvdom.dom.node.html.HTMLButtonElement
import lt.petuska.kvdom.dom.node.html.HTMLDivElement
import lt.petuska.kvdom.dom.node.html.HTMLHRElement
import lt.petuska.kvdom.dom.node.html.HTMLHeadingElement
import lt.petuska.kvdom.dom.node.html.HTMLInputElement
import lt.petuska.kvdom.dom.node.html.HTMLLabelElement

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Document
 */
actual class Document(arena: Arena, index: Object) : Node(arena, index) {
  private fun castElementByTag(arena: Arena, index: Object, tag: String) = when (tag.toLowerCase()) {
    "a" -> HTMLAnchorElement(arena, index)
    "div" -> HTMLDivElement(arena, index)
    "input" -> HTMLInputElement(arena, index)
    "button" -> HTMLButtonElement(arena, index)
    "label" -> HTMLLabelElement(arena, index)
    "hr" -> HTMLHRElement(arena, index)
    "h1", "h2", "h3", "h4", "h5", "h6" -> HTMLHeadingElement(arena, index)
    else -> Element(arena, index)
  }
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementById
   */
  actual fun getElementById(id: String): Element? {
    return allocateArena().let { newArena ->
      js_Document_getElementById(
        arena, index,
        stringPointer(id),
        stringLengthBytes(id),
        newArena
      ).let {
        if (it < 0) {
          null.also {
            freeArena(newArena)
          }
        } else {
          castElementByTag(newArena, it, Element(newArena, it).tagName)
        }
      }
    }
  }
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement
   */
  actual fun createElement(tagName: String): Element {
    return allocateArena().let { newArena ->
      js_Document_createElement(
        arena, index,
        stringPointer(tagName),
        stringLengthBytes(tagName),
        newArena
      ).let {
        castElementByTag(newArena, it, tagName)
      }
    }
  }
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Document/createTextNode
   */
  actual fun createTextNode(data: String): Text {
    return allocateArena().let { newArena ->
      js_Document_createTextNode(
        arena, index,
        stringPointer(data),
        stringLengthBytes(data),
        newArena
      ).let {
        Text(newArena, it)
      }
    }
  }
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Document/defaultView
   */
  actual val defaultView: Window?
    get() = js_Document_defaultView(arena, index).let {
      if (it < 0) {
        null
      } else {
        Window(arena, js_Document_defaultView(arena, index))
      }
    }
}

@SymbolName("kvdom_Document_getElementById")
private external fun js_Document_getElementById(
  arena: Arena,
  index: Object,
  idPtr: Pointer,
  idLen: Int,
  resultArena: Arena
): Object

@SymbolName("kvdom_Document_createElement")
private external fun js_Document_createElement(
  arena: Arena,
  index: Object,
  tagPtr: Pointer,
  tagLen: Int,
  resultArena: Arena
): Object

@SymbolName("kvdom_Document_createTextNode")
private external fun js_Document_createTextNode(
  arena: Arena,
  index: Object,
  textPtr: Pointer,
  textLen: Int,
  resultArena: Arena
): Object

@SymbolName("kvdom_Document_defaultView")
private external fun js_Document_defaultView(
  arena: Arena,
  index: Object
): Object