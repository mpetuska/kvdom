package lt.petuska.kvdom.dom.event

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.JsValue
import kotlinx.wasm.jsinterop.Object
import lt.petuska.kvdom.dom.util.getStringProperty

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Event
 */
actual open class Event<T : EventTarget>(arena: Arena, index: Object, target: T) : JsValue(arena, index) {
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Event/target
   */
  actual val target: T = target
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Event/type
   */
  actual val type: EventType get() = getStringProperty("type")!!
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault
   */
  actual fun preventDefault() {
    js_Event_preventDefault(arena, index)
  }
}

@SymbolName("kvdom_Event_preventDefault")
private external fun js_Event_preventDefault(
  arena: Arena,
  index: Object
)