package lt.petuska.kvdom.definitions.dom

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.JsValue
import kotlinx.wasm.jsinterop.Object


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget
 */
actual interface EventTarget

actual open class EventTargetImpl(arena: Arena, index: Object) : JsValue(arena, index), EventTarget