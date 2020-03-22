package lt.petuska.kvdom.dom.w3c.dom.events


//import kotlin.js.*
//import org.khronos.webgl.*
//import org.w3c.css.masking.*
import lt.petuska.kvdom.dom.w3c.dom.EventInit
import lt.petuska.kvdom.dom.w3c.dom.UnionElementOrMouseEvent
import lt.petuska.kvdom.dom.w3c.dom.Window

//import org.w3c.dom.clipboard.*
//import org.w3c.dom.css.*
//import org.w3c.dom.mediacapture.*
//import org.w3c.dom.parsing.*
//import org.w3c.dom.pointerevents.*
//import org.w3c.dom.svg.*
//import org.w3c.dom.url.*
//import org.w3c.fetch.*
//import org.w3c.files.*
//import org.w3c.notifications.*
//import org.w3c.performance.*
//import org.w3c.workers.*
//import org.w3c.xhr.*

/**
 * Exposes the JavaScript [UIEvent](https://developer.mozilla.org/en/docs/Web/API/UIEvent) to Kotlin
 */
expect open class UIEvent(type: String, eventInitDict: UIEventInit) : Event {
  open val view: Window?
  open val detail: Int
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface UIEventInit : EventInit {
  var view: Window? /* = null */
  var detail: Int? /* = 0 */
}

inline fun UIEventInit(
  view: Window? = null,
  detail: Int? = 0,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): UIEventInit = object : UIEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var view: Window? = view
  override var detail: Int? = detail
}

/**
 * Exposes the JavaScript [FocusEvent](https://developer.mozilla.org/en/docs/Web/API/FocusEvent) to Kotlin
 */
expect open class FocusEvent(type: String, eventInitDict: FocusEventInit) : UIEvent {
  open val relatedTarget: EventTarget?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface FocusEventInit : UIEventInit {
  var relatedTarget: EventTarget? /* = null */
}

inline fun FocusEventInit(
  relatedTarget: EventTarget? = null,
  view: Window? = null,
  detail: Int? = 0,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): FocusEventInit = object : FocusEventInit, UIEventInit by UIEventInit(view, detail, bubbles, cancelable, composed) {
  override var relatedTarget: EventTarget? = relatedTarget
}

/**
 * Exposes the JavaScript [MouseEvent](https://developer.mozilla.org/en/docs/Web/API/MouseEvent) to Kotlin
 */
expect open class MouseEvent(type: String, eventInitDict: MouseEventInit) : UIEvent,
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

expect external interface MouseEventInit : EventModifierInit {
  var screenX: Int? /* = 0 */
  var screenY: Int? /* = 0 */
  var clientX: Int? /* = 0 */
  var clientY: Int? /* = 0 */
  var button: Short? /* = 0 */
  var buttons: Short? /* = 0 */
  var relatedTarget: EventTarget? /* = null */
  var region: String? /* = null */
}

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
): MouseEventInit =
  object : MouseEventInit, EventModifierInit by EventModifierInit(
    ctrlKey,
    shiftKey,
    altKey,
    metaKey,
    modifierAltGraph,
    modifierCapsLock,
    modifierFn,
    modifierFnLock,
    modifierHyper,
    modifierNumLock,
    modifierScrollLock,
    modifierSuper,
    modifierSymbol,
    modifierSymbolLock,
    view,
    detail,
    bubbles,
    cancelable,
    composed
  ) {
    override var screenX: Int? = screenX
    override var screenY: Int? = screenY
    override var clientX: Int? = clientX
    override var clientY: Int? = clientY
    override var button: Short? = button
    override var buttons: Short? = buttons
    override var relatedTarget: EventTarget? = relatedTarget
    override var region: String? = region
  }

expect interface EventModifierInit : UIEventInit {
  var ctrlKey: Boolean? /* = false */
  var shiftKey: Boolean? /* = false */
  var altKey: Boolean? /* = false */
  var metaKey: Boolean? /* = false */
  var modifierAltGraph: Boolean? /* = false */
  var modifierCapsLock: Boolean? /* = false */
  var modifierFn: Boolean? /* = false */
  var modifierFnLock: Boolean? /* = false */
  var modifierHyper: Boolean? /* = false */
  var modifierNumLock: Boolean? /* = false */
  var modifierScrollLock: Boolean? /* = false */
  var modifierSuper: Boolean? /* = false */
  var modifierSymbol: Boolean? /* = false */
  var modifierSymbolLock: Boolean? /* = false */
}

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
): EventModifierInit =
  object : EventModifierInit, UIEventInit by UIEventInit(view, detail, bubbles, cancelable, composed) {
    override var ctrlKey: Boolean? = ctrlKey
    override var shiftKey: Boolean? = shiftKey
    override var altKey: Boolean? = altKey
    override var metaKey: Boolean? = metaKey
    override var modifierAltGraph: Boolean? = modifierAltGraph
    override var modifierCapsLock: Boolean? = modifierCapsLock
    override var modifierFn: Boolean? = modifierFn
    override var modifierFnLock: Boolean? = modifierFnLock
    override var modifierHyper: Boolean? = modifierHyper
    override var modifierNumLock: Boolean? = modifierNumLock
    override var modifierScrollLock: Boolean? = modifierScrollLock
    override var modifierSuper: Boolean? = modifierSuper
    override var modifierSymbol: Boolean? = modifierSymbol
    override var modifierSymbolLock: Boolean? = modifierSymbolLock
  }

/**
 * Exposes the JavaScript [WheelEvent](https://developer.mozilla.org/en/docs/Web/API/WheelEvent) to Kotlin
 */
expect open class WheelEvent(type: String, eventInitDict: WheelEventInit) : MouseEvent {
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

expect interface WheelEventInit : MouseEventInit {
  var deltaX: Double? /* = 0.0 */
  var deltaY: Double? /* = 0.0 */
  var deltaZ: Double? /* = 0.0 */
  var deltaMode: Int? /* = 0 */
}

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
): WheelEventInit = object : WheelEventInit, MouseEventInit by MouseEventInit(
  screenX,
  screenY,
  clientX,
  clientY,
  button,
  buttons,
  relatedTarget,
  region,
  ctrlKey,
  shiftKey,
  altKey,
  metaKey,
  modifierAltGraph,
  modifierCapsLock,
  modifierFn,
  modifierFnLock,
  modifierHyper,
  modifierNumLock,
  modifierScrollLock,
  modifierSuper,
  modifierSymbol,
  modifierSymbolLock,
  view,
  detail,
  bubbles,
  cancelable,
  composed
) {
  override var deltaX: Double? = deltaX
  override var deltaY: Double? = deltaY
  override var deltaZ: Double? = deltaZ
  override var deltaMode: Int? = deltaMode
}

/**
 * Exposes the JavaScript [InputEvent](https://developer.mozilla.org/en/docs/Web/API/InputEvent) to Kotlin
 */
expect open class InputEvent(type: String, eventInitDict: InputEventInit) : UIEvent {
  open val data: String
  open val isComposing: Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface InputEventInit : UIEventInit {
  var data: String? /* = "" */
  var isComposing: Boolean? /* = false */
}

inline fun InputEventInit(
  data: String? = "",
  isComposing: Boolean? = false,
  view: Window? = null,
  detail: Int? = 0,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): InputEventInit = object : InputEventInit, UIEventInit by UIEventInit(view, detail, bubbles, cancelable, composed) {
  override var data: String? = data
  override var isComposing: Boolean? = isComposing
}

/**
 * Exposes the JavaScript [KeyboardEvent](https://developer.mozilla.org/en/docs/Web/API/KeyboardEvent) to Kotlin
 */
expect open class KeyboardEvent(type: String, eventInitDict: KeyboardEventInit) : UIEvent {
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

expect interface KeyboardEventInit : EventModifierInit {
  var key: String? /* = "" */
  var code: String? /* = "" */
  var location: Int? /* = 0 */
  var repeat: Boolean? /* = false */
  var isComposing: Boolean? /* = false */
}

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
): KeyboardEventInit = object : KeyboardEventInit, EventModifierInit by EventModifierInit(
  ctrlKey,
  shiftKey,
  altKey,
  metaKey,
  modifierAltGraph,
  modifierCapsLock,
  modifierFn,
  modifierFnLock,
  modifierHyper,
  modifierNumLock,
  modifierScrollLock,
  modifierSuper,
  modifierSymbol,
  modifierSymbolLock,
  view,
  detail,
  bubbles,
  cancelable,
  composed
) {
  override var key: String? = key
  override var code: String? = code
  override var location: Int? = location
  override var repeat: Boolean? = repeat
  override var isComposing: Boolean? = isComposing
}

/**
 * Exposes the JavaScript [CompositionEvent](https://developer.mozilla.org/en/docs/Web/API/CompositionEvent) to Kotlin
 */
expect open class CompositionEvent(type: String, eventInitDict: CompositionEventInit) :
  UIEvent {
  open val data: String
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

expect interface CompositionEventInit : UIEventInit {
  var data: String? /* = "" */
}

inline fun CompositionEventInit(
  data: String? = "",
  view: Window? = null,
  detail: Int? = 0,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): CompositionEventInit =
  object : CompositionEventInit, UIEventInit by UIEventInit(view, detail, bubbles, cancelable, composed) {
    override var data: String? = data
  }

/**
 * Exposes the JavaScript [Event](https://developer.mozilla.org/en/docs/Web/API/Event) to Kotlin
 */
expect open class Event(type: String, eventInitDict: EventInit) {
  open val type: String
  open val target: EventTarget?
  open val currentTarget: EventTarget?
  open val eventPhase: Short
  open val bubbles: Boolean
  open val cancelable: Boolean
  open val defaultPrevented: Boolean
  open val composed: Boolean
  open val isTrusted: Boolean
  open val timeStamp: Number
  fun composedPath(): Array<EventTarget>
  fun stopPropagation()
  fun stopImmediatePropagation()
  fun preventDefault()
  fun initEvent(type: String, bubbles: Boolean, cancelable: Boolean)
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

/**
 * Exposes the JavaScript [EventTarget](https://developer.mozilla.org/en/docs/Web/API/EventTarget) to Kotlin
 */
expect abstract class EventTarget {
  fun addEventListener(type: String, callback: EventListener?, options: Any)
  fun addEventListener(type: String, callback: ((Event) -> Unit)?, options: Any)
  fun removeEventListener(type: String, callback: EventListener?, options: Any)
  fun removeEventListener(type: String, callback: ((Event) -> Unit)?, options: Any)
  fun dispatchEvent(event: Event): Boolean
}

/**
 * Exposes the JavaScript [EventListener](https://developer.mozilla.org/en/docs/Web/API/EventListener) to Kotlin
 */
expect interface EventListener {
  fun handleEvent(event: Event)
}