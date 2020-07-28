package lt.petuska.kvdom.dom

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.JsValue
import kotlinx.wasm.jsinterop.Object

actual open class Event(arena: Arena, index: Object) : JsValue(arena, index) {
  actual fun preventDefault() {
    js_preventDefault(arena, index)
  }
  
  actual fun initEvent(type: String, bubbles: Boolean, cancelable: Boolean) {
    TODO()
  }
  
  actual fun stopPropagation() {
    TODO()
  }
  
}

@SymbolName("kvdom_Event_preventDefault")
private external fun js_preventDefault(
  arena: Arena,
  index: Object,
)
