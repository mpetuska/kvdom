package lt.petuska.kvdom.dom.w3c.dom.events


/**
 * Exposes the JavaScript [UIEvent](https://developer.mozilla.org/en/docs/Web/API/UIEvent) to Kotlin
 */
open external class UIEvent(type: String, eventInitDict: UIEventInit = definedExternally) : Event {
  open val view: Window?
  open val detail: Int
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

external interface UIEventInit : EventInit {
  var view: Window? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var detail: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun UIEventInit(
  view: Window? = null,
  detail: Int? = 0,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): UIEventInit {
  val o = js("({})")
  o["view"] = view
  o["detail"] = detail
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [FocusEvent](https://developer.mozilla.org/en/docs/Web/API/FocusEvent) to Kotlin
 */
open external class FocusEvent(type: String, eventInitDict: FocusEventInit = definedExternally) : UIEvent {
  open val relatedTarget: EventTarget?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

external interface FocusEventInit : UIEventInit {
  var relatedTarget: EventTarget? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun FocusEventInit(
  relatedTarget: EventTarget? = null,
  view: Window? = null,
  detail: Int? = 0,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): FocusEventInit {
  val o = js("({})")
  o["relatedTarget"] = relatedTarget
  o["view"] = view
  o["detail"] = detail
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [MouseEvent](https://developer.mozilla.org/en/docs/Web/API/MouseEvent) to Kotlin
 */
open external class MouseEvent(type: String, eventInitDict: MouseEventInit = definedExternally) : UIEvent,
  UnionElementOrMouseEvent {
  open val screenX: Int
  open val screenY: Int
  open val clientX: Int
  open val clientY: Int
  open val ctrlKey: Boolean
  open val shiftKey: Boolean
  open val altKey: Boolean
  open val metaKey: Boolean
  open val button: Short
  open val buttons: Short
  open val relatedTarget: EventTarget?
  open val region: String?
  open val pageX: Double
  open val pageY: Double
  open val x: Double
  open val y: Double
  open val offsetX: Double
  open val offsetY: Double
  fun getModifierState(keyArg: String): Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

external interface MouseEventInit : EventModifierInit {
  var screenX: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var screenY: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var clientX: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var clientY: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var button: Short? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var buttons: Short? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var relatedTarget: EventTarget? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var region: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun MouseEventInit(
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
): MouseEventInit {
  val o = js("({})")
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

external interface EventModifierInit : UIEventInit {
  var ctrlKey: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var shiftKey: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var altKey: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var metaKey: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var modifierAltGraph: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var modifierCapsLock: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var modifierFn: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var modifierFnLock: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var modifierHyper: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var modifierNumLock: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var modifierScrollLock: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var modifierSuper: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var modifierSymbol: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var modifierSymbolLock: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun EventModifierInit(
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
): EventModifierInit {
  val o = js("({})")
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
 * Exposes the JavaScript [WheelEvent](https://developer.mozilla.org/en/docs/Web/API/WheelEvent) to Kotlin
 */
open external class WheelEvent(type: String, eventInitDict: WheelEventInit = definedExternally) : MouseEvent {
  open val deltaX: Double
  open val deltaY: Double
  open val deltaZ: Double
  open val deltaMode: Int
  
  companion object {
    val DOM_DELTA_PIXEL: Int
    val DOM_DELTA_LINE: Int
    val DOM_DELTA_PAGE: Int
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

external interface WheelEventInit : MouseEventInit {
  var deltaX: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var deltaY: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var deltaZ: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var deltaMode: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun WheelEventInit(
  deltaX: Double? = 0.0,
  deltaY: Double? = 0.0,
  deltaZ: Double? = 0.0,
  deltaMode: Int? = 0,
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
): WheelEventInit {
  val o = js("({})")
  o["deltaX"] = deltaX
  o["deltaY"] = deltaY
  o["deltaZ"] = deltaZ
  o["deltaMode"] = deltaMode
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
 * Exposes the JavaScript [InputEvent](https://developer.mozilla.org/en/docs/Web/API/InputEvent) to Kotlin
 */
open external class InputEvent(type: String, eventInitDict: InputEventInit = definedExternally) : UIEvent {
  open val data: String
  open val isComposing: Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

external interface InputEventInit : UIEventInit {
  var data: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var isComposing: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun InputEventInit(
  data: String? = "",
  isComposing: Boolean? = false,
  view: Window? = null,
  detail: Int? = 0,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): InputEventInit {
  val o = js("({})")
  o["data"] = data
  o["isComposing"] = isComposing
  o["view"] = view
  o["detail"] = detail
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [KeyboardEvent](https://developer.mozilla.org/en/docs/Web/API/KeyboardEvent) to Kotlin
 */
open external class KeyboardEvent(type: String, eventInitDict: KeyboardEventInit = definedExternally) : UIEvent {
  open val key: String
  open val code: String
  open val location: Int
  open val ctrlKey: Boolean
  open val shiftKey: Boolean
  open val altKey: Boolean
  open val metaKey: Boolean
  open val repeat: Boolean
  open val isComposing: Boolean
  open val charCode: Int
  open val keyCode: Int
  open val which: Int
  fun getModifierState(keyArg: String): Boolean
  
  companion object {
    val DOM_KEY_LOCATION_STANDARD: Int
    val DOM_KEY_LOCATION_LEFT: Int
    val DOM_KEY_LOCATION_RIGHT: Int
    val DOM_KEY_LOCATION_NUMPAD: Int
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

external interface KeyboardEventInit : EventModifierInit {
  var key: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var code: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var location: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var repeat: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var isComposing: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun KeyboardEventInit(
  key: String? = "",
  code: String? = "",
  location: Int? = 0,
  repeat: Boolean? = false,
  isComposing: Boolean? = false,
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
): KeyboardEventInit {
  val o = js("({})")
  o["key"] = key
  o["code"] = code
  o["location"] = location
  o["repeat"] = repeat
  o["isComposing"] = isComposing
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
 * Exposes the JavaScript [CompositionEvent](https://developer.mozilla.org/en/docs/Web/API/CompositionEvent) to Kotlin
 */
open external class CompositionEvent(type: String, eventInitDict: CompositionEventInit = definedExternally) :
  UIEvent {
  open val data: String
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

external interface CompositionEventInit : UIEventInit {
  var data: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
inline fun CompositionEventInit(
  data: String? = "",
  view: Window? = null,
  detail: Int? = 0,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): CompositionEventInit {
  val o = js("({})")
  o["data"] = data
  o["view"] = view
  o["detail"] = detail
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [EventTarget](https://developer.mozilla.org/en/docs/Web/API/EventTarget) to Kotlin
 */
abstract external class EventTarget {
  fun addEventListener(type: String, callback: EventListener?, options: dynamic = definedExternally)
  fun addEventListener(type: String, callback: ((Event) -> Unit)?, options: dynamic = definedExternally)
  fun removeEventListener(type: String, callback: EventListener?, options: dynamic = definedExternally)
  fun removeEventListener(type: String, callback: ((Event) -> Unit)?, options: dynamic = definedExternally)
  fun dispatchEvent(event: Event): Boolean
}

/**
 * Exposes the JavaScript [EventListener](https://developer.mozilla.org/en/docs/Web/API/EventListener) to Kotlin
 */
external interface EventListener {
  fun handleEvent(event: Event)
}